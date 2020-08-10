package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

/**
 * Bounds.
 *
 * @see com.objectspace.jgl,OrderedMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedMap8
  {
  public static void main( String[] args )
    {
    OrderedMap map = new OrderedMap( true ); // allow duplicates
    map.add( new Integer( 3 ), "three" );
    map.add( new Integer( 8 ), "eight" );
    map.add( new Integer( 2 ), "two" );
    map.add( new Integer( 10 ), "ten" );
    System.out.println( map );

    OrderedMapIterator lower = map.lowerBound( new Integer( 3 ) );
    System.out.println( "First pair whose key is not before 3 = " + lower.get() );

    OrderedMapIterator upper = map.upperBound( new Integer( 3 ) );
    System.out.println( "First pair whose key is after 3 = " + upper.get() );

    Range range = map.equalRange( new Integer( 3 ) );
    System.out.println( "first of equalRange = " + range.begin.get() );
    System.out.println( "second of equalRange = " + range.end.get() );

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
