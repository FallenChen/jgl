package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Counting provides algorithms for tabulating the elements of a container.
 *
 * @see Counting
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Algorithms3
  {
  public static void main( String[] args )
    {
    SList list = new SList();
    list.add( new Integer( -1 ) );
    list.add( new Integer( 1 ) );
    list.add( new Integer( -2 ) );
    list.add( new Integer( 1 ) );
    list.add( new Integer( -3 ) );
    System.out.println( "list = " + list );

    Object value = new Integer( 1 );
    int n1 = Counting.count( list, value );
    System.out.println( "Occurences of " + value + " = " + n1 );

    int n2 = Counting.countIf( list, new NegativeNumber() );
    System.out.println( "Occurences of a negative = " + n2 );
    }
  }
