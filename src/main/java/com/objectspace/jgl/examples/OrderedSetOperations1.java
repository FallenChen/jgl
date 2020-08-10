package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;
import com.objectspace.jgl.util.*;

/**
 * Union, intersection, difference, symmetric difference, inclusion.
 *
 * @see com.objectspace.jgl,OrderedSetOperations
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedSetOperations1
  {
  public static void main( String[] args )
    {
    OrderedSet set1 = new OrderedSet( new LessString() );
    set1.add( "bat" );
    set1.add( "dog" );
    set1.add( "ape" );
    OrderedSet set2 = new OrderedSet( new LessString() );
    set2.add( "dog" );
    set2.add( "ape" );
    set2.add( "fox" );
    System.out.println( "set1 = " + set1 + ", set2 = " + set2 );

    OrderedSet union = new OrderedSet( new LessString() );
    OrderedSetOperations.setUnion( set1, set2, new InsertIterator( union ), new LessString() );
    System.out.println( "union = " + union );
    System.out.println( "union = " + set1.union( set2 ) );

    OrderedSet intersection = new OrderedSet( new LessString() );
    OrderedSetOperations.setIntersection( set1, set2, new InsertIterator( intersection ), new LessString() );
    System.out.println( "intersection = " + intersection );
    System.out.println( "intersection = " + set1.intersection( set2 ) );

    Array difference = new Array();
    OrderedSetOperations.setDifference( set1, set2, new InsertIterator( difference ), new LessString() );
    System.out.println( "difference = " + difference );

    Array symDifference = new Array();
    OrderedSetOperations.setSymmetricDifference( set1, set2, new InsertIterator( symDifference ), new LessString() );
    System.out.println( "symmetric difference = " + symDifference );

    boolean includes1 = OrderedSetOperations.includes( difference, symDifference, new LessString() );
    System.out.println( "includes1 = " + includes1 );

    boolean includes2 = OrderedSetOperations.includes( symDifference, difference, new LessString() );
    System.out.println( "includes2 = " + includes2 );
    }
  }
