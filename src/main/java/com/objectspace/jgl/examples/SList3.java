package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Insertion.
 *
 * @see SList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class SList3
  {
  public static void main( String[] args )
    {
    SList list = new SList();
    list.add( "bat" );
    list.add( "cat" );
    list.add( "dog" );
    System.out.println( "list = " + list );
    System.out.println();

    list.insert( list.begin(), "ape" );
    System.out.println( "After insert at begin = " + list );

    list.insert( list.end(), "emu" );
    System.out.println( "After insert at end = " + list );

    SListIterator i = list.begin();
    i.advance( 3 );
    list.insert( i, 2, "fox" );
    System.out.println( "After list.insert( i, 2, fox ) = " + list );
    }
  }
