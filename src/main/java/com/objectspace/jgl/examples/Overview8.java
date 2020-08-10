package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

public class Overview8
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( new Integer( 3 ) );
    array.add( new Integer( -1 ) );
    array.add( new Integer( 2 ) );
    System.out.println( "Unsorted Array = " + array );
    BinaryPredicate predicate = new GreaterNumber();
    Sorting.sort( array, predicate ); // Sort in descending order.
    System.out.println( "Sorted = " + array );
    }
  }
