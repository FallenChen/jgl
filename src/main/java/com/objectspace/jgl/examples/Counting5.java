package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;

/**
 * Calculate and sum the difference between adjacent pairs of values.
 *
 * @see Counting
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Counting5
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    for ( long i = 1; i <= 10; ++i )
      array.add( new Long( i ) );
    System.out.println( array );

    Array result = new Array();
    Counting.adjacentDifference
      (
      array,
      result,
      new TimesNumber( Long.class )
      );
    System.out.println( result );
    }
  }
