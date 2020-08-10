package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;
import java.text.Collator;
import java.util.Enumeration;

/**
 * Comparison by CollationKeys.
 *
 * @see LessCollationKey
 * @see LessEqualCollationKey
 * @see GreaterCollationKey
 * @see GreaterEqualCollationKey
 * @see Collator
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Collate1
  {
  public static void show( String tag, Collator collator )
    {
    // allow duplicates in set
    OrderedSet set = new OrderedSet( new LessCollationKey( collator ), true );

    // add a few entries
    set.add( "Texas" );
    set.add( "texas" );
    set.add( "Texas Fight" );

    // print the resulting container
    System.out.println( tag );
    Enumeration iterator = set.begin();
    while ( iterator.hasMoreElements() )
      System.out.println( "\t" + iterator.nextElement() );
    }

  public static void main( String args[] )
    {
    Collator collator = Collator.getInstance();
    show( "default collating", collator );

    collator.setStrength( Collator.PRIMARY );
    show( "case insensitive", collator );
    }
  }
