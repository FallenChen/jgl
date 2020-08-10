package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Insertion.
 *
 * @see Array
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Array3
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "bat" );
    array.add( "cat" );
    array.add( "dog" );
    System.out.println( "array = " + array );
    System.out.println();

    array.insert( array.begin(), "ape" );
    System.out.println( "After insert at begin = " + array );

    array.insert( array.end(), "emu" );
    System.out.println( "After insert at end = " + array );

    array.insert( 3, 2, "fox" );
    System.out.println( "After array.insert( 3, 2, fox ) = " + array );
    }
  }
