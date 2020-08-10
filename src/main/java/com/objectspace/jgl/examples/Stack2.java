package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Using a Vector as the underlying Sequence.
 *
 * @see com.objectspace.jgl.util.util.Stack
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Stack2
  {
  public static void main( String[] args )
    {
    // Use a Array as the underlying data structure.
    Stack stack = new Stack( new Array() );
    stack.push( "bat" );
    stack.push( "cat" );
    stack.push( "dog" );

    System.out.println( "Print the Stack." );
    System.out.println( stack );
    }
  }
