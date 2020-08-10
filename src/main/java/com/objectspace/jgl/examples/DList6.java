package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Splicing a piece of a DList into another.
 *
 * @see DList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class DList6
  {
  public static void main( String[] args )
    {
    DList dlist1 = new DList();
    dlist1.add( "apple" );
    dlist1.add( "banana" );
    DList dlist2 = new DList();
    dlist2.add( "lotus" );
    dlist2.add( "ferrari" );
    dlist2.add( "lamborghini" );
    System.out.println( "before: dlist1 = " + dlist1 + ", dlist2 = " + dlist2 );

    DListIterator i = dlist1.begin();
    i.advance();
    DListIterator start = dlist2.begin();
    DListIterator finish = dlist2.begin();
    finish.advance( 2 );
    dlist1.splice( i, dlist2, start, finish );
    System.out.println( "after: dlist1 = " + dlist1 + ", dlist2 = " + dlist2 );
    }
  }
