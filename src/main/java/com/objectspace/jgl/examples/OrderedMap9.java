package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Traverse a map with duplicate keys.
 *
 * @see com.objectspace.jgl,OrderedMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedMap9
  {
  public static void main( String[] args )
    {
    // Create a map that allows duplicate keys.
    OrderedMap map = new OrderedMap( true );
    // Populate the map, being sure to use duplicate keys.
    map.add( new Integer( 86 ), "Texas Fight" );
    map.add( new Integer( 42 ), "Bevo" );
    map.add( new Integer( 69 ), "University of Texas" );
    map.add( new Integer( 42 ), "Hook 'Em" );
    map.add( new Integer( 7 ), "Disciplina Praesidium Civitatis" );

    System.out.println( "-----wrong" );
      {
      // Enumerate the wrong way.
      Enumeration keys = map.keys();
      while ( keys.hasMoreElements() )
        {
        // Get the key.
        Integer i = (Integer)keys.nextElement();
        // Try and find the value using the key.
        System.out.println( "Key=" + i + "\tValue=" + map.get( i ) );
        }
      }

    System.out.println( "-----easy" );
      {
      // Enumerate the easy way
      Enumeration pairs = map.start();
      while ( pairs.hasMoreElements() )
        {
        Pair p = (Pair)pairs.nextElement();
        // p is a key-value pair, so we have all the info we need.
        System.out.println( "Key=" + p.first + "\tValue=" + p.second );
        }
      }

    System.out.println( "-----hard" );
      {
      // Enumerate the hard way
      Enumeration keys = map.keys();
      while ( keys.hasMoreElements() )
        {
        // Get the key.
        Integer i = (Integer)keys.nextElement();
        // get the value(s) associated with the key pair.
        Range r = map.equalRange( i );
        // Loop until all values have been processed.
        while ( true )
          {
          // Notice equalRange() enumerations return a key-value pair.
          Pair p = (Pair)r.begin.nextElement();
          // p.first will always be the same as i
          System.out.println( "Key=" + p.first + "\tValue=" + p.second );
          // Are we done?
          if ( r.begin.equals( r.end ) )
            break;
          // We know the next key is the same as this one, so skip it.
          keys.nextElement();
          }
        }
      }
  }
}
