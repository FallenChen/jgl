package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

public class Functions8
  {
  public static void main( String[] args )
    {
    double array[] = { 3, 1, 5, -2, 7, 9 };
    DoubleArray doubleArray = new DoubleArray( array );
    BinaryPredicate comparator = new LessNumber( Double.class );
    System.out.println( "unsorted = " + doubleArray );

    Sorting.sort( doubleArray, comparator );
    System.out.println( "sorted = " + doubleArray );
    }
  }
