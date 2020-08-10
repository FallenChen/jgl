package com.objectspace.jgl.benchmarks;

import com.objectspace.jgl.*;
import com.objectspace.jgl.util.*;
import java.util.Vector;
import java.util.Enumeration;

public class ArrayBenchmarks
  {
  static Randomizer random = new Randomizer();
  static final int LOOPS = 400;
  static final int MAX_SIZE = 1000;

  public static void main( String args[] )
    {
    System.out.println( "ArrayBenchmarks" );
    arrayGetting();
    arrayPutting();
    arrayIterating();
    arrayAdding();
    arrayClearing();
    arrayInserting();
    arrayRemoving();
    }

  static Object[] getRandomArrayInts()
    {
    int size = Randomizer.getInt( MAX_SIZE );
    Integer[] ints = new Integer[ size ];
    for( int i = 0; i < size; i++ )
      ints[ i ] = new Integer( Randomizer.getInt( 100 ) );
    return ints;
    }

  static void arrayAdding()
    {
    Benchmark jglBenchmark = new Benchmark( "jglArrayAdding", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkVectorAdding", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomArrayInts();
      Array jglArray = new Array();
      Vector jdkVector = new Vector();

      jdkBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jdkVector.addElement( data[ j ] );
      jdkBenchmark.stop();

      jglBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jglArray.add( data[ j ] );
      jglBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }

  static void arrayGetting()
    {
    Benchmark jglBenchmark = new Benchmark( "jglArrayGetting", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkVectorGetting", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomArrayInts();
      Array jglArray = new Array( data );
      Vector jdkVector = new Vector();
      for( int j = 0; j < data.length; j++ )
        jdkVector.addElement( data[ j ] );
      Object object = null;

      jdkBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        object = jdkVector.elementAt( j );
      jdkBenchmark.stop();

      jglBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        object = jglArray.at( j );
      jglBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }

  static void arrayPutting()
    {
    Benchmark jglBenchmark = new Benchmark( "jglArrayPutting", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkVectorPutting", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomArrayInts();
      Array jglArray = new Array( data );
      Vector jdkVector = new Vector();
      for( int j = 0; j < data.length; j++ )
        jdkVector.addElement( data[ j ] );
      Object object = null;
      Integer zero = new Integer( 0 );

      jdkBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jdkVector.setElementAt( zero, j );
      jdkBenchmark.stop();

      jglBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jglArray.put( j, zero );
      jglBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }

  static void arrayInserting()
    {
    Benchmark jglBenchmark = new Benchmark( "jglArrayInserting", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkVectorInserting", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomArrayInts();
      Array jglArray = new Array( data );
      Vector jdkVector = new Vector();
      int intdata[] = new int[ data.length ];
      for( int j = 0; j < data.length; j++ )
        {
        jdkVector.addElement( data[ j ] );
        intdata[ j ] = ((Integer) data[ j ]).intValue() % data.length;
        }
      Integer zero = new Integer( 0 );

      jglBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jglArray.insert( intdata[ j ], zero );
      jglBenchmark.stop();

      jdkBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jdkVector.insertElementAt( zero, j );
      jdkBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }

  static void arrayRemoving()
    {
    Benchmark jglBenchmark = new Benchmark( "jglArrayRemoving", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkVectorRemoving", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomArrayInts();
      Array jglArray = new Array( data );
      Vector jdkVector = new Vector();
      for( int j = 0; j < data.length; j++ )
        jdkVector.addElement( data[ j ] );

      int intdata[] = new int[ data.length ];
      for( int j = 0; j < data.length; j++ )
        intdata[ j ] = random.getInt( 0, data.length - j - 1 );

      jglBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jglArray.remove( intdata[ j ] );
      jglBenchmark.stop();

      jdkBenchmark.start();
      for( int j = 0; j < data.length; j++ )
        jdkVector.removeElementAt( intdata[ j ] );
      jdkBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }

  static void arrayIterating()
    {
    Benchmark jglBenchmark = new Benchmark( "jglArrayIterating", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkVectorIterating", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomArrayInts();
      Array jglArray = new Array( data );
      Vector jdkVector = new Vector();
      for( int j = 0; j < data.length; j++ )
        jdkVector.addElement( data[ j ] );
      Object object = null;

      jdkBenchmark.start();
      Enumeration jdkEnumerator = jdkVector.elements();
      while( jdkEnumerator.hasMoreElements() )
        jdkEnumerator.nextElement();
      jdkBenchmark.stop();

      jglBenchmark.start();
      Enumeration jglEnumerator = jglArray.elements();
      while( jglEnumerator.hasMoreElements() )
        jglEnumerator.nextElement();
      jglBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }

  static void arrayClearing()
    {
    Benchmark jglBenchmark = new Benchmark( "jglArrayClearing", LOOPS / 4 );
    Benchmark jdkBenchmark = new Benchmark( "jdkVectorClearing", LOOPS / 4 );

    for( int i = 0; i <= LOOPS; i++ )
      {
      Object[] data = getRandomArrayInts();
      Array jglArray = new Array( data );
      Vector jdkVector = new Vector();
      for( int j = 0; j < data.length; j++ )
        jdkVector.addElement( data[ j ] );

      jdkBenchmark.start();
      jdkVector.removeAllElements();
      jdkBenchmark.stop();

      jglBenchmark.start();
      jglArray.clear();
      jglBenchmark.stop();
      }

    jglBenchmark.compareTo( jdkBenchmark );
    }
  }
