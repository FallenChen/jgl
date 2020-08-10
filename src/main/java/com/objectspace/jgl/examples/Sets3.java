package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

public class Sets3
  {
  public static void main( String[] args )
    {
    // Order elements based on their hash value.
    OrderedSet set1 = new OrderedSet();
    set1.add( new Integer( 1 ) );
    set1.add( new Integer( 3 ) );
    set1.add( new Integer( 2 ) );
    System.out.println( "set1 = " + set1 );

    // Order elements in descending numeric order.
    OrderedSet set2 = new OrderedSet( new GreaterNumber() );
    set2.add( new Integer( 1 ) );
    set2.add( new Integer( 3 ) );
    set2.add( new Integer( 2 ) );
    System.out.println( "set2 = " + set2 );
    }
  }
