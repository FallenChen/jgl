package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.functions.*;

/**
 * Applying - inject a container with a given binary function
 * which does a 'reduction' operation.
 *
 * @see Applying
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Applying2
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( new Integer( 100 ) );
    array.add( new Integer( 2 ) );
    array.add( new Integer( 71 ) );
    System.out.println( "array = " + array );
    System.out.println
      (
      "injecting TimesNumber(initial value==1) = "
      + Applying.inject
        (
        array.begin(),
        array.end(),
        new Integer( 1 ),
        new TimesNumber()
        )
      );
    System.out.println
      (
      "injecting PlusNumber(initial value==0) = "
      + Applying.inject( array, new Integer( 0 ), new PlusNumber() )
      );
    System.out.println
      (
      "injecting MinusNumber(initial value==0) = "
      + Applying.inject( array, new Integer( 0 ), new MinusNumber() )
      );
    System.out.println
      (
      "injecting DividesNumber(initial value==100000) = "
      + Applying.inject( array, new Integer( 100000 ), new DividesNumber() )
      );
    }
  }
