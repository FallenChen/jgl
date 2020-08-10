package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

public class Stacks5
  {
  public static void main( String[] args )
    {
    // Use a GreaterString function object for comparing elements. This will
    // order strings in ascending order.
    PriorityQueue queue = new PriorityQueue( new GreaterString() );
    queue.push( "cat" );
    queue.push( "dog" );
    queue.push( "ape" );
    queue.push( "bat" );
    queue.push( "fox" );
    queue.push( "emu" );

    System.out.println( "Pop and print each element." );
    while ( !queue.isEmpty() )
      System.out.print( queue.pop() + " ");
    System.out.println();
    }
  }
