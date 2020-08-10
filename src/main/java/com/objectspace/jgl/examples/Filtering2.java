package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Selecting and rejecting elements from a container
 *
 * @see Filtering
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Filtering2
  {
  public static void main( String[] args )
    {
    HashSet set = new HashSet( true ); // allow duplicates
    set.add( "dog" );
    set.add( "monkey" );
    set.add( "lion" );
    set.add( "dog" );
    set.add( "armadillo" );
    set.add( "zebra" );
    System.out.println( "Original set: " + set + "\n" );

    System.out.println
      (
      "Collecting strings > 5 chars: " + Filtering.select
        (
        set,
        new Filtering2UnaryPredicate()
        )
      );
    System.out.println
      (
      " Rejecting strings > 5 chars: " + Filtering.reject
        (
        set,
        new Filtering2UnaryPredicate()
        )
      );
    }
  }

class Filtering2UnaryPredicate implements UnaryPredicate
  {
  // return true if the length of the toString() is
  // greater than 5.
  public boolean execute( Object object )
    {
    return object.toString().length() > 5;
    }
  }
