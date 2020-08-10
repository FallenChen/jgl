package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Sequences5
  {
  public static void main( String[] args )
    {
    String strings1[] = { "ape", "bat", "cat" };
    Array array = new Array( strings1 );

    System.out.print( "array = " + array + ", size = " + array.size() );
    System.out.println( ", capacity = " + array.capacity() );

    array.put( 2, "CAT" );
    System.out.println( "array = " + array );
    System.out.print( "Original = " );
    for ( int i = 0; i < strings1.length; i++ )
      System.out.print( strings1[ i ] + " " );
    System.out.println();

    array.add( "dog" ); // Forces reallocation of storage.
    System.out.print( "array = " + array + ", size = " + array.size() );
    System.out.println( ", capacity = " + array.capacity() );
    System.out.print( "Original = " );
    for ( int i = 0; i < strings1.length; i++ )
      System.out.print( strings1[ i ] + " " );
    System.out.println();

    String string2[] = new String[ array.size() ];
    array.copyTo( string2 ); // Copy contents of array into native array.

    for ( int i = 0; i < string2.length; i++ )
      System.out.print( string2[ i ] + " " );
    System.out.println();
    }
  }
