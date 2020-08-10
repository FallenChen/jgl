package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.util.*;

public class Iterators7
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "ape" );
    array.add( "bat" );
    array.add( "cat" );
    array.add( "dog" );
    System.out.println( "array = " + array );

    ReverseIterator iterator = new ReverseIterator( array.end() );
    while ( iterator.hasMoreElements() )
      System.out.println( iterator.nextElement() );
    }
  }
