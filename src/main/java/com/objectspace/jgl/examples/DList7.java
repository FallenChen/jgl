package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Reversing, removing, filtering.
 *
 * @see DList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class DList7
  {
  public static void main( String[] args )
    {
    DList dlist = new DList();
    dlist.add( "x" );
    dlist.add( "l" );
    dlist.add( "x" );
    dlist.add( "g" );
    dlist.add( "s" );
    dlist.add( "s" );
    System.out.println( "dlist = " + dlist );

    dlist.reverse();
    System.out.println( "After dlist.reverse() = " + dlist );

    dlist.remove( "x" );
    System.out.println( "After dlist.remove( x ) = " + dlist );

    dlist.unique();
    System.out.println( "After dlist.unique() = " + dlist );
    }
  }
