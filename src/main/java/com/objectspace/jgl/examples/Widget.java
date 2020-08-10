package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.

public class Widget
  {
  public String name; // public for demo only.
  public int price; // public for demo only.

  public Widget( String name, int price )
    {
    this.name = name;
    this.price = price;
    }

  public int hashCode()
    {
    return name.hashCode();
    }

  public boolean equals( Object object )
    {
    return 
      object instanceof Widget 
      && name.equals( ( (Widget)object ).name );
    }

  public String toString()
    {
    return "Widget( " + name + ", " + price + " )";
    }
  }
