package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Shuffling a JGL container.
 *
 * @see Shuffling
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Shuffling1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    for ( int i = 0; i < 10; i++ )
      array.add( new Integer( i ) );
    System.out.println( "array = " + array );
    Shuffling.randomShuffle( array );
    System.out.println( "after shuffle = " + array );
    }
  }
