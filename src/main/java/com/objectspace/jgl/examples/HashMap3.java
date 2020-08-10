package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Counting, finding, erasing.
 *
 * @see HashMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class HashMap3
  {
  public static void main( String[] args )
    {
    HashMap map = new HashMap();
    map.add( "cat", "Meow" );
    map.add( "ape", "Squeak" );
    map.add( "dog", "Woof" );
    map.add( "bat", "Squeak" );
    System.out.println( map );
    System.out.println( "map.count( dog ) = " + map.count( "dog" ) );
    HashMapIterator i = map.find( "dog" );
    if ( i.equals( map.end() ) ) // A simpler way: if ( i.atEnd() ) ...
      System.out.println( "Could not find dog." );
    else
      System.out.println( "Found " + i.get() );
    System.out.println( "map.remove( dog ) = " + map.remove( "dog" ) );
    HashMapIterator j = map.find( "dog" );
    if ( j.atEnd() ) // A simpler way: if ( j.equals( map.end() ) ) ...
      System.out.println( "Could not find dog." );
    else
      System.out.println( "Found " + j.get() );
    }
  }
