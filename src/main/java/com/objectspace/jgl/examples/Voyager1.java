package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.voyager.*;
import com.objectspace.voyager.*;

/**
 * Remote creation and manipulation of containers.
 *
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Voyager1
  {
  /**
   * This example only works with ObjectSpace Voyager(tm).
   * Visit the <a href=http://www.objectspace.com/voyager>Voyager homepage</a> for more information.
   */
  public static void main( String[] args )
    {
    try
      {
      // create a remote map that allows duplicate keys
      VHashMap map = new VHashMap( true, "localhost:8000" );

      // fill remote map
      map.add( "city", "Austin" );
      map.add( "song", "Texas Fight!" );
      map.add( "mascot", "Bevo" );
      map.add( "mascot", "Longhorns" );
      System.out.println( "map = " + map ); // prints locally

      // query remote container
      System.out.println( "map.size() = " + map.size() );
      System.out.println( "map.empty() = " + map.isEmpty() );
      System.out.println( "map.get( \"song\" ) = " + map.get( "song" ) );

      // mutate remote container
      map.clear();
      System.out.println( "\nafter remote map is cleared..." );
      System.out.println( "map.size() = " + map.size() );
      System.out.println( "map.empty() = " + map.isEmpty() );
      System.out.println( "map.get( \"song\" ) = " + map.get( "song" ) );
      }
    catch ( VoyagerException ex )
      {
      System.err.println( "caught: " + ex );
      }

    Voyager.shutdown();
    }
  }
