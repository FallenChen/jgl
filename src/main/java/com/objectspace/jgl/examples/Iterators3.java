package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Iterators3
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "ape" );
    array.add( "giraffe" );
    array.add( "lizard" );
    System.out.println( "array = " + array );

    // Obtain iterator positioned "just-past-the-end".
    ArrayIterator iterator = array.end();

    // Obtain iterator positioned at first element.
    ArrayIterator begin = array.begin();

    while ( !iterator.equals( begin ) )
      {
      iterator.retreat();
      System.out.println( iterator.get() );
      }
    }
  }