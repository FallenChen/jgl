package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;

public class Overview1
  {
  public static void main( String[] args )
    {
    HashMap chemicals = new HashMap();
    chemicals.put( "Ca", "Calcium" );
    chemicals.put( "Au", "Gold" );
    chemicals.put( "He", "Helium" );
    System.out.println( "chemicals = " + chemicals );
    System.out.println( "Au means " + chemicals.get( "Au" ) );
    }
  }
