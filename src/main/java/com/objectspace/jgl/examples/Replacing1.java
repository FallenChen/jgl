package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;
import com.objectspace.jgl.util.*;

/**
 * Replacing an element in a native array of primitives, copy during replacement.
 *
 * @see Replacing
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Replacing1
  {
  public static void main( String[] args )
    {
    int intArray[] = { 3, 6, 2, 1, 9, 6, 4, 2 };
    IntArray i = new IntArray( intArray );
    System.out.print( "Before: " );
    Printing.println( i.start(), i.finish() );
    Replacing.replace( i.start(), i.finish(), new Integer( 6 ), new Integer( 0 ) );
    System.out.print( "After: " );
    Printing.println( i.start(), i.finish() );

    Array array = new Array();
    array.add( "ape" );
    array.add( "cat" );
    array.add( "bat" );
    array.add( "cat" );
    Deque deque = new Deque();
    Replacing.replaceCopy( array, new InsertIterator( deque ), "cat", "emu" );
    System.out.println( "array = " + array + ", deque = " + deque );
    }
  }
