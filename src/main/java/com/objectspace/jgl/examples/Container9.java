package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Container9
  {
  public static void main( String[] args )
    {
    try
      {
      Array array = new Array( -2 );
      }
    catch ( IllegalArgumentException exception )
      {
      System.out.println( "Caught " + exception );
      }
    }
  }
