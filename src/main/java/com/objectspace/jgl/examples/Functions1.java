package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

public class Functions1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( new Integer( 3 ) );
    array.add( new Integer( -2 ) );
    array.add( new Integer( 3 ) );
    array.add( new Integer( -5 ) );
    array.add( new Integer( -4 ) );

    UnaryPredicate predicate = new PositiveNumber();
    int n = Counting.countIf( array, predicate );
    System.out.println( "Number of positive Integers in " + array + " = " + n );
    }
  }
