package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Calculate and sum the difference between adjacent pairs of values.
 *
 * @see Counting
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Counting4
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    for ( int i = 0; i < 10; ++i )
      array.add( new Integer( i * i ) );
    System.out.println( array );

    // note that this writes over the original array
    Counting.adjacentDifference( array, array.start() );
    System.out.println( array );
    }
  }
