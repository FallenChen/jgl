package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import java.util.Vector;

/**
 * Sorting a primitive array without iterators.
 *
 * @see Sorting
 * @version 1.0
 * @author ObjectSpace, Inc.
 */

public class Sorting2
  {
  public static void main( String[] args )
    {
    System.out.println( "Sort a primitive array of chars" );
    char c[] = { 'c', 'z', 'e', 'f', 'g', 'o', 'a' };
    CharArray cArray = new CharArray( c );
    System.out.println( "unsorted = " + c );
    Sorting.sort( cArray );
    System.out.println( "sorted   = " + c );
    }
  }
