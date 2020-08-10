package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Finding provides algorithms for locating elements in a container.
 *
 * @see Finding
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Algorithms4
  {
  public static void main( String[] args )
    {
    int ints[] = { 3, 7, 8, 2, -5, 8, 9, -2 };
    IntArray array = new IntArray( ints );
    System.out.println( "array = " + array );

    Integer negative = (Integer)Finding.detect( array, new NegativeNumber() );
    System.out.println( "first negative = " + negative );

    boolean some = Finding.some( array, new NegativeNumber() );
    System.out.println( "some items are negative = " + some );
    }
  }
