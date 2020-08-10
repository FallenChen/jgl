package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Swapping two elements, swapping two sequences.
 *
 * @see Swapping
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Swapping1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "cat" );
    array.add( "dog" );
    array.add( "emu" );
    System.out.println( "array = " + array );
    ArrayIterator finish = array.end();
    finish.retreat();
    Swapping.iterSwap( array.begin(), finish );
    System.out.println( "After swapping first and last elements = " + array );

    Deque deque = new Deque();
    deque.add( "pig" );
    deque.add( "hog" );
    System.out.println( "deque = " + deque + ", array = " + array );
    Swapping.swapRanges( deque.begin(), deque.end(), array.begin() );
    System.out.println( "deque = " + deque + ", array = " + array );
    }
  }
