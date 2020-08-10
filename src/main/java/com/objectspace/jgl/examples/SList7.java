package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Removing.
 *
 * @see SList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class SList7
  {
  public static void main( String[] args )
    {
    SList list = new SList();
    list.add( "x" );
    list.add( "l" );
    list.add( "x" );
    list.add( "g" );
    list.add( "s" );
    list.add( "s" );
    System.out.println( "list = " + list );

    list.remove( "x" );
    System.out.println( "After list.remove( x ) = " + list );
    }
  }
