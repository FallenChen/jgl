package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Exceptions.
 *
 * @see Array
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Array5
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    try
      {
      array.popBack();
      }
    catch ( InvalidOperationException exception )
      {
      System.out.println( "Caught " + exception );
      }
    array.add( "ape" );
    array.add( "bat" );
    array.add( "cat" );
    try
      {
      array.at( 5 );
      }
    catch ( IndexOutOfBoundsException exception )
      {
      System.out.println( "Caught " + exception );
      }

    }
  }
