package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.util.*;

/**
 * Collapsing consecutive elements in a native array of Objects and an JGL container.
 *
 * @see Filtering
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Filtering1
  {
  public static void main( String[] args )
    {
    String[] strings = { "gnu", "emu", "emu", "fox", "fox", "fox", "gnu" };
    ObjectIterator begin = ObjectIterator.begin( strings );
    ObjectIterator end = ObjectIterator.end( strings );
    System.out.print( "strings = " );
    Printing.println( begin, end );
    ObjectIterator last = (ObjectIterator)Filtering.unique( begin, end );
    System.out.print( "filtered strings = " );
    Printing.println( begin, end );
    int remaining = begin.distance( last );
    System.out.println( "remaining = " + remaining );
    System.out.print( "filtered array with bounds given = " );
    end.retreat( remaining );
    Printing.println( begin, end );

    Array array = new Array();
    array.add( "gnu" );
    array.add( "emu" );
    array.add( "emu" );
    array.add( "fox" );
    array.add( "fox" );
    array.add( "fox" );
    array.add( "gnu" );
    System.out.println( "array = " + array );
    Deque deque = new Deque();
    Filtering.uniqueCopy( array, new InsertIterator( deque ) );
    System.out.println( "deque = " + deque );
    }
  }
