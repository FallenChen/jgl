package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Insertion.
 *
 * @see DList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class DList3
  {
  public static void main( String[] args )
    {
    DList dlist = new DList();
    dlist.add( "bat" );
    dlist.add( "cat" );
    dlist.add( "dog" );
    System.out.println( "dlist = " + dlist );
    System.out.println();

    dlist.insert( dlist.begin(), "ape" );
    System.out.println( "After insert at begin = " + dlist );

    dlist.insert( dlist.end(), "emu" );
    System.out.println( "After insert at end = " + dlist );

    DListIterator i = dlist.begin();
    i.advance( 3 );
    dlist.insert( i, 2, "fox" );
    System.out.println( "After dlist.insert( i, 2, fox ) = " + dlist );
    }
  }
