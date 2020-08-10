package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Printing an JGL container and a native array of primitives.
 *
 * @see Printing
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Printing1
  {
  public static void main( String[] args )
    {
    String[] strings = { "gnu", "emu", "dog" };
    ObjectIterator objectBegin = ObjectIterator.begin( strings );
    ObjectIterator objectEnd = ObjectIterator.end( strings );
    System.out.println( "strings = " + Printing.toString( objectBegin, objectEnd ) );
    System.out.print( "strings = " );
    Printing.println( objectBegin, objectEnd );

    int[] ints = { 3, 4, 7 };
    IntIterator intBegin = IntIterator.begin( ints );
    IntIterator intEnd = IntIterator.end( ints );
    System.out.println( "ints = " + Printing.toString( intBegin, intEnd ) );
    System.out.print( "ints = " );
    Printing.println( intBegin, intEnd );
    }
  }
