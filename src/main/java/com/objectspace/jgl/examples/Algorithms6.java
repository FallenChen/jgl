package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Replacing provides algorithms for substituting elements in a container.
 *
 * @see Replacing
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Algorithms6
  {
  public static void main( String[] args )
    {
    DList list = new DList();
    list.add( new Integer( -1 ) );
    list.add( new Integer( 1 ) );
    list.add( new Integer( -2 ) );
    list.add( new Integer( 1 ) );
    list.add( new Integer( -3 ) );
    System.out.println( "list = " + list );

    Object oldValue = new Integer( 1 );
    Object newValue = new Integer( 4 );
    int n1 = Replacing.replace( list, oldValue, newValue );
    System.out.println( "after 1 -> 4, list = " + list );

    Array array = new Array();
    UnaryPredicate predicate = new NegativeNumber();
    newValue = new Integer( 0 );
    Replacing.replaceCopyIf( list, array, predicate, newValue );
    System.out.println( "list = " + list );
    System.out.println( "array = " + array );
    }
  }
