package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Reversing provides algorithms for changing the order of a sequence.
 *
 * @see Reversing
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Algorithms7
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.add( "Batman" );
    deque.add( "Superman" );
    deque.add( "Phantom" );
    deque.add( "Spider-Man" );
    System.out.println( "before reverse = " + deque );
    Reversing.reverse( deque );
    System.out.println( "after reverse = " + deque );
    }
  }
