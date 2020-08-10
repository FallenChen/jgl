package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;

public class Container10
  {
  public static void main( String[] args )
    {
    int ints[] = { 3, -1, 2, 0, -6 };
    IntArray intArray = new IntArray( ints ); // Construct adapter class.
    System.out.println( "unsorted native int array = " + intArray );
    Sorting.sort( intArray ); // Sort native array.
    System.out.print( "sorted = " );
    for ( int i = 0; i < ints.length; i++ )
      System.out.print( ints[ i ] + " " );
    System.out.println();
    }
  }
