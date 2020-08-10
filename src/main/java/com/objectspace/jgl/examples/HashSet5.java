package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Counting, finding, removing with duplicates allowed.
 *
 * @see HashSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class HashSet5
  {
  public static void main( String[] args )
    {
    HashSet set = new HashSet( true ); // allow duplicates
    set.add( "cat" );
    set.add( "ape" );
    set.add( "dog" );
    set.add( "bat" );
    set.add( "dog" );
    System.out.println( set );
    System.out.println( "set.count( dog ) = " + set.count( "dog" ) );
    HashSetIterator i = set.find( "dog" );
    if ( i.equals( set.end() ) ) // A simpler way: if ( i.atEnd() ) ...
      System.out.println( "Could not find dog." );
    else
      System.out.println( "Found " + i.get() );
    System.out.println( "set.remove( dog ) = " + set.remove( "dog" ) );
    HashSetIterator j = set.find( "dog" );
    if ( j.atEnd() ) // A simpler way: if ( j.equals( set.end() ) ) ...
      System.out.println( "Could not find dog." );
    else
      System.out.println( "Found " + j.get() );
    }
  }
