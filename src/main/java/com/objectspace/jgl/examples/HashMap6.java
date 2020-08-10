package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Counting, finding, erasing.
 *
 * @see HashMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class HashMap6
  {
  public static void main( String[] args )
    {
    HashMap map = new HashMap( true ); // allow duplicates
    map.add( "cat", "Meow" );
    map.add( "ape", "Squeak" );
    map.add( "ape", "Whoop" );
    map.add( "bat", "Squeak" );
    System.out.println( map );

    System.out.println( "map.count( ape ) = " + map.count( "ape" ) );
    HashMapIterator i = map.find( "ape" );

    if ( i.equals( map.end() ) ) // A simpler way: if ( i.atEnd() ) ...
      {
      System.out.println( "Could not find dog." );
      }
    else
      {
      while ( !i.atEnd() && i.key().equals( "ape" ) )
        {
        System.out.println( "Found " + i.get() );
        i.advance();
        }
      }
    System.out.println( "map.remove( ape ) = " + map.remove( "ape" ) );
    HashMapIterator j = map.find( "ape" );
    if ( j.atEnd() ) // A simpler way: if ( j.equals( map.end() ) ) ...
      System.out.println( "Could not find ape." );
    else
      System.out.println( "Found " + j.get() );
    }
  }
