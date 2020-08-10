package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

public class Maps6
  {
  public static void main( String[] args )
    {
    Integer i1 = new Integer( 2 );
    Integer i2 = new Integer( 2 );

    HashMap map1 = new HashMap();
    System.out.println( "Using equals() to compare elements..." );
    System.out.println( "map1.add( i1, two ) = " + map1.add( i1, "two" ) );
    System.out.println( "map1.add( i1, two ) = " + map1.add( i1, "two" ) );
    System.out.println( "map1.add( i2, TWO ) = " + map1.add( i2, "TWO" ) );
    System.out.println( "map1.get( i1 ) = " + map1.get( i1 ) );
    System.out.println( "map1.get( i2 ) = " + map1.get( i2 ) );

    HashMap map2 = new HashMap( new IdenticalTo() );
    System.out.println( "Using == to compare elements..." );
    System.out.println( "map2.add( i1, two ) = " + map2.add( i1, "two" ) );
    System.out.println( "map2.add( i1, two ) = " + map2.add( i1, "two" ) );
    System.out.println( "map2.add( i2, TWO ) = " + map2.add( i2, "TWO" ) );
    System.out.println( "map2.get( i1 ) = " + map2.get( i1 ) );
    System.out.println( "map2.get( i2 ) = " + map2.get( i2 ) );
    }
  }
