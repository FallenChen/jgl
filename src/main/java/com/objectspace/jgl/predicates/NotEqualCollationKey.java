// Copyright(c) 1997 ObjectSpace, Inc.

package com.objectspace.jgl.predicates;

import com.objectspace.jgl.*;
import java.text.Collator;
import java.text.CollationKey;

/**
 * NotEqualCollationKey is a binary predicate that returns true
 * if the first operand as a string is not equal to the
 * second operand as a string when compared using the given Collator object.
 * Instead of using the compare() call, getCollationKey() is used and the
 * results of that are compared.
 * If either operand is itself a CollationKey object, then that operand is
 * used without getting a new key from the collator.
 * <p>
 * If an explicit Collator object is not given, the default is used.
 * <p>
 * @see Collator
 * @see CollationKey
 * @see com.objectspace.jgl.examples.CollateExamples
 * @version 3.1.0
 * @author ObjectSpace, Inc.
 */

public final class NotEqualCollationKey implements BinaryPredicate
  {
  Collator collator;

  /**
   * Construct a NotEqualCollationKey function object that uses the collator
   * object for the current default locale to compare operands that are not
   * instances of CollationKey.
   */
  public NotEqualCollationKey()
    {
    collator = Collator.getInstance();
    }

  /**
   * Construct a NotEqualCollationKey function object that uses the given collator
   * object to compare operands that are not instances of CollationKey.
   * @param collator The Collator object that is to be used for comparisons.
   */
  public NotEqualCollationKey( Collator collator )
    {
    this.collator = collator;
    }

  /**
   * Return true if the first operand is not equal to the second operand.
   * <STRONG>Note:</STRONG> CollationKeys created by different Collators can 
   * not be compared.
   * @see CollationKey#compareTo
   * @param first The first operand.
   * @param second The second operand.
   * @return true if the sort key of the first operand is not equal to that of the second.
   */
  public boolean execute( Object first, Object second )
    {
    CollationKey firstKey = first instanceof CollationKey
      ? (CollationKey)first
      : collator.getCollationKey( first.toString() );
    CollationKey secondKey = second instanceof CollationKey
      ? (CollationKey)second
      : collator.getCollationKey( second.toString() );
    return firstKey.compareTo( secondKey ) != 0;
    }

  static final long serialVersionUID = 5720104627064807029L;
  }
