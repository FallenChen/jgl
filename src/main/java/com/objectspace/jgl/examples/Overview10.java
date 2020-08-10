package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.util.*;

public class Overview10
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "jolly" );
    array.add( "good" );
    array.add( "show" );

    // Create a reverse iterator positioned at the end of the array.
    ReverseIterator iterator = new ReverseIterator( array.end() );
    while ( iterator.hasMoreElements() )
      System.out.println( iterator.nextElement() );
    }
  }
