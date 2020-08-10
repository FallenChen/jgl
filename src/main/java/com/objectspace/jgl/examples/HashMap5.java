package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Accessing keys and values.
 *
 * @see HashMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class HashMap5
  {
  public static void main( String[] args )
    {
    HashMap map = new HashMap( true ); // allow duplicates
    map.add( "cat", "Meow" );
    map.add( "ape", "Squeak" );
    map.add( "ape", "Whoop" );
    map.add( "bat", "Squeak" );
    System.out.println( "map = " + map );
    System.out.println();

    System.out.println( "Enumerate the HashMap" );
    Enumeration e = map.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    e = map.keys();
    System.out.print( "map.keys() = " );
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " " );
    System.out.println();

    e = map.keys( "Squeak" );
    System.out.print( "map.keys( Squeak ) = " );
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " " );
    System.out.println();

    e = map.values( "ape" );
    System.out.print( "map.keys( ape ) = " );
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " " );
    System.out.println();
    }
  }
