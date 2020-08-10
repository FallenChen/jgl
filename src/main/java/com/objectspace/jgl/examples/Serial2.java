package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.io.*;
import java.util.*;

public class Serial2
  {
  static public void write()
    {
    try
      {
      // create a list of names
      DList names = new DList();
      names.add( "Peter Parker" );
      names.add( "Frank Castle" );
      names.add( "Logan" );
      names.add( "Steve Rogers" );

      // save names to a file
      ObjectOutput s =  new ObjectOutputStream( new FileOutputStream( "Serial2.ser" ) );
      s.writeObject( names );

      // search for some particular entries
      ForwardIterator wolverine = names.find( "Logan" );
      ForwardIterator hulk = names.find( "Bruce Banner" );

      // write the iterators to the file as well
      s.writeObject( wolverine );
      s.writeObject( hulk );
      s.flush();
      s.close();
      }
    catch ( IOException e )
      {
      System.out.println( "caught: " + e );
      }
    }

  static public void read()
    {
    try
      {
      // read sequence and iterator from file
      ObjectInputStream s = new ObjectInputStream( new FileInputStream( "Serial2.ser" ) );
      DList names = (DList)s.readObject();
      ForwardIterator wolverine = (ForwardIterator)s.readObject();
      ForwardIterator hulk = (ForwardIterator)s.readObject();

      // check the iterators
      if ( wolverine.equals( names.end() ) )
        System.out.println( "Don't know who Wolverine is" );
      else
        System.out.println( "Wolverine is also known as " + wolverine.get() );
      if ( hulk.equals( names.end() ) )
        System.out.println( "Don't know who the Hulk is" );
      else
        System.out.println( "Hulk is also known as " + hulk.get() );
      }
    catch ( IOException e1 )
      {
      System.out.println( "caught: " + e1 );
      }
    catch ( ClassNotFoundException e2 )
      {
      System.out.println( "caught: " + e2 );
      }
    }

  public static void main( String args[] )
    {
    write();
    read();
    }
  }
