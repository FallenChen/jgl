package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

public class Sets4
  {
  public static void main( String[] args )
    {
    // Order key-value pairs in descending lexicographical order of keys.
    // Note that "1" comes before "5".
    OrderedSet set = new OrderedSet( new GreaterString(), true );
    set.add( "10" );
    set.add( "10" );
    set.add( "5" );
    set.add( "5" );

    System.out.println( "set = " + set );
    int n = set.count( "10" );
    System.out.println( "There are " + n + " objects that match 10" );

    System.out.println( "Removing all occurrences of 10..." );
    set.remove( "10" );

    n = set.count( "10" );
    System.out.println( "There are now " + n + " objects that match 10" );
    System.out.println( "set = " + set );
    }
  }
