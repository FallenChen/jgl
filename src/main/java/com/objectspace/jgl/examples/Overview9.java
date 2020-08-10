package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;
import com.objectspace.jgl.algorithms.*;

public class Overview9
  {
  public static void main( String[] args )
    {
    Array array1 = new Array();
    array1.add( new Integer( 3 ) );
    array1.add( new Integer( -1 ) );
    array1.add( new Integer( 2 ) );

    UnaryPredicate predicate = new PositiveNumber();
    int n = Counting.countIf( array1, predicate );
    System.out.println( "# of positive numbers in " + array1 + " = " + n );

    Array array2 = new Array();
    Removing.removeCopyIf( array1, array2, predicate );
    System.out.println( "Array without positive numbers = " + array2 );
    }
  }
