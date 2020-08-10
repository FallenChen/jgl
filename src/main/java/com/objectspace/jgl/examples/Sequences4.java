package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Sequences4
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    System.out.print( "array = " + array + ", size = " + array.size() );
    System.out.println( ", capacity = " + array.capacity() );

    array.insert( 0, 9, "x" );
    System.out.print( "array = " + array + ", size = " + array.size() );
    System.out.println( ", capacity = " + array.capacity() );

    for ( int i = 0; i < 2; i++ )
      {
      array.add( "x" ); // Causes reallocation of internal storage.
      System.out.print( "array = " + array + ", size = " + array.size() );
      System.out.println( ", capacity = " + array.capacity() );
      }

    array.ensureCapacity( 1000 ); // Force reallocation of internal storage.
    System.out.print( "array = " + array + ", size = " + array.size() );
    System.out.println( ", capacity = " + array.capacity() );

    array.trimToSize(); // Reduce capacity to the minimum required.
    System.out.print( "array = " + array + ", size = " + array.size() );
    System.out.println( ", capacity = " + array.capacity() );
    }
  }
