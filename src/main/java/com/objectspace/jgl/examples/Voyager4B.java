package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.voyager.*;
import com.objectspace.voyager.*;

/**
 * Retrieve a persisted container.
 *
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Voyager4B
  {
  /**
   * This example only works with ObjectSpace Voyager(tm).
   * Visit the <a href=http://www.objectspace.com/voyager>Voyager homepage</a> for more information.
   */
  public static void main( String[] args )
    {
    try
      {
      // connect to persistent map in server 8000
      VHashMap map = (VHashMap)VObject.forObjectAt("localhost:8000/JGL4");
      query( map, "Spider-Man" );
      query( map, "Mr. Fantastic" );
      map.dieNow(); // kill map, remove from database
      }
    catch ( VoyagerException ex )
      {
      System.err.println( "caught: " + ex );
      }

    Voyager.shutdown();
    }

  public static void query( VHashMap map, String hero ) throws VoyagerException
    {
    Object name = map.get( hero );
    if ( name == null )
      System.out.println( hero + " is not in the database" );
    else
      System.out.println( hero + " is really " + name );
    }
  }
