package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Exceptions.
 *
 * @see DList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class DList4
  {
  public static void main( String[] args )
    {
    DList dlist = new DList();
    try
      {
      dlist.popBack();
      }
    catch ( InvalidOperationException exception )
      {
      System.out.println( "Caught " + exception );
      }
    dlist.add( "ape" );
    dlist.add( "bat" );
    dlist.add( "cat" );
    try
      {
      dlist.at( 5 );
      }
    catch ( IndexOutOfBoundsException exception )
      {
      System.out.println( "Caught " + exception );
      }

    }
  }
