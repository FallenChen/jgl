package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Maps7
  {
  public static void main( String[] args )
    {
    Pair pair1 = new Pair( "CAT", "Agatha" );
    Pair pair2 = new Pair( "DOG", "Misty" );
    HashMap map = new HashMap();
    map.add( pair1 );
    map.add( pair2 );
    System.out.println( "map = " + map );
    }
  }
