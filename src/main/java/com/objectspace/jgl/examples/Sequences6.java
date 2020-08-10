package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Sequences6
  {
  public static void main( String[] args )
    {
    SList slist1 = new SList();
    slist1.add( "D" );
    slist1.add( "B" );
    SList slist2 = new SList();
    slist2.add( "E" );
    slist2.add( "A" );
    slist2.add( "C" );
    System.out.println( "slist1 = " + slist1 + ", slist2 = " + slist2 );

    // Insert the whole of slist2 in front of the 1st element of slist1.
    slist1.splice( 0, slist2 );
    System.out.println( "slist1 = " + slist1 + ", slist2 = " + slist2 );

    // Move the 1st element to the end of the slist.
    slist1.splice( 5, slist1, 0 );
    System.out.println( "slist1 = " + slist1 + ", slist2 = " + slist2 );

    // Move the 2nd and 3rd elements to be in front of the last element.
    slist1.splice( 4, slist1, 1, 2 );
    System.out.println( "slist1 = " + slist1 + ", slist2 = " + slist2 );
    }
  }
