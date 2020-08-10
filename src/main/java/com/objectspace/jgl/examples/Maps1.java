package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Maps1
  {
  public static void main( String[] args )
    {
    HashMap map = new HashMap();
    Object value;

    value = map.add( "Dog", "Marble" );
    System.out.println( "value from add = " + value );

    value = map.add( "Cat", "Beauty" );
    System.out.println( "value from add = " + value );
    System.out.println( "map = " + map );

    value = map.add( "Cat", "Agatha" );
    System.out.println( "value from add = " + value );
    System.out.println( "map = " + map );

    value = map.get( "Cat" );
    System.out.println( "Cat name is " + value );

    value = map.get( "Ape" );
    System.out.println( "Ape name is " + value );

    value = map.put( "Cat", "Agatha" );
    System.out.println( "value from put = " + value );
    System.out.println( "map = " + map );

    String name3 = (String)map.get( "Cat" );
    System.out.println( "Cat name is " + name3 );
    }
  }
