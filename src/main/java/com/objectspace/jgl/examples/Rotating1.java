package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.util.*;

/**
 * Rotating a JGL container, copy during rotate.
 *
 * @see Rotating
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Rotating1
  {
  public static void main( String[] args )
    {
    Array array1 = new Array();
    for ( int i = 0; i < 5; i++ )
      array1.add( new Integer( i ) );
    for ( int i = 0; i < array1.size(); i++ )
      {
      Array array2 = new Array( array1 );
      ArrayIterator p = array2.begin();
      p.advance( i );
      Rotating.rotate( array2.begin(), p, array2.end() );
      System.out.println( "Rotate around index " + i + ", " + array1 + " -> " + array2 );
      }

    Deque d = new Deque();
    ArrayIterator q = array1.begin();
    q.advance( 1 );
    Rotating.rotateCopy( array1.begin(), q, array1.end(), new InsertIterator( d ) );
    System.out.println( "Rotate around index 2, " + array1 + " -> " + d );
    }
  }
