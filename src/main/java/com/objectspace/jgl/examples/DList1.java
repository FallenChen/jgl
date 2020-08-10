package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, access, pushing, popping.
 *
 * @see DList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class DList1
  {
  public static void main( String[] args )
    {
    DList dlist = new DList();
    dlist.pushBack( "bat" );
    dlist.add( "cat" );
    dlist.pushFront( "ape" );
    System.out.println( dlist );
    System.out.println();

    System.out.println( "Enumerate the DList" );
    Enumeration e = dlist.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Iterate through the DList" );
    for ( DListIterator i = dlist.begin(); !i.equals( dlist.end() ); i.advance() )
      System.out.println( i.get() );
    System.out.println();

    System.out.println( "Demonstrate access" );
    System.out.println( "dlist.at( 0 ) = " + dlist.at( 0 ) );
    System.out.println( "dlist.front() = " + dlist.front() );
    System.out.println( "dlist.at( 2 ) = " + dlist.at( 2 ) );
    System.out.println( "dlist.back() = " + dlist.back() );
    System.out.println();

    System.out.println( "Demonstrate modification" );
    dlist.put( 1, "fox" );
    System.out.println( dlist );

    System.out.println( "popFront() returns: " + dlist.popFront() );
    System.out.println( "After popFront() = " + dlist );

    System.out.println( "popBack() returns: " + dlist.popBack() );
    System.out.println( "After popBack() = " + dlist );
    }
  }
