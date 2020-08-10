package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.voyager.*;
import com.objectspace.voyager.*;

/**
 * Iteration through a remote container.
 *
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Voyager2
  {
  /**
   * This example only works with ObjectSpace Voyager(tm).
   * Visit the <a href=http://www.objectspace.com/voyager>Voyager homepage</a> for more information.
   */
  public static void main( String[] args )
    {
    try
      {
      // create a remote list
      VSList list = new VSList( "localhost:8000" );
      new VSListIterator(); // force class loading

      // fill remote list
      list.add( "yakko" );
      list.add( "wakko" );
      list.add( "dot" );
      System.out.println( "lowercase = " + list );

      // obtain a local iterator to the remote list
      list.setVirtual( true );
      ForwardIterator iterator = list.start();
      list.setVirtual( false );

      // change all elements in remote list to uppercase
      while ( !iterator.atEnd() )
        {
        String current = (String)iterator.get();
        iterator.put( current.toUpperCase() );
        iterator.advance();
        }
      System.out.println( "uppercase = " + list );
      }
    catch ( VoyagerException ex )
      {
      System.err.println( "caught: " + ex );
      }

    Voyager.shutdown();
    }
  }
