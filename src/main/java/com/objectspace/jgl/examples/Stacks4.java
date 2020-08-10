package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

public class Stacks4
  {
  public static void main( String[] args )
    {
    // Use a HashComparator for comparing elements. Since the hash value of an
    // Integer is its int value, this will order Integers in descending order.
    PriorityQueue queue = new PriorityQueue();
    queue.push( new Integer( 5 ) );
    queue.push( new Integer( -2 ) );
    queue.push( new Integer( 10 ) );
    queue.push( new Integer( 6 ) );
    queue.push( new Integer( 20 ) );
    queue.push( new Integer( -10 ) );

    System.out.println( "queue = " + queue );
    System.out.println();

    System.out.println( "Non-destructively enumerate the PriorityQueue." );
    Enumeration e = queue.elements();
    while ( e.hasMoreElements() )
      System.out.print( e.nextElement() + " " );
    System.out.println();

    System.out.println( "Pop and print each element." );
    while ( !queue.isEmpty() )
      System.out.print( queue.pop() + " " );
    System.out.println();
    }
  }
