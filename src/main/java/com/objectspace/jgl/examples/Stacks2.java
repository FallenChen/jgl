package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Stacks2
  {
  public static void main( String[] args )
    {
    // Use a DList as the underlying data structure.
    Stack stack = new Stack( new DList() );
    stack.push( "bat" );
    stack.push( "cat" );
    stack.push( "dog" );

    System.out.println( "Print the Stack." );
    System.out.println( stack );
    }
  }
