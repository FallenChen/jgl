package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;
import java.text.Collator;

/**
 * Comparison using Collator objects.
 *
 * @see LessCollator
 * @see LessEqualCollator
 * @see GreaterCollator
 * @see GreaterEqualCollator
 * @see Collator
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Collate3
  {
  public static void show( String tag, BinaryPredicate predicate )
    {
    // create a set with given comparitor that allows duplicates
    OrderedSet set = new OrderedSet( predicate, true );

    // add a few entries
    set.add( "Texas" );
    set.add( "texas" );
    set.add( "Texas Fight" );

    // print the resulting container
    System.out.println( tag + "\n\t" + set );
    }

  public static void main( String args[] )
    {
    show( "old style", new LessString() );
    show( "default collating", new LessCollator() );

    Collator collator = Collator.getInstance();
    collator.setStrength( Collator.PRIMARY );
    show( "case insensitive", new LessCollator( collator ) );
    }
  }
