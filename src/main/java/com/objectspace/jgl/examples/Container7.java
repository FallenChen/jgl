package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Container7
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "ape" );
    array.add( "cat" );
    try
      {
      Object object = array.at( 5 );
      }
    catch ( IndexOutOfBoundsException exception )
      {
      System.out.println( "Caught " + exception );
      }
    }
  }
