package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

/**
 * Use of comparator to order elements.
 *
 * @see com.objectspace.jgl,OrderedSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedSet2
  {
  public static void main( String[] args )
    {
    OrderedSet set = new OrderedSet( new LessString() );
    set.add( "cat" );
    set.add( "ape" );
    set.add( "dog" );
    set.add( "bat" );
    System.out.println( set );
    }
  }
