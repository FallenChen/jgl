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

public class HashMap2
  {
  public static void main( String[] args )
    {
    HashMap map = new HashMap();
    map.add( "cat", "Meow" );
    map.add( "ape", "Squeak" );
    map.add( "dog", "Woof" );
    map.add( "bat", "Squeak" );
    System.out.println( "map = " + map );

    System.out.print( "Enumerate the HashMap: " );
    Enumeration e = map.elements();
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " ");
    System.out.println();

    System.out.print( "map.keys() = " );
    e = map.keys();
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " ");
    System.out.println();

    System.out.print( "map.keys( Squeak ) = " );
    e = map.keys( "Squeak" );
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " ");
    System.out.println();

    System.out.print( "map.values( bat ) = " );
    e = map.values( "bat" );
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " ");
    System.out.println();
    }
  }

