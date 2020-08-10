package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Bounds.
 *
 * @see HashMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class HashMap7
  {
  public static void main( String[] args )
    {
    HashMap map = new HashMap( true ); // allow duplicates
    map.add( new Integer( 3 ), "three" );
    map.add( new Integer( 8 ), "eight" );
    map.add( new Integer( 2 ), "two" );
    map.add( new Integer( 3 ), "THREE" );
    System.out.println( map );

    Range range = map.equalRange( new Integer( 3 ) );
    while ( !range.begin.equals( range.end ) )
      System.out.println( "match @ " + range.begin.nextElement() );
    }
  }
