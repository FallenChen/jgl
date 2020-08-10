package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;
import com.objectspace.jgl.predicates.*;

/**
 * Filtering provides algorithms for creating a variation of a sequence.
 *
 * @see Filtering
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Algorithms5
  {
  public static void main( String[] args )
    {
    Array array1 = new Array();
    array1.add( "cat" );
    array1.add( "monkey" );
    array1.add( "goat" );
    array1.add( "elephant" );
    System.out.println( "array1 = " + array1 );

    // Predicate that returns true if a string is greater than 4 characters long.
    UnaryPredicate predicate = new UnaryComposePredicate
      (
      new BindSecondPredicate( new GreaterNumber(), new Integer( 4 ) ),
      new LengthString()
      );

    Array array2 = (Array)Filtering.select( array1, predicate );
    System.out.println( "strings with length > 4 = " + array2 );

    Array array3 = (Array)Filtering.reject( array1, predicate );
    System.out.println( "strings with length <= 4 = " + array3 );
    }
  }
