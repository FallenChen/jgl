package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Removal.
 *
 * @see Array
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Array6
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "Texas" );
    array.add( "Alabama" );
    array.add( "Texas" );
    array.add( "Mississippi" );
    array.add( "Texas" );
    array.add( "Louisiana" );
    array.add( "Texas" );
    array.add( "Alabama" );
    array.add( "Texas" );
    System.out.println( array );

    System.out.println( "removed " + array.remove( "Texas", 4 ) );
    System.out.println( array );

    System.out.println( "removed " + array.remove( "Alabama", 4 ) );
    System.out.println( array );

    System.out.println( "removed " + array.remove( "Georgia", 4 ) );
    System.out.println( array );
    }
  }
