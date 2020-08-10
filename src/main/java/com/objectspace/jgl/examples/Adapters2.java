package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import java.util.Vector;

/**
 * Adapting java.util.Vector with algorithm usage.
 *
 * @see com.objectspace.jgl.util.ArrayAdapter
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Adapters2
  {
  public static void main( String[] args )
    {
    Vector vector = new Vector();
    vector.addElement( new Integer( 3 ) );
    vector.addElement( new Integer( -1 ) );
    vector.addElement( new Integer( 2 ) );
    vector.addElement( new Integer( -3 ) );
    vector.addElement( new Integer( 4 ) );

    VectorArray vectorArray = new VectorArray( vector );
    System.out.println( "Unsorted JDK Vector = " + vectorArray );

    Sorting.sort( vectorArray );
    System.out.println( "Sorted = " + vectorArray );

    Shuffling.randomShuffle( vectorArray );
    System.out.println( "Randomized = " + vectorArray );

    System.out.println( "JDK vector = " + vector );
    }
  }
