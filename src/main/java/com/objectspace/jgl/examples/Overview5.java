package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import java.util.Vector;

public class Overview5
  {
  public static void main( String[] args )
    {
    Vector vector = new Vector(); // JDK Vector.
    vector.addElement( new Integer( 3 ) );
    vector.addElement( new Integer( -1 ) );
    vector.addElement( new Integer( 2 ) );
    System.out.println( "Unsorted java.util.Vector = " + vector );
    // A VectorArray makes a JDK vector look like a JGL container.
    VectorArray vectorArray = new VectorArray( vector );
    Sorting.sort( vectorArray );
    System.out.println( "Sorted = " + vector );
    }
  }
