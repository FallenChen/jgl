package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;
import com.objectspace.jgl.voyager.*;
import com.objectspace.jgl.voyager.algorithms.*;
import com.objectspace.voyager.*;

public class Overview11
  {
  /**
   * This example only works with ObjectSpace Voyager(tm).
   * Visit the <a href=http://www.objectspace.com/voyager>Voyager homepage</a> for more information.
   */
  public static void main( String[] args )
    {
    try
      {
      // Construct a new Array object on localhost:8000 and build a virtual
      // reference called array to comunicate with it. Add elements as if
      // it were local.
      VArray array = new VArray( "localhost:8000" );
      array.add( "Texas Fight!" );
      array.add( "Bevo" );
      array.add( "Hook 'Em" );

      // persist the remote Array in te Voyager database
      array.saveNow();

      // printing works like you'd expect
      System.out.println( "container=" + array );

      // remote algorithms
      VSorting.sort( array, new LessString(), "localhost:8000" );
      System.out.println( "sorted container=" + array );

      // and iteration as well
      array.setVirtual( true );
      new VArrayIterator(); // make sure the class is loaded
      ForwardIterator iter = array.start();
      array.setVirtual( false );
      while ( iter.hasMoreElements() )
        System.out.println( "element=" + iter.nextElement() );
      }
    catch ( VoyagerException ex )
      {
      System.err.println( "caught: " + ex );
      }

    Voyager.shutdown();
    }
  }
