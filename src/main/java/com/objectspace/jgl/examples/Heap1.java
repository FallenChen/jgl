package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Making a heap, pushing and popping elements, sorting a heap.
 *
 * @see Heap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Heap1
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.add( "bat" );
    deque.add( "ape" );
    deque.add( "fox" );
    deque.add( "cat" );
    BinaryPredicate comparator = new LessString();
    Heap.makeHeap( deque.begin(), deque.end(), comparator );
    deque.add( "dog" );
    Heap.pushHeap( deque.begin(), deque.end(), comparator );
    deque.add( "emu" );
    Heap.pushHeap( deque.begin(), deque.end(), comparator );
    while ( !deque.isEmpty() )
      {
      System.out.println( deque.front() );
      Heap.popHeap( deque.begin(), deque.end(), comparator );
      deque.popBack();
      }

    Array vector = new Array();
    vector.add( "bat" );
    vector.add( "ape" );
    vector.add( "fox" );
    vector.add( "cat" );
    vector.add( "dog" );
    vector.add( "emu" );
    System.out.println( "unsorted vector = " + vector );
    Heap.makeHeap( vector.begin(), vector.end(), comparator );
    Heap.sortHeap( vector.begin(), vector.end(), comparator );
    System.out.println( "sorted vector = " + vector );
    }
  }
