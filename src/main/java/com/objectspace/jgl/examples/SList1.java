package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, access, pushing, popping.
 *
 * @see SList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class SList1
  {
  public static void main( String[] args )
    {
    SList list = new SList();
    list.pushBack( "bat" );
    list.add( "cat" );
    list.pushFront( "ape" );
    System.out.println( list );
    System.out.println();

    System.out.println( "Enumerate the SList" );
    Enumeration e = list.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Iterate through the SList" );
    for ( SListIterator i = list.begin(); !i.equals( list.end() ); i.advance() )
      System.out.println( i.get() );
    System.out.println();

    System.out.println( "Demonstrate access" );
    System.out.println( "list.at( 0 ) = " + list.at( 0 ) );
    System.out.println( "list.front() = " + list.front() );
    System.out.println( "list.at( 2 ) = " + list.at( 2 ) );
    System.out.println( "list.back() = " + list.back() );
    System.out.println();

    System.out.println( "Demonstrate modification" );
    list.put( 1, "fox" );
    System.out.println( list );

    System.out.println( "popFront() returns: " + list.popFront() );
    System.out.println( "After popFront() = " + list );

    System.out.println( "popBack() returns: " + list.popBack() );
    System.out.println( "After popBack() = " + list );
    }
  }
