package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Counting, finding, replacing, removing.
 *
 * @see Array
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Array2
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "ape" );
    array.add( "bat" );
    array.add( "cat" );
    array.add( "bat" );
    array.add( "bat" );
    array.add( "cat" );
    System.out.println( array );
    System.out.println();

    System.out.println( "array.count( bat ) = " + array.count( "bat" ) );
    int index = array.indexOf( "bat" );
    System.out.println( "array.indexOf( bat ) = " + index );
    array.remove( index );
    System.out.println( "After array.remove( " + index + " ) = " + array );
    array.replace( 0, 2, "bat", "BAT" );
    System.out.println( "After array.replace( 0, 2, bat, BAT ) = " + array );
    System.out.println( "array.remove( cat ) = " + array.remove( "cat" ) );
    System.out.println( "After array.remove( cat ) = " + array );
    array.remove( array.begin() );
    System.out.println( "After array.remove( begin() ) = " + array );
    }
  }
