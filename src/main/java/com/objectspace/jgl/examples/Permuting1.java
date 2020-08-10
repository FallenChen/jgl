package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Creating permutations of an JGL container and a native array of Objects.
 *
 * @see Permuting
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Permuting1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( new Integer( 0 ) );
    array.add( new Integer( 2 ) );
    array.add( new Integer( 5 ) );
    do
      {
      System.out.println( "array = " + array );
      }
    while ( Permuting.nextPermutation( array, new LessNumber() ) );

    String[] strings = { "gnu", "emu", "dog" };
    ObjectArray strArray = new ObjectArray( strings );
    do
      {
      System.out.println( strArray );
      }
    while ( Permuting.prevPermutation( strArray, new LessString() ) );
    }
  }
