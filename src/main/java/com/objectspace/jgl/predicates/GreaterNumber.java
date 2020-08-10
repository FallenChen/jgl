// Copyright(c) 1996,1997 ObjectSpace, Inc.
// Portions Copyright(c) 1995, 1996 Hewlett-Packard Company.

package com.objectspace.jgl.predicates;

import com.objectspace.jgl.*;

/**
 * GreaterNumber is a binary predicate that assumes that both of its operands are
 * instances of Number and returns true if the first operand is greater than the second operand.
 * <p>
 * @see Number
 * @see java.math.BigInteger
 * @see java.math.BigDecimal
 * @version 3.1.0
 * @author ObjectSpace, Inc.
 */

public class GreaterNumber implements BinaryPredicate
  {
  private Class mode;

  /**
   * Construct myself to use intValue() for comparisons.
   */
  public GreaterNumber()
    {
    mode = Integer.class;
    }

  /**
   * Construct myself to compare objects of the given class.  The class must
   * be derived from java.lang.Number.
   * @param discriminator The class of objects that I will be comparing.
   * @exception IllegalArgumentException Throw if discriminator is not an instance of java.lang.Number.
   */
  public GreaterNumber( Class discriminator )
    {
    if ( !Number.class.isAssignableFrom( discriminator ) )
      throw new IllegalArgumentException( "discriminator must be an instance of java.lang.Number" );
    mode = discriminator;
    }

  /**
   * Return true if the first operand is greater than the second operand.
   * Be aware that some floating point conversions are not exact, and may
   * cause unexpected results due to rounding.
   * @param first The first operand, which must be an instance of Number.
   * @param second The second operand, which must be an instance of Number.
   * @exception InvalidOperationException Throw if I don't know how to interpret the values.
   * @return first < second
   */
  public boolean execute( Object first, Object second )
    {
    return NumberHelper.compare( (Number)first, (Number)second, mode ) > 0;
    }

  static final long serialVersionUID = 8437920225851334024L;
  }
