package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import java.util.Vector;

/**
 * Copying provides algorithms for adding contents of one container to another.
 *
 * @see Copying
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Algorithms2
  {
  public static void main( String[] args )
    {
    int ints[] = { 2, 6, 3, 7 };
    Vector vector = new Vector();
    vector.addElement( new Integer( 1 ) );
    vector.addElement( new Integer( 4 ) );

    // Create container adapters.
    IntArray intArray = new IntArray( ints );
    VectorArray vectorArray = new VectorArray( vector );

    System.out.println( "vector before copying = " + vector );
    Copying.copy( intArray, vectorArray );
    System.out.println( "vector after copying = " + vector );
    }
  }
