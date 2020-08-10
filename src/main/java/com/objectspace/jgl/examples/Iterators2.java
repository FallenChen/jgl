package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Iterators2
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "magical" );
    array.add( "mystery" );
    array.add( "tour" );
    System.out.println( "before array = " + array );
    toUppercase( array );
    System.out.println( "after array = " + array );

    DList list = new DList();
    list.add( "magical" );
    list.add( "mystery" );
    list.add( "tour" );
    System.out.println( "before list = " + list );
    toUppercase( list );
    System.out.println( "after list = " + list );
    }

  static void toUppercase( Container container )
    {
    // Obtain iterator positioned at first element.
    ForwardIterator iterator = container.start();

    // Obtain iterator positioned immediately after last element.
    ForwardIterator end = container.finish();

    // Loop through every element.
    while ( !iterator.equals( end ) )
      {
      String current = (String) iterator.get();
      // Replace current element with uppercase equivalent.
      iterator.put( current.toUpperCase() );
      iterator.advance(); // Move forward by one element.
      }
    }
  }
