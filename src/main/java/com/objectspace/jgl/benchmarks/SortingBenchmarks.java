package com.objectspace.jgl.benchmarks;

import com.objectspace.jgl.*;
import com.objectspace.jgl.adapters.*;
import com.objectspace.jgl.algorithms.*;
import com.objectspace.jgl.predicates.*;
import com.objectspace.jgl.util.*;

public class SortingBenchmarks
  {
  static Randomizer random = new Randomizer();
  static final int LOOPS = 100;
  static final int MAX_SIZE = 3000;

  public static void main( String args[] )
    {
    System.out.println( "SortingBenchmarks" );
    Benchmark handcodeBenchmark = new Benchmark( "handcoded sorting", LOOPS / 20 );
    Benchmark jglBenchmark = new Benchmark( "jgl sort algorithm", LOOPS / 20 );

    for( int i = 0; i < LOOPS; ++i )
      {
      int size = Randomizer.getInt( MAX_SIZE );
      String data[] = new String[ size ];
      for( int j = 0; j < size; ++j )
        data[ j ] = getRandomString();

      String data1[] = new String[ size ];
      System.arraycopy( data, 0, data1, 0, size );
      jglBenchmark.start();
      jglSort( data1 );
      jglBenchmark.stop();

      String data2[] = new String[ size ];
      System.arraycopy( data, 0, data2, 0, size );
      handcodeBenchmark.start();
      handcodeSort( data2 );
      handcodeBenchmark.stop();
      }

    jglBenchmark.compareTo( handcodeBenchmark );
    }

  static String getRandomString()
    {
    int len = Randomizer.getInt( 5, 30 );
    StringBuffer buffer = new StringBuffer();
    for( int i = 0; i < len; ++i )
      buffer.append( (char)( ( (int)'a' )+ Randomizer.getInt( 0, 25 ) ) );
    return buffer.toString();
    }

  static void jglSort( String data[] )
    {
    Sorting.sort( new ObjectArray( data ), new LessString() );
    }

  static void handcodeSort( String data[] )
    {
    quickSort( data, 0, data.length - 1, new GreaterString() );
    }

  static void quickSort( String data[], int lo, int hi, BinaryPredicate predicate )
    {
    if( lo >= hi ) 
      return;

    int mid = ( lo + hi ) / 2;

    if( predicate.execute( data[ lo ], data[ mid ] ) )
      {
      String tmp = data[ lo ];
      data[ lo ] = data[ mid ];
      data[ mid ] = tmp;
      }

    if( predicate.execute( data[ mid ], data[ hi ] ) )
      {
      String tmp = data[ mid ];
      data[ mid ] = data[ hi ];
      data[ hi ] = tmp;
 
      if( predicate.execute( data[ lo ], data[ mid ] ) )
        {
        String tmp2 = data[ lo ];
        data[ lo ] = data[ mid ];
        data[ mid ] = tmp2;
        }
      }

     int left = lo + 1;
     int right = hi - 1;

     if( left >= right ) 
       return; 

     String partition = data[ mid ];

     for( ;; ) 
      {
      while( predicate.execute( data[ right ], partition ) )
        {
        --right;
        }

      while( left < right && !predicate.execute( data[ left ], partition ) )
        {
        ++left;
        }

      if( left < right )
        {
        String tmp = data[ left ];
        data[ left ] = data[ right ];
        data[ right ] = tmp;
        --right;
        }
      else
        {
        break;
        }
      }

    quickSort( data, lo, left, predicate );
    quickSort( data, left + 1, hi, predicate );
    }
  }
