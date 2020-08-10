package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Sequences2
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.add( "ape" );
    deque.add( "bat" );
    deque.add( "cat" );
    deque.add( "bat" );
    deque.add( "bat" );
    deque.add( "cat" );
    System.out.println( "deque = " + deque );

    System.out.println( "deque.count( bat ) = " + deque.count( "bat" ) );

    int index = deque.indexOf( "bat" );
    System.out.println( "deque.indexOf( bat ) = " + index );

    deque.remove( index );
    System.out.println( "After deque.remove( " + index + " ) = " + deque );

    deque.replace( 0, 2, "bat", "BAT" );
    System.out.println( "After deque.replace( 0, 2, bat, BAT ) = " + deque );
    System.out.println( "deque.remove( cat ) = " + deque.remove( "cat" ) );
    System.out.println( "After deque.remove( cat ) = " + deque );
    }
  }
