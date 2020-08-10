package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

public class Functions3
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.add( "cat" );
    deque.add( "ape" );
    deque.add( "dog" );
    deque.add( "bat" );
    System.out.println( "unsorted = " + deque );
    BinaryPredicate comparator = new GreaterString();
    Sorting.sort( deque, comparator );
    System.out.println( "sorted = " + deque );
    }
  }
