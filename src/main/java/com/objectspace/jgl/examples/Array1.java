package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, access, pushing, popping.
 *
 * @see Array
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Array1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.pushBack( "bat" );
    array.add( "cat" );
    array.pushFront( "ape" );
    System.out.println( array );
    System.out.println();

    System.out.println( "Enumerate the Array" );
    Enumeration e = array.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Iterate through the Array" );
    for ( ArrayIterator i = array.begin(); !i.equals( array.end() ); i.advance() )
      System.out.println( i.get() );
    System.out.println();

    System.out.println( "Demonstrate access" );
    System.out.println( "array.at( 0 ) = " + array.at( 0 ) );
    System.out.println( "array.front() = " + array.front() );
    System.out.println( "array.at( 2 ) = " + array.at( 2 ) );
    System.out.println( "array.back() = " + array.back() );
    System.out.println();

    System.out.println( "Demonstrate modification" );
    array.put( 1, "fox" );
    System.out.println( array );

    array.popFront();
    System.out.println( "After popFront() = " + array );

    array.popBack();
    System.out.println( "After popBack() = " + array );
    }
  }
