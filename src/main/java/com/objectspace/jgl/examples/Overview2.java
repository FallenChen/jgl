package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Overview2
  {
  public static void main( String[] args )
    {
    HashSet set1 = new HashSet();
    set1.add( "red" );
    set1.add( "blue" );
    set1.add( "green" );

    HashSet set2 = new HashSet();
    set2.add( "yellow" );
    set2.add( "blue" );

    HashSet set3 = set1.union( set2 );
    HashSet set4 = set1.intersection( set2 );

    System.out.println( "set1 = " + set1 );
    System.out.println( "set2 = " + set2 );
    System.out.println( "union of set1 and set2 = " + set3 );
    System.out.println( "intersection of set1 and set2 = " + set4 );
    }
  }
