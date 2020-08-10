package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Mismatching, equality, lexicographical comparison.
 *
 * @see Comparing
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Comparing1
  {
  public static void main( String[] args )
    {
    Object median = Comparing.median( "cat", "ape", "dog", new LessString() );
    System.out.println( "median of cat, ape and dog = " + median );
    System.out.println();

    Array array1 = new Array();
    array1.add( "ape" );
    array1.add( "bat" );
    array1.add( "emu" );

    Array array2 = new Array();
    array2.add( "ape" );
    array2.add( "bat" );
    array2.add( "dog" );
    array2.add( "cat" );

    System.out.println( "array1 = " + array1 );
    System.out.println( "array2 = " + array2 );

    Pair pair = Comparing.mismatch( array1, array2 );
    System.out.println( "array1 mismatch @ " + ( (ArrayIterator)pair.first).get() );
    System.out.println( "array2 mismatch @ " + ( (ArrayIterator)pair.second).get() );

    Deque deque1 = new Deque();
    deque1.add( "ape" );
    deque1.add( "bat" );
    deque1.add( "dog" );
    deque1.add( "cat" );
    System.out.println( "array2 equals deque1? " + Comparing.equal( array2, deque1 ) );

    boolean result = Comparing.lexicographicalCompare( array1, deque1, new LessString() );
    System.out.println( "(array1 < deque1) = " + result );
    }
  }
