package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Reserving capacity.
 *
 * @see Array
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Array4
  {
  public static void main( String[] args )
    {
    Object ints[] = { "bat", "cat", "dog" };
    Array array = new Array( ints );
    array.put( 1, "CAT" );
    System.out.println( "array = " + array + ", capacity = " + array.capacity() );
    System.out.print( "array = " );
    for ( int i = 0; i < ints.length; i++ )
      System.out.print( ints[ i ] + " " );
    System.out.println();

    array.ensureCapacity( 100 );
    array.put( 2, "DOG" );
    System.out.println( "array = " + array + ", capacity = " + array.capacity() );
    System.out.print( "array = " );
    for ( int i = 0; i < ints.length; i++ )
      System.out.print( ints[ i ] + " " );
    System.out.println();
    }
  }
