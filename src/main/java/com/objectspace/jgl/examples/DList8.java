package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Splicing a DList into another.
 *
 * @see DList
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class DList8
  {
  public static void main( String[] args )
    {
    DList dlist = new DList();
    dlist.add( "apple" );
    dlist.add( "banana" );
    dlist.add( "lotus" );
    dlist.add( "ferrari" );
    dlist.add( "lamborghini" );
    System.out.println( "dlist = " + dlist );

    try
      {
      dlist.splice( dlist.begin(), dlist, dlist.begin(), dlist.end() );
      }
    catch ( InvalidOperationException ioe )
      {
      System.out.println( "Caught: " + ioe );
      }
    }
  }
