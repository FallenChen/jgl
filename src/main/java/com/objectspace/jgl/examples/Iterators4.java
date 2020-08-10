package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;

public class Iterators4
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( new Integer( 4 ) );
    array.add( new Integer( 7 ) );
    array.add( new Integer( 2 ) );
    array.add( new Integer( 7 ) );
    array.add( new Integer( 1 ) );
    array.add( new Integer( 7 ) );
    System.out.println( "array = " + array );

    // Obtain iterator positioned at first element.
    ArrayIterator first = array.begin();

    // Obtain iterator positioned immediately after third element.
    ArrayIterator last = array.begin();
    last.advance( 3 );

    // Sort first three elements.
    Sorting.sort( first, last );
    System.out.println( "array = " + array );

    // Replace 7 with 0 in last three elements.
    Replacing.replace( last, array.end(), new Integer( 7 ), new Integer( 0 ) );
    System.out.println( "array = " + array );
    }
  }
