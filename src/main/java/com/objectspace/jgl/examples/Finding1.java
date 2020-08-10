package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;

/**
 * Finding a single element, conditional searching, finding consecutive elements.
 *
 * @see Finding
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class Finding1
  {
  public static void main( String[] args )
    {
    Array array = new Array();
    array.add( "cat" );
    array.add( "dog" );
    array.add( "emu" );
    array.add( "dog" );
    array.add( "dog" );
    ArrayIterator i = array.begin();

    while ( true )
      {
      i = (ArrayIterator)Finding.find( i, array.end(), "dog" );
      if ( i.atEnd() ) // A simpler way: if ( i.equals( array.end() ) )...
        break;
      System.out.println
        ( 
        "iterator found " + i.get() + " at index " + i.index() 
        );
      i.advance();
      }

    int intArray[] = { 3, 6, 2, 1, 8, 9, 4, 5 };
    IntIterator j = (IntIterator)Finding.findIf
      ( 
      IntIterator.begin( intArray ), 
      IntIterator.end( intArray ), 
      new BindSecondPredicate( new GreaterNumber(), new Integer( 7 ) ) 
      );
    System.out.println
      ( 
      "First element > 7 is " + j.get() + " at index " + j.index() 
      );

    DList list = new DList();
    list.add( "cat" );
    list.add( "dog" );
    list.add( "emu" );
    list.add( "emu" );
    list.add( "dog" );
    DListIterator k = (DListIterator)Finding.adjacentFind( list, new EqualTo() );
    System.out.println
      ( 
      "First consecutive sequence: " + k.get() + " at index " + k.index()
      );
    }
  }
