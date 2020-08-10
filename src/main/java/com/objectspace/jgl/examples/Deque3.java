package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Insertion.
 *
 * @see com.objectspace.jgl,Deque
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Deque3
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.add( "bat" );
    deque.add( "cat" );
    deque.add( "dog" );
    System.out.println( "deque = " + deque );
    System.out.println();

    deque.insert( deque.begin(), "ape" );
    System.out.println( "After insert at begin = " + deque );

    deque.insert( deque.end(), "emu" );
    System.out.println( "After insert at end = " + deque );

    deque.insert( 3, 2, "fox" );
    System.out.println( "After deque.insert( 3, 2, fox ) = " + deque );
    }
  }
