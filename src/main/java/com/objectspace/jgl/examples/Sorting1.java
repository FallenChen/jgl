package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;
import java.util.Vector;

/**
 * Sorting a Vector, a java.util.Vector, and a native array of primitives.
 *
 * @see Sorting
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Sorting1
  {
  public static void main( String[] args )
    {
    System.out.println( "Sort an Array of Integers" );
    Array array = new Array();
    array.add( new Integer( 7 ) );
    array.add( new Integer( 10 ) );
    array.add( new Integer( 3 ) );
    array.add( new Integer( -4 ) );
    System.out.println( "unsorted = " + array );
    Sorting.sort( array );
    System.out.println( "ascending = " + array );
    Sorting.sort( array, new GreaterNumber() );
    System.out.println( "descending = " + array );
    System.out.println();

    System.out.println( "Sort a java.util.Vector of Strings" );
    Vector vector = new Vector();
    vector.addElement( "dog" );
    vector.addElement( "ape" );
    vector.addElement( "fox" );
    vector.addElement( "bat" );
    VectorArray vectorArray = new VectorArray( vector );
    System.out.println( "unsorted = " + vectorArray );
    Sorting.sort( vectorArray, new LessString() );
    System.out.println( "ascending = " + vectorArray );
    System.out.println();

    System.out.println( "Sort a primitive array of ints" );
    int ints[] = { 3, 6, 1, 2, 9, 8, 1, 8 };
    IntArray intArray = new IntArray( ints );
    System.out.println( "unsorted = " + intArray );
    Sorting.sort( intArray, new GreaterNumber() );
    System.out.println( "descending = " + intArray );

    ForwardIterator start = intArray.start();
    ForwardIterator finish = intArray.finish();
    start.advance(3);
    Sorting.sort( start, finish );
    System.out.println( "partially ascending = " + intArray );
    }
  }
