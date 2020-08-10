package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Container4
  {
  public static void main( String[] args )
    {
    Array array1 = new Array();
    array1.add( "ape" );
    array1.add( "bat" );
    array1.add( "cat" );

    Array array2 = new Array();
    array2.add( "red" );
    array2.add( "blue" );

    // Illustrate swapping.
    System.out.println( "array1 = " + array1 + ", array2 = " + array2 );
    array1.swap( array2 );
    System.out.println( "array1 = " + array1 + ", array2 = " + array2 );
    }
  }
