package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

public class Stacks3
  {
  public static void main( String[] args )
    {
    Queue queue = new Queue();
    queue.push( "bat" );
    queue.push( "cat" );
    queue.push( "dog" );

    System.out.println( "queue = " + queue );
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
