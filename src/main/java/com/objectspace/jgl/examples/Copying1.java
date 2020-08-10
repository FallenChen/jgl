package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.util.*;

/**
 * Copying a JGL container into another JGL container and standard output, backwards copying.
 *
 * @see Copying
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Copying1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( new Integer( 3 ) );
    array.add( new Integer( 6 ) );
    array.add( new Integer( 4 ) );
    array.add( new Integer( 1 ) );

    Deque deque = new Deque();
    ArrayIterator start = array.begin();
    start.advance( 1 );
    ArrayIterator finish = array.end();
    finish.retreat( 1 );
    Copying.copy( start, finish, new InsertIterator( deque ) );
    System.out.println( "array = " + array + ", deque = " + deque );

    System.out.println( "Copy array to System.out." );
    Copying.copy( array, new OutputStreamIterator() );
    System.out.println();

    // To perform a forward copy when there is overlap, use copyBackward().
    Copying.copyBackward( start, finish, array.end() );
    System.out.println( "array = " + array );
    }
  }
