package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Iterators6
  {
  public static void main( String[] args )
    {
    HashMap map = new HashMap( true ); // allow duplicates
    map.add( "cat", "beauty" );
    map.add( "dog", "marble" );
    map.add( "cat", "agatha" );
    map.add( "fox", "paula" );
    System.out.println( "map = " + map );

    Range range = map.equalRange( "cat" );
    HashMapIterator iterator = (HashMapIterator) range.begin;
    HashMapIterator last = (HashMapIterator) range.end;
    while ( !iterator.equals( last ) )
      {
      System.out.print( "pair = " + iterator.get() );
      System.out.print( ", key = " + iterator.key() );
      System.out.println( ", value = " + iterator.value() );
      iterator.advance();
      }
    }
  }
