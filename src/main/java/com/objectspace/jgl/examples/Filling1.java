package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Filling a sequence with a single element and multiple elements.
 *
 * @see Filling
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Filling1
  {
  public static void main( String[] args )
    {
    int intArray[] = new int[ 10 ];
    System.out.println( "Fill a native array of integers with 42" );
    IntIterator begin = IntIterator.begin( intArray );
    IntIterator end = IntIterator.end( intArray );
    Filling.fill( begin, end, new Integer( 42 ) );
    Printing.println( begin, end );
    System.out.println();

    Array array = new Array();
    array.add( "cat" );
    array.add( "dog" );
    array.add( "emu" );
    array.add( "fox" );
    System.out.println( "array = " + array );
    System.out.println( "Fill the array with gnu" );
    Filling.fill( array, "gnu" );
    System.out.println( "array = " + array );

    System.out.println( "Fill the first 3 elements with bat." );
    Filling.fillN( array.begin(), 3, "bat" );
    System.out.println( "array = " + array );
    }
  }
