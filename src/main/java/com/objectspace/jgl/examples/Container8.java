package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Container8
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    try
      {
      Object object = array.front();
      }
    catch ( InvalidOperationException exception )
      {
      System.out.println( "Caught " + exception );
      }
    }
  }
