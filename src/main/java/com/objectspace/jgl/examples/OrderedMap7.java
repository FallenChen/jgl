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

public class OrderedMap7
  {
  public static void main( String[] args )
    {
    OrderedMap map = new OrderedMap( new LessString(), true );
    map.add( "cat", "Meow" );
    map.add( "ape", "Squeak" );
    map.add( "ape", "Whoop" );
    map.add( "bat", "Squeak" );
    System.out.println( map );

    System.out.println( "map.count( ape ) = " + map.count( "ape" ) );
    OrderedMapIterator i = map.find( "ape" );

    if ( i.equals( map.end() ) ) // A simpler way: if ( i.atEnd() ) ...
      {
      System.out.println( "Could not find dog." );
      }
    else
      {
      while ( i.key().equals( "ape" ) )
        {
        System.out.println( "Found " + i.get() );
        i.advance();
        }
      }
    System.out.println( "map.remove( ape ) = " + map.remove( "ape" ) );
    OrderedMapIterator j = map.find( "ape" );
    if ( j.atEnd() ) // A simpler way: if ( j.equals( map.end() ) ) ...
      System.out.println( "Could not find ape." );
    else
      System.out.println( "Found " + j.get() );
    }
  }
