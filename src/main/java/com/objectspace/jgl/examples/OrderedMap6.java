package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;
import java.util.Enumeration;

/**
 * Accessing keys and values.
 *
 * @see com.objectspace.jgl,OrderedMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedMap6
  {
  public static void main( String[] args )
    {
    OrderedMap map = new OrderedMap( new LessString(), true );
    map.add( "cat", "Meow" );
    map.add( "ape", "Squeak" );
    map.add( "ape", "Whoop" );
    map.add( "bat", "Squeak" );
    System.out.println( "map = " + map );

    System.out.println( "Enumerate the OrderedMap" );
    Enumeration e = map.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    e = map.keys();
    System.out.print( "map.keys() = " );
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " ");
    System.out.println();

    e = map.keys( "Squeak" );
    System.out.print( "map.keys( Squeak ) = " );
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " ");
    System.out.println();

    e = map.values( "ape" );
    System.out.print( "map.values( ape ) = " );
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " ");
    System.out.println();
    }
  }
