package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

/**
 * Comparators.
 *
 * @see com.objectspace.jgl,OrderedSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedSet7
  {
  public static void main( String[] args )
    {
    // make the ordered set allow duplicates
    OrderedSet set = new OrderedSet( new LessString(), true );
    set.add( "cat" );
    set.add( "ape" );
    set.add( "bat" );
    set.add( "dog" );
    set.add( "bat" );
    set.add( "cat" );
    set.add( "bat" );
    System.out.println( set );
    }
  }
