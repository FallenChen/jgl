package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Counting, finding, erasing, replacing, removing.
 *
 * @see DList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class DList2
  {
  public static void main( String[] args )
    {
    DList dlist = new DList();
    dlist.add( "ape" );
    dlist.add( "bat" );
    dlist.add( "cat" );
    dlist.add( "bat" );
    dlist.add( "bat" );
    dlist.add( "cat" );
    System.out.println( dlist );
    System.out.println();

    System.out.println( "dlist.count( bat ) = " + dlist.count( "bat" ) );
    DListIterator iterator = dlist.find( "bat" );
    if ( !iterator.atEnd() )
      {
      System.out.println( "object at dlist.find( bat ) = " + iterator.get() );
      dlist.remove( iterator );
      System.out.println( "After dlist.remove( iterator ) = " + dlist );
      }

    DListIterator start = dlist.begin();
    DListIterator finish = dlist.begin();
    finish.advance( 3 );
    dlist.replace( start, finish, "bat", "BAT" );
    System.out.println( "After dlist.replace( start, finish, bat, BAT ) = " + dlist );

    System.out.println( "dlist.remove( cat ) = " + dlist.remove( "cat" ) );
    System.out.println( "After dlist.remove( cat ) = " + dlist );
    dlist.remove( dlist.begin() );
    System.out.println( "After dlist.remove( begin() ) = " + dlist );
    }
  }
