package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Counting, finding, erasing, replacing, removing.
 *
 * @see SList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class SList2
  {
  public static void main( String[] args )
    {
    SList list = new SList();
    list.add( "ape" );
    list.add( "bat" );
    list.add( "cat" );
    list.add( "bat" );
    list.add( "bat" );
    list.add( "cat" );
    System.out.println( list );
    System.out.println();

    System.out.println( "list.count( bat ) = " + list.count( "bat" ) );
    SListIterator iterator = list.find( "bat" );
    if ( !iterator.atEnd() )
      {
      System.out.println( "object at list.find( bat ) = " + iterator.get() );
      list.remove( iterator );
      System.out.println( "After list.remove( iterator ) = " + list );
      }

    SListIterator start = list.begin();
    SListIterator finish = list.begin();
    finish.advance( 3 );
    list.replace( start, finish, "bat", "BAT" );
    System.out.println( "After list.replace( start, finish, bat, BAT ) = " + list );

    System.out.println( "list.remove( cat ) = " + list.remove( "cat" ) );
    System.out.println( "After list.remove( cat ) = " + list );
    list.remove( list.begin() );
    System.out.println( "After list.remove( begin() ) = " + list );
    }
  }
