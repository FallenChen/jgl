package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Calculate and sum the difference between adjacent pairs of values.
 *
 * @see Counting
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Counting3
  {
  public static void main( String[] args )
    {
    // create sample array
    int intArray[] = { 1, 2, 4, 8, 16 };
    IntIterator begin = IntIterator.begin( intArray );
    IntIterator end = IntIterator.end( intArray );
    Printing.println( begin, end );

    // make sure destination hase enough space allocated
    Array array = new Array( 5 );

    Counting.adjacentDifference( begin, end, array.start() );
    Printing.println( array );
    }
  }
