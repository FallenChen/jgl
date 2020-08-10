package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

public class Container2
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "triangle" );
    array.add( "square" );
    array.add( "pentagon" );
    array.add( "hexagon" );

    Enumeration iterator = array.elements();
    while ( iterator.hasMoreElements() )
      System.out.println( iterator.nextElement() );
    }
  }
