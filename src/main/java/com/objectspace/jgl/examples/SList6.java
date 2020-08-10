package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Splicing a piece of a SList into another.
 *
 * @see SList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class SList6
  {
  public static void main( String[] args )
    {
    SList list1 = new SList();
    list1.add( "apple" );
    list1.add( "banana" );
    SList list2 = new SList();
    list2.add( "lotus" );
    list2.add( "ferrari" );
    list2.add( "lamborghini" );
    System.out.println( "before: list1 = " + list1 + ", list2 = " + list2 );

    SListIterator i = list1.begin();
    i.advance();
    SListIterator start = list2.begin();
    SListIterator finish = list2.begin();
    finish.advance( 2 );
    list1.splice( i, list2, start, finish );
    System.out.println( "after: list1 = " + list1 + ", list2 = " + list2 );
    }
  }
