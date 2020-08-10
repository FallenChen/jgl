package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

public class Iterators1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "magical" );
    array.add( "mystery" );
    array.add( "tour" );
    Enumeration iterator = array.elements();
    while ( iterator.hasMoreElements() )
      System.out.println( iterator.nextElement() );
    }
  }
