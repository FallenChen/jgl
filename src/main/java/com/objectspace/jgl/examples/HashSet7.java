package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;
import java.util.Enumeration;

/**
 * Using another BinaryPredicate for matching
 *
 * @see HashSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class HashSet7
  {
  public static void main( String[] args )
    {
    HashSet set = new HashSet( new IdenticalTo() );
    set.add( new Integer( 6 ) );
    set.add( new Integer( 1 ) );
    set.add( new Integer( 4 ) );

    // this WILL work because it is a seperate object than the other Integer(1)
    set.add( new Integer( 1 ) );
    System.out.println( set );
    System.out.println();

    System.out.println( "Add an object Integer(100)" );
    Integer tryit = new Integer( 100 );
    System.out.println( "add returns: " + set.add( tryit ) );
    System.out.println( "set = " + set );
    System.out.println( "Try to add the EXACT same object Integer(100)" );
    System.out.println( "add returns: " + set.add( tryit ) );
    System.out.println( "set = " + set );
    }
  }
