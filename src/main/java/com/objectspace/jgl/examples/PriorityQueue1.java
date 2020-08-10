package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, pushing, popping.
 *
 * @see PriorityQueue
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class PriorityQueue1
  {
  public static void main( String[] args )
    {
    // Use a HashComparator for comparing elements. Since the hash value of 
    // an Integer is its int value, this will order Integers in descending 
    // order.
    PriorityQueue queue = new PriorityQueue();
    queue.push( new Integer( 5 ) );
    queue.push( new Integer( -2 ) );
    queue.push( new Integer( 10 ) );
    queue.push( new Integer( 6 ) );
    queue.push( new Integer( 20 ) );
    queue.push( new Integer( -10 ) );

    // Note that although a PriorityQueue always pops objects in the order 
    // determined by the comparator, this *does not* mean that the objects 
    // are stored in order within the internal data structure. The internal 
    // data structure is organized as a heap.
    System.out.println( "Print the PriorityQueue." );
    System.out.println( queue );
    System.out.println();

    System.out.println( "Non-destructively enumerate the PriorityQueue." );
    Enumeration e = queue.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Pop and print each element." );
    while ( !queue.isEmpty() )
      System.out.println( queue.pop() );
    }
  }
