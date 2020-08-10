package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.

public class Company
  {
  String myName;

  public Company( String name )
    {
    myName = name;
    }

  public String toString()
    {
    return "Company( " + myName + " )";
    }

  public int hashCode()
    {
    return myName.hashCode();
    }

  public boolean equals( Object object )
    {
    return 
      object instanceof Company 
      && myName.equals( ( (Company)object ).myName );
    }
  }
