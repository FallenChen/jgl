package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;
import java.util.Vector;

/**
 * Sorting a JDK Vector.
 *
 * @see Vector
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Vector1
  {
  public static void main( String[] args )
    {
    Vector vector = new Vector();
    vector.addElement( "dog" );
    vector.addElement( "ape" );
    vector.addElement( "bat" );
    System.out.println( "unsorted = " + vector );
    Sorting.sort( VectorIterator.begin( vector ), VectorIterator.end( vector ), new LessString() );
    System.out.println( "sorted = " + vector );
    }
  }
