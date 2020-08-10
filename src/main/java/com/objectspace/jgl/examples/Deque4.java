package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Exceptions.
 *
 * @see com.objectspace.jgl,Deque
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Deque4
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    try
      {
      deque.popBack();
      }
    catch ( InvalidOperationException exception )
      {
      System.out.println( "Caught " + exception );
      }
    deque.add( "ape" );
    deque.add( "bat" );
    deque.add( "cat" );
    try
      {
      deque.at( 5 );
      }
    catch ( IndexOutOfBoundsException exception )
      {
      System.out.println( "Caught " + exception );
      }

    }
  }
