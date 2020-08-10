package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Sorting provides algorithms for sorting a sequence.
 *
 * @see Sorting
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Algorithms8
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( new Integer( 3 ) );
    array.add( new Integer( -2 ) );
    array.add( new Integer( 4 ) );
    array.add( new Integer( -5 ) );
    System.out.println( "unsorted array = " + array );
    Sorting.sort( array );
    System.out.println( "sorted array = " + array );

    Deque deque = new Deque();
    deque.add( "triangle" );
    deque.add( "square" );
    deque.add( "pentagon" );
    deque.add( "hexagon" );
    System.out.println( "unsorted deque = " + deque );
    Sorting.sort( deque, new LessString() );
    System.out.println( "sorted deque = " + deque );
    }
  }
