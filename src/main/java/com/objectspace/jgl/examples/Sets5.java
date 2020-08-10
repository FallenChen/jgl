package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.predicates.*;

public class Sets5
  {
  public static void main( String[] args )
    {
    Integer i1 = new Integer( 2 );
    Integer i2 = new Integer( 2 );

    HashSet set1 = new HashSet();
    System.out.println( "Using equals() to compare elements..." );
    System.out.println( "set1.add( i1 ) = " + set1.add( i1 ) );
    System.out.println( "set1.add( i1 ) = " + set1.add( i1 ) );
    System.out.println( "set1.add( i2 ) = " + set1.add( i2 ) );
    System.out.println( "set1.get( i1 ) = " + set1.get( i1 ) );
    System.out.println( "set1.get( i2 ) = " + set1.get( i2 ) );

    HashSet set2 = new HashSet( new IdenticalTo() );
    System.out.println( "Using == to compare elements..." );
    System.out.println( "set2.add( i1 ) = " + set2.add( i1 ) );
    System.out.println( "set2.add( i1 ) = " + set2.add( i1 ) );
    System.out.println( "set2.add( i2 ) = " + set2.add( i2 ) );
    System.out.println( "set2.get( i1 ) = " + set2.get( i1 ) );
    System.out.println( "set2.get( i2 ) = " + set2.get( i2 ) );
    }
  }
