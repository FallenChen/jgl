package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

public class Maps4
  {
  public static void main( String[] args )
    {
    // Order key-value pairs based on the hash value of the key.
    OrderedMap map1 = new OrderedMap();
    map1.put( new Integer( 1 ), "one" );
    map1.put( new Integer( 3 ), "three" );
    map1.put( new Integer( 2 ), "two" );
    System.out.println( "map1 = " + map1 );

    // Order key-value pairs in descending numeric order of key.
    OrderedMap map2 = new OrderedMap( new GreaterNumber() );
    map2.put( new Integer( 1 ), "one" );
    map2.put( new Integer( 3 ), "three" );
    map2.put( new Integer( 2 ), "two" );
    System.out.println( "map2 = " + map2 );
    }
  }
