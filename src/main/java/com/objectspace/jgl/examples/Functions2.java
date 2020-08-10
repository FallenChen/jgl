package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

public class Functions2
  {
  public static void main( String[] args )
    {
    boolean array[] = { false, false, true, false, true };
    BooleanArray bools = new BooleanArray( array );
    UnaryPredicate predicate = new LogicalNot();
    int n = Counting.countIf( bools, predicate );
    System.out.println( "Number of false in " + bools + " = " + n );
    }
  }
