package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Sum the values of a range.
 *
 * @see Counting
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Counting1
  {
  public static void main( String[] args )
    {
    int intArray[] = { 1, 2, 3, 4, 5 };
    IntIterator begin = IntIterator.begin( intArray );
    IntIterator end = IntIterator.end( intArray );

    Number sum = Counting.accumulate( begin, end, new Integer( 0 ) );

    System.out.println( "Sum = " + sum );
    }
  }
