package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;

/**
 * Adapt a primitive array to algorithms and to a buffer.
 *
 * @see com.objectspace.jgl.util.ArrayAdapter
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Adapters3
  {
  public static void main( String[] args )
    {
    // start with a native array
    float floats[] = { 3.0f, -1.1f, 2.0f, -3.1f, 4.0f };
    System.out.print( "native = " );
    Printing.println( FloatIterator.begin( floats ), FloatIterator.end( floats ) );

    // FloatArray affects the underlying array
    FloatArray floatArray = new FloatArray( floats );
    System.out.println( "Unsorted = " + floatArray );
    Sorting.sort( floatArray );
    System.out.println( "Sorted = " + floatArray );
    Shuffling.randomShuffle( floatArray );
    System.out.println( "Randomized = " + floatArray );
    System.out.print( "native = " );
    Printing.println( FloatIterator.begin( floats ), FloatIterator.end( floats ) );

    // FloatBuffer does not affect the underlying array
    FloatBuffer floatBuffer = new FloatBuffer( floats );
    System.out.println( "Unsorted = " + floatBuffer );
    Sorting.sort( floatBuffer );
    System.out.println( "Sorted = " + floatBuffer );
    Shuffling.randomShuffle( floatBuffer );
    System.out.println( "Randomized = " + floatBuffer );
    System.out.print( "native = " );
    Printing.println( FloatIterator.begin( floats ), FloatIterator.end( floats ) );

    // Buffers are growable
    floatBuffer.insert( 3, 5.6f );
    System.out.println( "Inserted = " + floatBuffer );
    floatBuffer.remove( 1, 3 );
    System.out.println( "Removed = " + floatBuffer );

    // and return to a native array
    floats = floatBuffer.get();
    System.out.print( "native = " );
    Printing.println( FloatIterator.begin( floats ), FloatIterator.end( floats ) );
    }
  }
