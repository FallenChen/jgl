package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import Company;

public class Container6
  {
  public static void main( String[] args )
    {
    Company company1 = new Company( "ObjectSpace" );
    Company company2 = new Company( "Sun Microsystems" );

    HashMap headquarters = new HashMap();
    headquarters.put( company1, "Texas" );
    headquarters.put( company2, "California" );

    String location = (String) headquarters.get( company1 );
    System.out.println( "The headquarters of " + company1 + " are in " + location );
    }
  }
