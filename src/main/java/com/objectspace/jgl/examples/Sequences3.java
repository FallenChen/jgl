package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Sequences3
  {
  public static void main( String[] args )
    {
    DList list = new DList();
    list.add( "bat" );
    list.add( "cat" );
    list.add( "dog" );
    System.out.println( "list = " + list );

    list.insert( 0, "ape" );
    System.out.println( "After insert at begin = " + list );

    list.insert( list.size(), "emu" );
    System.out.println( "After insert at end = " + list );

    list.insert( 3, 2, "fox" );
    System.out.println( "After list.insert( 3, 2, fox ) = " + list );
    }
  }
