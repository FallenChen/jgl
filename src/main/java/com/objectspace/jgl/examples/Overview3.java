package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration; // JDK enumeration class.

public class Overview3
  {
  public static void main( String[] args )
    {
    Array array = new Array(); // Growable array.
    array.add( "nemesis" );
    array.add( "dig" );
    array.add( "myst" );

    Enumeration iterator = array.elements();
    while ( iterator.hasMoreElements() )
      System.out.println( iterator.nextElement() );
    System.out.println();

    DList list = new DList(); // Doubly-linked list.
    list.add( "agatha" );
    list.add( "beauty" );
    list.add( "truth" );

    iterator = list.elements();
    while ( iterator.hasMoreElements() )
      System.out.println( iterator.nextElement() );
    }
  }
