package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Sequences7
  {
  public static void main( String[] args )
    {
    DList list = new DList();
    list.add( "D" );
    list.add( "C" );
    list.add( "C" );
    list.add( "B" );
    list.add( "A" );
    list.add( "A" );
    System.out.println( "list = " + list );

    list.unique();
    System.out.println( "list = " + list );

    list.reverse();
    System.out.println( "list = " + list );
    }
  }
