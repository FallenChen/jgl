package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Container1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "triangle" );
    array.add( "square" );
    array.add( "pentagon" );
    array.add( "hexagon" );
    System.out.println( "array = " + array );
    System.out.println( "array.size() = " + array.size() );
    System.out.println( "array.empty() = " + array.isEmpty() );
    array.clear();
    System.out.println( "after array is cleared..." );
    System.out.println( "array.size() = " + array.size() );
    System.out.println( "array.empty() = " + array.isEmpty() );
    }
  }
