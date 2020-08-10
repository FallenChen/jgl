package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Bounds. Duplicates allowed.
 *
 * @see HashSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class HashSet6
  {
  public static void main( String[] args )
    {
    HashSet set = new HashSet( true ); // allow duplicates
    set.add( new Integer( 3 ) );
    set.add( new Integer( 8 ) );
    set.add( new Integer( 2 ) );
    set.add( new Integer( -2 ) );
    set.add( new Integer( 3 ) );
    set.add( new Integer( 10 ) );
    System.out.println( set );

    Range range = set.equalRange( new Integer( 3 ) );
    while ( !range.begin.equals( range.end ) )
      System.out.println( "match @ " + range.begin.nextElement() );
    }
  }
