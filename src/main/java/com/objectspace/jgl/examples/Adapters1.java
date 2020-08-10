package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Adapting built in Java arrays of Integers with algorithm usage.
 *
 * @see com.objectspace.jgl.util.ArrayAdapter
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Adapters1
  {
  public static void main( String[] args )
    {
    int ints[] = { 3, -1, 2, -3, 4 };
    IntArray intArray = new IntArray( ints );
    System.out.println( "Unsorted native int array = " + intArray );

    Sorting.sort( intArray );
    System.out.println( "Sorted = " + intArray );

    Shuffling.randomShuffle( intArray );
    System.out.println( "Randomized = " + intArray );

    for ( int i = 0; i < ints.length; i++ )
      System.out.print( ints[ i ] + " " );
    System.out.println();
    }
  }
