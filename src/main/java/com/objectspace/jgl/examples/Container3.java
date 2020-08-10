package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Container3
  {
  public static void main( String[] args )
    {
    Array array1 = new Array();
    array1.add( "triangle" );
    array1.add( "square" );
    array1.add( "pentagon" );
    System.out.println( "array1 = " + array1 );

    // Illustrate copy construction.
    Array array2 = new Array( array1 );
    System.out.println( "array2 = " + array2 );
    System.out.println( "array1.equals( array2 ) = " + array1.equals( array2 ) );

    // Illustrate assignment using copy().
    Array array3 = new Array();
    array3.add( "heptagon" );
    array3.add( "octagon" );
    System.out.println( "before copy, array3 = " + array3 );
    array3.copy( array1 );
    System.out.println( "after copy, array3 = " + array3 );

    // Illustrate cloning.
    Array array4 = (Array) array1.clone();
    System.out.println( "array4 = " + array4 );
    }
  }
