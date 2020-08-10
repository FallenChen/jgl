package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Use of List as underlying Sequence.
 *
 * @see Queue
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Queue2
  {
  public static void main( String[] args )
    {
    // Use a DList as the underlying data structure.
    Queue queue = new Queue( new DList() );
    queue.push( "bat" );
    queue.push( "cat" );
    queue.push( "dog" );

    System.out.println( "Print the queue." );
    System.out.println( queue );
    }
  }
