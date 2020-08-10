package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

public class Removing2
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.add( new Integer( 7 ) );
    deque.add( new Integer( 86 ) );
    deque.add( new Integer( 21 ) );
    deque.add( new Integer( 69 ) );
    System.out.println( "original=" + deque );

    UnaryPredicate predicate = new BindSecondPredicate( new LessNumber(), new Integer( 42 ) );
    ForwardIterator result = Removing.removeIf( deque, predicate );
    System.out.println( "after algo=" + deque );

    deque.remove( result, deque.finish() ); 
    System.out.println( "after remove=" + deque );
    }
  }
