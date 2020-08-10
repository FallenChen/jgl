package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;
import com.objectspace.jgl.util.*;

/**
 * Transforming a single sequence, transforming a pair of sequences.
 *
 * @see Transforming
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Transforming1
  {
  public static void main( String[] args )
    {
    Deque deque = new Deque();
    deque.add( new Integer( 5 ) );
    deque.add( new Integer( 2 ) );
    deque.add( new Integer( -2 ) );
    System.out.println( "before = " + deque );
    Transforming.transform( deque, deque.begin(), new BindSecond( new TimesNumber(), new Integer( 2 ) ) );
    System.out.println( "doubled = " + deque );

    int ints[] = { 3, 4, 1, 2 };
    IntArray intArray = new IntArray( ints );
    System.out.println( "original = " + intArray );
    Array array = new Array();
    Transforming.transform( intArray, new InsertIterator( array ), new NegateNumber() );
    System.out.println( "negated = " + array );

    DList list1 = new DList();
    list1.add( "ape" );
    list1.add( "dog" );
    DList list2 = new DList();
    list2.add( "1" );
    list2.add( "2" );
    System.out.println( "list1 = " + list1 + ", list2 = " + list2 );
    Array result = new Array( 2 );
    Transforming.transform( list1, list2, result.begin(), new PlusString() );
    System.out.println( "result = " + result );
    }
  }
