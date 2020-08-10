package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;
import com.objectspace.jgl.util.*;

/**
 * Transforming - collect objects from a container
 *
 * @see Transforming
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Transforming2
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "dog" );
    array.add( "barking animal" );
    array.add( "walking" );
    DList dlist = new DList();
    Copying.copy( array, new InsertIterator( dlist ) );

    System.out.println( "array = " + array );
    System.out.println( "dlist = " + dlist );

    System.out.println();
    System.out.println( "collect(array) = " + Transforming.collect( array.begin(), array.end(), new LengthString() ) );
    System.out.println( "collect(dlist) = " + Transforming.collect( dlist, new LengthString() ) );
    }
  }
