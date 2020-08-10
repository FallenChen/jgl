package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;

public class Container5
  {
  public static void main( String[] args )
    {
    Array Array = new Array();
    Array.add( new Integer( 2 ) );
    Array.add( new Boolean( false ) );
    Array.add( new Character( 'x' ) );
    Array.add( new Float( 3.14F ) );
    System.out.println( "Array = " + Array );
    }
  }
