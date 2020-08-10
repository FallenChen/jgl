package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;
import java.text.Collator;
import java.text.CollationKey;
import java.util.Enumeration;

/**
 * Comparison of CollationKeys.
 *
 * @see LessCollationKey
 * @see LessEqualCollationKey
 * @see GreaterCollationKey
 * @see GreaterEqualCollationKey
 * @see Collator
 * @see CollationKey
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Collate2
  {
  public static void show( String tag, Collator collator )
    {
    // allow duplicates in set
    OrderedSet set = new OrderedSet( new LessCollationKey(), true );

    // add a few entries
    set.add( collator.getCollationKey( "Texas" ) );
    set.add( collator.getCollationKey( "texas" ) );
    set.add( collator.getCollationKey( "Texas Fight" ) );

    // print the resulting container
    System.out.println( tag );
    Enumeration iterator = set.begin();
    while ( iterator.hasMoreElements() )
      System.out.println( "\t" + ( (CollationKey)iterator.nextElement() ).getSourceString() );
    }

  public static void main( String args[] )
    {
    Collator collator = Collator.getInstance();
    show( "default collating", collator );

    collator.setStrength( Collator.PRIMARY );
    show( "case insensitive", collator );
    }
  }
