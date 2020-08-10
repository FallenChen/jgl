package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;

public class Overview6
  {
  public static void main( String[] args )
    {
    int ints[] = { 3, -1, 2 };
    IntArray intArray = new IntArray( ints );
    System.out.println( "Unsorted native int array = " + intArray );

    Sorting.sort( intArray );
    System.out.print( "Sorted native array = " );
    for ( int i = 0; i < ints.length; i++ )
      System.out.print( ints[ i ] + " " );
    System.out.println();
    }
  }
