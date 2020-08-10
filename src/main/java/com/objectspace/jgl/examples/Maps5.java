package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

public class Maps5
  {
  public static void main( String[] args )
    {
    // Order key-value pairs in descending lexicographical order of keys.
    OrderedMap map = new OrderedMap( new GreaterString(), true );
    map.add( "10", "X" );
    map.add( "10", "ten" );
    map.add( "5", "V" );
    map.add( "5", "five" );

    System.out.println( "map = " + map );
    int n = map.count( "10" );
    System.out.println( "There are " + n + " key-value pairs with key 10" );

    System.out.println( "Removing all occurrences of 10..." );
    map.remove( "10" );

    n = map.count( "10" );
    System.out.println( "There are now " + n + " key-value pairs with key 10" );
    System.out.println( "map = " + map );
    }
  }
