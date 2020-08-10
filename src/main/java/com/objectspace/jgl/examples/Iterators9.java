package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.util.*;
import java.util.Enumeration;

public class Iterators9
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "ape" );
    array.add( "bat" );
    array.add( "cat" );

    OutputStreamIterator output = new OutputStreamIterator( System.out );
    Enumeration input = array.elements();

    while ( input.hasMoreElements() )
      output.put( input.nextElement() );
    System.out.println(); // Flush output.

    // You can use an algorithm to do the same thing.
    Copying.copy( array, output );
    System.out.println(); // Flush output.
    }
  }
