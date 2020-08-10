package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, rejection of duplicates.
 *
 * @see HashSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class HashSet1
  {
  public static void main( String[] args )
    {
    HashSet set = new HashSet();
    set.add( new Integer( 6 ) );
    set.add( new Integer( 1 ) );
    set.add( new Integer( 4 ) );
    System.out.println( set );
    System.out.println();

    System.out.println( "Enumerate the HashSet" );
    Enumeration e = set.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Iterate through the HashSet" );
    for ( HashSetIterator i = set.begin(); !i.atEnd(); i.advance() )
      System.out.println( i.get() );
    System.out.println();

    System.out.println( "Show that duplicates cannot be added." );
    Object value = set.add( new Integer( 8 ) );
    if ( value != null )
      System.out.println( "Could not add 8." );
    else
      {
      System.out.println( "Added 8" );
      System.out.println( "New contents are " + set );
      }

    value = set.add( new Integer( 4 ) );
    if ( value != null )
      System.out.println( "Could not add 4." );
    else
      {
      System.out.println( "Added 4." );
      System.out.println( "New contents are " + set );
      }
    }
  }
