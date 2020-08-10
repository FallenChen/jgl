package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

/**
 * Union, intersection, difference, symmetric difference, subset.
 *
 * @see com.objectspace.jgl,OrderedSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedSet3
  {
  public static void main( String[] args )
    {
    OrderedSet set1 = new OrderedSet( new LessString() );
    set1.add( "ape" );
    set1.add( "cat" );
    set1.add( "bat" );

    OrderedSet set2 = new OrderedSet();
    set2.add( "bat" );
    set2.add( "fox" );
    set2.add( "ape" );
    System.out.println( "set1 = " + set1 + ", set2 = " + set2 );

    OrderedSet set3 = set1.union( set2 );
    System.out.println( "set3 = set1.union( set2 ) = " + set3 );

    OrderedSet set4 = set1.intersection( set2 );
    System.out.println( "set4 = set1.intersection( set2 ) = " + set4 );

    OrderedSet set5 = set1.difference( set2 );
    System.out.println( "set5 = set1.difference( set2 ) = " + set5 );

    OrderedSet set6 = set1.symmetricDifference( set2 );
    System.out.println( "set6 = set1.symmetricDifference( set2 ) = " + set6 );

    System.out.println( "set4.subsetOf( set3 ) = " + set4.subsetOf( set3 ) );
    System.out.println( "set3.subsetOf( set4 ) = " + set3.subsetOf( set4 ) );
    }
  }
