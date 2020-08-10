package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

public class Functions4
  {
  public static void main( String[] args )
    {
    long array[] = { 3, 1, 5, -2, 7, 9 };
    LongArray longArray = new LongArray( array );
    BinaryPredicate comparator = new LessNumber( Long.class );
    System.out.println( "unsorted = " + longArray );
    Sorting.sort( longArray, comparator );
    System.out.println( "sorted = " + longArray );
    }
  }
