package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

public class Maps3
  {
  public static void main( String[] args )
    {
    HashMap map = new HashMap( true ); // allow duplicates
    map.add( new Pair( "Dog", "Marble" ) );
    map.add( new Pair( "Cat", "Beauty" ) );
    map.add( new Pair( "Cat", "Agatha" ) );
    System.out.println( "map = " + map );

    System.out.println( "Enumerator through values..." );
    Enumeration values = map.elements();
    while ( values.hasMoreElements() )
      System.out.println( "  " + values.nextElement() );

    System.out.println( "Enumerate through keys..." );
    Enumeration keys = map.keys();
    while ( keys.hasMoreElements() )
      System.out.println( "  " + keys.nextElement() );
    }
  }
