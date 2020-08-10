package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;
import com.objectspace.jgl.predicates.*;
import com.objectspace.jgl.voyager.*;
import com.objectspace.jgl.voyager.algorithms.*;
import com.objectspace.voyager.*;

/**
 * Distributed algorithms on a remote container.
 *
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Voyager3
  {
  /**
   * This example only works with ObjectSpace Voyager(tm).
   * Visit the <a href=http://www.objectspace.com/voyager>Voyager homepage</a> for more information.
   */
  public static void main( String[] args )
    {
    try
      {
      // create and fill remote container
      VDeque deque = new VDeque( "localhost:8000" );
      new VDequeIterator(); // force class loading
      deque.add( "Texas Fight!" );
      deque.add( "Bevo" );
      deque.add( "Hook 'Em" );
      System.out.println( "deque = " + deque );

      // print the contents of the container at the remote location
      VApplying.forEach( deque, new Print(), "localhost:8000" );

      // sort the remote array
      VSorting.sort( deque, "localhost:8000" );
      System.out.println( "\ndefault sort = " + deque );

      // sort the remote array using a custom comparator
      VSorting.sort( deque, new LessString(), "localhost:8000" );
      System.out.println( "  alpha sort = " + deque );

      // expand the remote container
      deque.pushFront( "White" );
      deque.pushBack( "White" );
      deque.pushFront( "White" );
      deque.pushBack( "White" );

      // perform an algorithm on a subrange of the remote container
      System.out.println( "\nbefore = " + deque );
      deque.setVirtual( true );
      BidirectionalIterator b = (BidirectionalIterator)deque.start();
      BidirectionalIterator e = (BidirectionalIterator)deque.finish();
      b.advance();
      e.retreat();
      deque.setVirtual( false );
      VReplacing.replace( b, e, "White", "Orange", "localhost:8000" );
      System.out.println( " after = " + deque );
      }
    catch ( VoyagerException ex )
      {
      System.err.println( "caught: " + ex );
      }

    Voyager.shutdown();
    }
  }
