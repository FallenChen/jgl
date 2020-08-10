package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;
import com.objectspace.jgl.util.*;

/**
 * Removing element from a container, conditional removal.
 *
 * @see Removing
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Removing1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "ape" );
    array.add( "cat" );
    array.add( "dog" );
    array.add( "cat" );
    array.add( "emu" );
    System.out.println( "Before = " + array );
    Removing.remove( array, "cat" );
    System.out.println( "After = " + array );

    Deque deque = new Deque();
    deque.add( new Integer( 3 ) );
    deque.add( new Integer( 8 ) );
    deque.add( new Integer( 4 ) );
    deque.add( new Integer( 10 ) );
    DList result = new DList();
    UnaryPredicate predicate = new BindSecondPredicate( new LessNumber(), new Integer( 5 ) );
    Removing.removeCopyIf( deque, new InsertIterator( result ), predicate );
    System.out.println( "deque = " + deque + ", result = " + result );
    }
  }
