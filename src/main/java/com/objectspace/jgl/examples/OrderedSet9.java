package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Bounds.
 *
 * @see com.objectspace.jgl,OrderedSet
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedSet9
  {
  public static void main( String[] args )
    {
    OrderedSet set = new OrderedSet( true ); // allow duplicates
    set.add( new Integer( 3 ) );
    set.add( new Integer( 8 ) );
    set.add( new Integer( 2 ) );
    set.add( new Integer( -2 ) );
    set.add( new Integer( 3 ) );
    set.add( new Integer( 10 ) );
    System.out.println( set );

    OrderedSetIterator lower = set.lowerBound( new Integer( 3 ) );
    System.out.println( "First element that is not before 3 = " + lower.get() );

    OrderedSetIterator upper = set.upperBound( new Integer( 3 ) );
    System.out.println( "First element that is after 3 = " + upper.get() );

    Range range = set.equalRange( new Integer( 3 ) );
    System.out.println( "equalRange.first = " + range.begin.get() );
    System.out.println( "equalRange.second = " + range.end.get() );

    System.out.println( "Iterating values in the range..." );
    ForwardIterator begin = range.begin;
    ForwardIterator end = range.end;
    while ( ! begin.equals( end ) )
      {
      System.out.println( begin.get() );
      begin.advance();
      }
    }
  }
