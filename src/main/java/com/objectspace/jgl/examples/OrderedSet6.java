package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, acceptance of duplicates.
 *
 * @see com.objectspace.jgl,OrderedSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedSet6
  {
  public static void main( String[] args )
    {
    // make the ordered set allow duplicates
    OrderedSet set = new OrderedSet( true );
    set.add( new Integer( 6 ) );
    set.add( new Integer( 1 ) );
    set.add( new Integer( 4 ) );
    set.add( new Integer( 1 ) );
    System.out.println( set );
    System.out.println();

    System.out.println( "Enumerate the OrderedSet" );
    Enumeration e = set.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Iterate through the OrderedSet" );
    for ( OrderedSetIterator i = set.begin(); !i.atEnd(); i.advance() )
      System.out.println( i.get() );
    System.out.println();

    System.out.println( "Show that duplicates can be added." );
    set.add( new Integer( 8 ) );
    System.out.println( "set = " + set );

    set.add( new Integer( 4 ) );
    System.out.println( "set = " + set );
    }
  }
