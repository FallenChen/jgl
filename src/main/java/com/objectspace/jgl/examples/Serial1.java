package com.objectspace.jgl.examples;// Copyright(c) 1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.io.*;
import java.util.*;

public class Serial1
  {
  static public void write()
    {
    try
      {
      // create a map of acronyms
      HashMap map = new HashMap();
      map.add( "FAQ", "Frequently Asked Questions" );
      map.add( "OMG", "Object Management Group" );
      map.add( "ORB", "Object Request Broker" );

      // save map to a file
      ObjectOutput s =  new ObjectOutputStream( new FileOutputStream( "Serial1.ser" ) );
      s.writeObject( map );
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
      // read map from file
      ObjectInputStream s = new ObjectInputStream( new FileInputStream( "Serial1.ser" ) );
      HashMap map = (HashMap)s.readObject();
      System.out.println( "ORB means " + map.get( "ORB" ) );
      System.out.println( "FAQ means " + map.get( "FAQ" ) );
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
