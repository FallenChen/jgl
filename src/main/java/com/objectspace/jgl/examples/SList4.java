package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Exceptions.
 *
 * @see SList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class SList4
  {
  public static void main( String[] args )
    {
    SList list = new SList();
    try
      {
      list.popBack();
      }
    catch ( InvalidOperationException exception )
      {
      System.out.println( "Caught " + exception );
      }
    list.add( "ape" );
    list.add( "bat" );
    list.add( "cat" );
    try
      {
      list.at( 5 );
      }
    catch ( IndexOutOfBoundsException exception )
      {
      System.out.println( "Caught " + exception );
      }

    }
  }
