package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import Widget;
import java.util.Enumeration;

public class Sets1
  {
  public static void main( String[] args )
    {
    HashSet set = new HashSet();
    Object value;

    value = set.add( new Widget( "button", 100 ) );
    System.out.println( "value from add = " + value );
    value = set.add( new Widget( "menu", 200 ) );
    System.out.println( "value from add = " + value );
    System.out.println( "set = " + set );

    value = set.add( new Widget( "button", 300 ) );
    System.out.println( "value from add = " + value );
    System.out.println( "set = " + set );

    value = set.put( new Widget( "button", 300 ) );
    System.out.println( "value from put = " + value );
    System.out.println( "set = " + set );
    }
  }
