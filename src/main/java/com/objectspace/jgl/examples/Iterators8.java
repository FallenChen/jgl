package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;
import com.objectspace.jgl.util.*;

public class Iterators8
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "ape" );
    array.add( "giraffe" );
    array.add( "elephant" );
    System.out.println( "array = " + array );

    Deque deque = new Deque();
    InsertIterator iterator = new InsertIterator( deque );
    UnaryFunction function = new LengthString();
    Transforming.transform( array, iterator, function );
    System.out.println( "deque = " + deque );
    }
  }
