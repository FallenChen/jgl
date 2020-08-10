package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, access, pushing, popping.
 *
 * @see com.objectspace.jgl,Deque
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Deque1
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.pushBack( "bat" );
    deque.add( "cat" );
    deque.pushFront( "ape" );
    System.out.println( deque );
    System.out.println();

    System.out.println( "Enumerate the Deque" );
    Enumeration e = deque.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Iterate through the Deque" );
    for ( DequeIterator i = deque.begin(); !i.equals( deque.end() ); i.advance() )
      System.out.println( i.get() );
    System.out.println();

    System.out.println( "Demonstrate access" );
    System.out.println( "deque.at( 0 ) = " + deque.at( 0 ) );
    System.out.println( "deque.front() = " + deque.front() );
    System.out.println( "deque.at( 2 ) = " + deque.at( 2 ) );
    System.out.println( "deque.back() = " + deque.back() );
    System.out.println();

    System.out.println( "Demonstrate modification" );
    deque.put( 1, "fox" );
    System.out.println( deque );

    deque.popFront();
    System.out.println( "After popFront() = " + deque );

    deque.popBack();
    System.out.println( "After popBack() = " + deque );
    }
  }
