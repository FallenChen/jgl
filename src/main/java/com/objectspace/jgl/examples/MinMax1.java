package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Minimum and maximum elements of an SGL container and a native array of ints.
 *
 * @see MinMax
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class MinMax1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "cat" );
    array.add( "ape" );
    array.add( "bat" );
    ArrayIterator min = (ArrayIterator)MinMax.minElement( array, new LessString() );
    System.out.println( "array = " + array );
    System.out.println( "min = " + min.get() + " at index " + min.index() );

    int intArray[] = { 3, 2, 7, 8, 1, 6 };
    IntIterator begin = IntIterator.begin( intArray );
    IntIterator end = IntIterator.end( intArray );
    IntIterator max = (IntIterator)MinMax.maxElement( begin, end );
    System.out.println( "intArray = " + Printing.toString( begin, end ) );
    System.out.println( "max = " + max.get() + " at index " + max.index() );
    }
  }
