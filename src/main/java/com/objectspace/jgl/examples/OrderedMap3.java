package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

/**
 * Counting, finding, erasing.
 *
 * @see com.objectspace.jgl,OrderedMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedMap3
  {
  public static void main( String[] args )
    {
    OrderedMap map = new OrderedMap( new LessString() );
    map.add( "cat", "Meow" );
    map.add( "ape", "Squeak" );
    map.add( "dog", "Woof" );
    map.add( "bat", "Squeak" );
    System.out.println( map );
    System.out.println( "map.count( dog ) = " + map.count( "dog" ) );
    OrderedMapIterator i = map.find( "dog" );
    if ( i.equals( map.end() ) ) // A simpler way: if ( i.atEnd() ) ...
      System.out.println( "Could not find dog." );
    else
      System.out.println( "Found " + i.get() );
    System.out.println( "map.remove( dog ) = " + map.remove( "dog" ) );
    OrderedMapIterator j = map.find( "dog" );
    if ( j.atEnd() ) // A simpler way: if ( j.equals( map.end() ) ) ...
      System.out.println( "Could not find dog." );
    else
      System.out.println( "Found " + j.get() );
    }
  }
