package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;

public class Functions5
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.add( new Integer( 4 ) );
    deque.add( new Integer( -2 ) );
    deque.add( new Integer( 3 ) );
    UnaryFunction function = new NegateNumber();
    System.out.println( "before = " + deque );
    Transforming.transform( deque, deque.begin(), function );
    System.out.println( "after = " + deque );
    }
  }
