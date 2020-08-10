package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Sets6
  {
  public static void main( String[] args )
    {
    HashSet set1 = new HashSet();
    set1.add( "ape" );
    set1.add( "dog" );
    set1.add( "bat" );

    HashSet set2 = new HashSet();
    set2.add( "bat" );
    set2.add( "fox" );
    set2.add( "ape" );
    System.out.println( "set1 = " + set1 + ", set2 = " + set2 );

    HashSet set3 = set1.union( set2 );
    System.out.println( "set3 = set1.union( set2 ) = " + set3 );

    HashSet set4 = set1.intersection( set2 );
    System.out.println( "set4 = set1.intersection( set2 ) = " + set4 );

    HashSet set5 = set1.difference( set2 );
    System.out.println( "set5 = set1.difference( set2 ) = " + set5 );

    HashSet set6 = set1.symmetricDifference( set2 );
    System.out.println( "set6 = set1.symmetricDifference( set2 ) = " + set6 );

    System.out.println( "set4.subsetOf( set3 ) = " + set4.subsetOf( set3 ) );
    System.out.println( "set3.subsetOf( set4 ) = " + set3.subsetOf( set4 ) );
    }
  }
