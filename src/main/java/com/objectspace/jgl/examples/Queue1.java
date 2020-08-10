package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, pushing, popping.
 *
 * @see Queue
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Queue1
  {
  public static void main( String[] args )
    {
    // Use an SList as the underlying data structure.
    Queue queue = new Queue();
    queue.push( "bat" );
    queue.push( "cat" );
    queue.push( "dog" );

    System.out.println( "Print the Queue." );
    System.out.println( queue );
    System.out.println();

    System.out.println( "Non-destructively enumerate the Queue." );
    Enumeration e = queue.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Pop and print each element." );
    while ( !queue.isEmpty() )
      System.out.println( queue.pop() );
    }
  }
