package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;

/**
 * Transforming provides algorithms for modifying elements in a sequence.
 *
 * @see Transforming
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Algorithms9
  {
  public static void main( String[] args )
    {
    int ints1[] = { 1, 3, 5, 2 };
    Array array = new Array();
    IntArray intArray1 = new IntArray( ints1 );
    UnaryFunction function = new NegateNumber();
    Transforming.transform( intArray1, array, function );
    System.out.println( "ints1 = " + intArray1 );
    System.out.println( "array = " + array );
    System.out.println();

    int ints2[] = { 2, 4, 2, 3 };
    int ints3[] = { 3, 6, 2, 1 };
    SList list = new SList();
    IntArray intArray2 = new IntArray( ints2 );
    IntArray intArray3 = new IntArray( ints3 );
    BinaryFunction function2 = new TimesNumber();
    Transforming.transform( intArray2, intArray3, list, function2 );
    System.out.println( "ints2 = " + intArray2 );
    System.out.println( "ints3 = " + intArray3 );
    System.out.println( "list = " + list );
    System.out.println();

    Array array1 = new Array();
    array1.add( "cat" );
    array1.add( "monkey" );
    array1.add( "goat" );
    System.out.println( "array1 = " + array1 );
    Array array2 = (Array)Transforming.collect( array1, new LengthString() );
    System.out.println( "array2 = " + array2 );
    }
  }
