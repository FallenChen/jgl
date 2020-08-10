package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;

/**
 * Applying a unary function to every element of a sequence.
 *
 * @see Applying
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Applying1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "cat" );
    array.add( "dog" );
    array.add( "emu" );
    System.out.println( "array = " + array );

    System.out.println( "Print each element to standard output" );
    Applying.forEach( array.begin(), array.end(), new Print() );

    System.out.println( "Print each element to standard output" );
    Applying.forEach( array, new Print() );
    }
  }
