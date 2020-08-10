package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Sequences1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.pushBack( "bat" ); // Add to end of array.
    array.add( "cat" ); // Synonym for pushBack().
    array.pushFront( "ape" ); // Insert at beginning of array.
    System.out.println( "array = " + array );
    System.out.println();

    System.out.println( "Demonstrate access" );
    System.out.println( "array.at( 0 ) = " + array.at( 0 ) );
    System.out.println( "array.front() = " + array.front() );
    System.out.println( "array.at( 2 ) = " + array.at( 2 ) );
    System.out.println( "array.back() = " + array.back() );

    System.out.println( "array.put( 1, \"fox\" )" );
    array.put( 1, "fox" );
    System.out.println( "array = " + array );

    array.popFront();
    System.out.println( "After popFront() = " + array );

    array.popBack();
    System.out.println( "After popBack() = " + array );
    }
  }
