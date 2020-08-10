package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;

/**
 * Applying provides algorithms for affecting every element in a container.
 *
 * @see Applying
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Algorithms1
  {
  public static void main( String[] args )
    {
    Array array1 = new Array();
    array1.add( "cat" );
    array1.add( "monkey" );
    array1.add( "goat" );
    Applying.forEach( array1, new PrintFunction() );

    SList list = new SList();
    list.add( new Integer( 3 ) );
    list.add( new Integer( 7 ) );
    list.add( new Integer( 4 ) );
    Integer total = (Integer)Applying.inject( list, new Integer( 0 ), new PlusNumber() );
    System.out.println( "list = " + list + ", total = " + total );
    }
  }

class PrintFunction implements UnaryFunction
  {
  public Object execute( Object object )
    {
    System.out.println( "PRINT " + object );
    return null; // Not used.
    }
  }
