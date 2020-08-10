package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Finding objects that match a predicate.
 *
 * @see Finding
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Finding2
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "cat" );
    array.add( "monkey" );
    array.add( "lion" );
    array.add( "armadillo" );
    array.add( "zebra" );
    System.out.println( "array = " + array );

    System.out.println
      ( 
      "Array has SOME string > 5 chars  == " 
        + Finding.some( array, new Finding2UnaryPredicate() ) 
      );
    System.out.println
      ( 
      "Array has EVERY string > 5 chars == "
        + Finding.every( array, new Finding2UnaryPredicate() ) 
      );
    System.out.println
      ( 
      "1st Object in array > 5 chars    == "
        + Finding.detect( array, new Finding2UnaryPredicate() ) 
      );
    }
  }

class Finding2UnaryPredicate implements UnaryPredicate
  {
  // return true if the length of the toString() is
  // greater than 5.
  public boolean execute( Object object )
    {
    return object.toString().length() > 5;
    }
  }
