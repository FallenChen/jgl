package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;

public class Overview4
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( new Integer( 3 ) );
    array.add( new Integer( -1 ) );
    array.add( new Integer( 2 ) );
    System.out.println( "Unsorted Array = " + array );
    Sorting.sort( array );
    System.out.println( "Sorted = " + array );
    }
  }
