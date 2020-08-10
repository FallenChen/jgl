package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Iterators5
  {
  public static void main( String[] args )
    {
    DList list = new DList();
    list.add( "ape" );
    list.add( "bat" );
    list.add( "cat" );
    list.add( "dog" );
    System.out.println( "list = " + list );
    DListIterator iterator = list.find( "cat" );
    System.out.println( "iterator positioned @ " + iterator.get() );
    list.remove( iterator );
    System.out.println( "list = " + list );
    }
  }
