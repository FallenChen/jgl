package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

/**
 * Counting, finding, erasing.
 *
 * @see com.objectspace.jgl,OrderedSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedSet4
  {
  public static void main( String[] args )
    {
    OrderedSet set = new OrderedSet( new LessString() );
    set.add( "cat" );
    set.add( "ape" );
    set.add( "dog" );
    set.add( "bat" );
    System.out.println( set );
    System.out.println( "set.count( dog ) = " + set.count( "dog" ) );
    OrderedSetIterator i = set.find( "dog" );
    if ( i.equals( set.end() ) ) // A simpler way: if ( i.atEnd() ) ...
      System.out.println( "Could not find dog." );
    else
      System.out.println( "Found " + i.get() );
    System.out.println( "set.remove( dog ) = " + set.remove( "dog" ) );
    OrderedSetIterator j = set.find( "dog" );
    if ( j.atEnd() ) // A simpler way: if ( j.equals( set.end() ) ) ...
      System.out.println( "Could not find dog." );
    else
      System.out.println( "Found " + j.get() );
    }
  }
