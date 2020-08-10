package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

public class Functions6
  {
  public static void main( String[] args )
    {
    DList list = new DList();
    list.add( "dog" );
    list.add( "ape" );
    list.add( "emu" );
    UnaryPredicate predicate = new BindSecondPredicate( new GreaterString(), "bat" );
    int n = Counting.countIf( list, predicate );
    System.out.println( "The number of strings in " + list + " > bat = " + n );
    }
  }
