package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Changing the order of traversal for containers.
 *
 * @see Sorting
 * @version 1.0
 * @author ObjectSpace, Inc.
 */

public class Sorting3
  {
  public static void main( String[] args )
    {
    HashSet s = new HashSet();
    s.add( "Austin" );
    s.add( "Texas" );
    s.add( "Fight" );
    s.add( "longhorn" );
    s.add( "Bevo" );

    // show in the default order
    System.out.print( "normal: " );
    Printing.println( s.begin(), s.end() );

    // show sorted
    System.out.print( "less: " );
    Range r = Sorting.iterSort( s, new LessString() );
    Printing.println( r.begin, r.end );

    // show sorted a different way
    System.out.print( "greater: " );
    r = Sorting.iterSort( s, new GreaterString() );
    Printing.println( r.begin, r.end );

    // show that iterSort() doesn't sort container
    System.out.print( "normal: " );
    Printing.println( s.begin(), s.end() );
    }
  }
