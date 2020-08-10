package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;
import com.objectspace.jgl.predicates.*;

public class Functions7
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "ape" );
    array.add( "giraffe" );
    array.add( "lizard" );

    BinaryPredicate comparator = new BinaryComposePredicate
      ( 
      new GreaterNumber(), 
      new LengthString(), 
      new LengthString() 
      );
    System.out.println( "before = " + array );

    Sorting.sort( array, comparator );
    System.out.println( "after = " + array );
    }
  }
