package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.voyager.*;
import com.objectspace.voyager.*;

/**
 * Persist a container.
 *
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Voyager4A
  {
  /**
   * This example only works with ObjectSpace Voyager(tm).
   * Visit the <a href=http://www.objectspace.com/voyager>Voyager homepage</a> for more information.
   */
  public static void main( String[] args )
    {
    try
      {
      // create and fill a remote map
      VHashMap map = new VHashMap( "localhost:8000/JGL4" );
      map.add( "Spider-Man", "Peter Parker" );
      map.add( "Wolverine", "Logan" );
      map.add( "Batman", "Bruce Wayne" );
      map.add( "Oracle", "Barbara Gordon" );
      map.liveForever(); // do not garbage collect
      map.saveNow(); // save copy to database of server 8000
      System.out.println( "saved " + map );
      }
    catch ( VoyagerException ex )
      {
      System.err.println( "caught: " + ex );
      }

    Voyager.shutdown();
    }
  }
