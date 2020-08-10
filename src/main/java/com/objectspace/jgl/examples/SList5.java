package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Splicing a SList into another.
 *
 * @see SList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class SList5
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

    list1.splice( list1.begin(), list2 );
    System.out.println( "after: list1 = " + list1 + ", list2 = " + list2 );
    }
  }
