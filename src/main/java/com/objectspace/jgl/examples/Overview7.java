package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;

public class Overview7
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.add( "your" );
    deque.add( "mission" );
    deque.add( "jim" );
    System.out.println( "Original deque = " + deque );
    Shuffling.randomShuffle( deque );
    System.out.println( "Shuffled deque = " + deque );
    }
  }
