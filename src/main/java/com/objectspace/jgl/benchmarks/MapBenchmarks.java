package com.objectspace.jgl.benchmarks;

import com.objectspace.jgl.*;
import com.objectspace.jgl.util.*;
import java.util.Hashtable;
import java.util.Enumeration;

public class MapBenchmarks
  {
  static Randomizer random = new Randomizer();
  static final int LOOPS = 200;
  static final int MAX_SIZE = 3000;

  public static void main( String args[] )
    {
    System.out.println( "MapBenchmarks" );
    mapAdding();
    mapFinding();
    mapRemoving();
    mapClearing();
    }

  static Object[] getRandomVectorInts()
    {
    int size = Randomizer.getInt( MAX_SIZE );
    Integer[] ints = new Integer[ size ];
    for( int i = 0; i < size; i++ )
      ints[ i ] = new Integer( Randomizer.getInt( 10000 ) );
    return ints;
    }

  static void mapAdding()
    {
    Benchmark jglBenchmark = new Benchmark( "jglMapAdding", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkHashtableAdding", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomVectorInts();
      HashMap jglMap = new HashMap();
      Hashtable jdkHashtable = new Hashtable();

      jdkBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jdkHashtable.put( data[ j ], data[ j ] );
      jdkBenchmark.stop();

      jglBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jglMap.put( data[ j ], data[ j ] );
      jglBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }

  static void mapFinding()
    {
    Benchmark jglBenchmark = new Benchmark( "jglMapFinding", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkHashtableFinding", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomVectorInts();
      HashMap jglMap = new HashMap();
      Hashtable jdkHashtable = new Hashtable();

      for( int j = 0; j < data.length; j++ )
        jglMap.put( data[ j ], data[ j ] );

      for( int j = 0; j < data.length; j++ )
        jdkHashtable.put( data[ j ], data[ j ] );

      jdkBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        {
        jdkHashtable.get( data[ j ] );
        }
      jdkBenchmark.stop();

      jglBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        {
        jglMap.get( data[ j ] );
        }
      jglBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }

  static void mapRemoving()
    {
    Benchmark jglBenchmark = new Benchmark( "jglMapRemoving", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkHashtableRemoving", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomVectorInts();
      HashMap jglMap = new HashMap();
      Hashtable jdkHashtable = new Hashtable();

      for( int j = 0; j < data.length; j++ )
        jglMap.put( data[ j ], data[ j ] );

      for( int j = 0; j < data.length; j++ )
        jdkHashtable.put( data[ j ], data[ j ] );

      jdkBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        {
        jdkHashtable.remove( data[ j ] );
        }
      jdkBenchmark.stop();

      jglBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        {
        jglMap.remove( data[ j ] );
        }
      jglBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }

  static void mapClearing()
    {
    Benchmark jglBenchmark = new Benchmark( "jglMapClearing", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkHashtableClearing", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomVectorInts();
      HashMap jglMap = new HashMap();
      Hashtable jdkHashtable = new Hashtable();

      for( int j = 0; j < data.length; j++ )
        jglMap.put( data[ j ], data[ j ] );

      for( int j = 0; j < data.length; j++ )
        jdkHashtable.put( data[ j ], data[ j ] );

      jdkBenchmark.start();
      jdkHashtable.clear();
      jdkBenchmark.stop();

      jglBenchmark.start();
      jglMap.clear();
      jglBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }
  }
