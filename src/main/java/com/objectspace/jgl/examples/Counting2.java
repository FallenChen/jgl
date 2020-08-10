package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;

/**
 * Sum the values of a range using a binary function.
 *
 * @see Counting
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Counting2
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( new Long( 5 ) );
    array.add( new Long( 4 ) );
    array.add( new Long( 3 ) );
    array.add( new Long( 2 ) );
    array.add( new Long( 1 ) );

    Number prod = new Long( 1 );
    prod = Counting.accumulate
      (
      array.start(),
      array.finish(),
      prod,
      new TimesNumber( prod.getClass() )
      );

    System.out.println( "Product = " + prod );
    }
  }
