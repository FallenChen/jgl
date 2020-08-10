package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, access, acceptance of duplicates.
 *
 * @see com.objectspace.jgl,OrderedMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedMap5
  {
  public static void main( String[] args )
    {
    OrderedMap map = new OrderedMap( true ); // allow duplicates
    map.add( new Integer( 2 ), "two" );
    map.add( new Integer( 4 ), "four" );
    System.out.println( map );
    System.out.println();

    System.out.println( "Enumerate the OrderedMap" );
    Enumeration e = map.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Iterate through the OrderedMap" );
    for ( OrderedMapIterator i = map.begin(); !i.atEnd(); i.advance() )
      System.out.println( i.get() + ", key = " + i.key() + ", value = " + i.value() );
    System.out.println();

    System.out.println( "Show that duplicates can be added." );
    map.add( new Integer( 8 ), "eight" );
    System.out.println( "map = " + map );

    map.add( new Integer( 4 ), "FOUR" );
    System.out.println( "map = " + map );
    }
  }
