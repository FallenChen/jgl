package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

public class Stacks1
  {
  public static void main( String[] args )
    {
    Stack stack = new Stack();
    stack.push( "bat" );
    stack.push( "cat" );
    stack.push( "dog" );
    System.out.println( "stack = " + stack );
    System.out.println();

    System.out.println( "Non-destructively enumerate the Stack." );
    Enumeration e = stack.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Pop and print each element." );
    while ( !stack.isEmpty() )
      System.out.println( stack.pop() );
    }
  }
