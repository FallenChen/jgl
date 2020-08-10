package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.util.*;

/**
 * Reversing a JGL container, reversing a native array of primitives.
 *
 * @see Reversing
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Reversing1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    for ( int i = 0; i < 10; i++ )
      array.add( new Integer( i ) );
    System.out.println( "array = " + array );
    Reversing.reverse( array );
    System.out.println( "after reverse = " + array );

    int ints[] = new int[ 10 ];
    for ( int i = 0; i < ints.length; i++ )
      ints[ i ] = i;
    IntArray intArray = new IntArray( ints );
    System.out.println( "primitive array = " + intArray );
    Array result = new Array();
    Reversing.reverseCopy( intArray, new InsertIterator( result ) );
    System.out.println( "Array of reversed array = " + result );
    }
  }
