package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, access, acceptance of duplicates.
 *
 * @see HashMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class HashMap4
  {
  public static void main( String[] args )
    {
    HashMap map = new HashMap( true ); // allow duplicates
    map.add( new Integer( 2 ), "two" );
    map.add( new Integer( 4 ), "four" );
    System.out.println( map );
    System.out.println();

    System.out.println( "Enumerate the HashMap" );
    Enumeration e = map.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Iterate through the HashMap" );
    for ( HashMapIterator i = map.begin(); !i.atEnd(); i.advance() )
      System.out.println( i.get() + ", key = " + i.key() + ", value = " + i.value() );
    System.out.println();

    System.out.println( "Show that duplicates can be added." );
    map.add( new Integer( 8 ), "eight" );
    System.out.println( "map = " + map );

    map.add( new Integer( 4 ), "FOUR" );
    System.out.println( "map = " + map );

    System.out.println( "Show that even with duplicates, put() does a replacement." );
    map.put( new Integer( 4 ), "FoUr" );
    System.out.println( "map = " + map );

    }
  }
