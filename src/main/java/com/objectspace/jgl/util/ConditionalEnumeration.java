// Copyright(c) 1997 ObjectSpace, Inc.

package com.objectspace.jgl.util;

import com.objectspace.jgl.UnaryPredicate;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * ConditionalEnumeration is an enumeration that traverses a subset
 * of values.
 * <p>
 * @see Enumeration
 * @see UnaryPredicate
 * @author ObjectSpace, Inc.
 */

public class ConditionalEnumeration implements Enumeration, java.io.Serializable
  {
  Enumeration enum;
  UnaryPredicate condition;
  Object object = null;
  boolean loaded = false;
  boolean hasMore = false;

  /**
   * Construct myself to iterate over the same elements as enum.
   * @param enum The enumeration to traverse.
   */
  public ConditionalEnumeration( Enumeration enum )
    {
    this.enum = enum;
    this.condition = new UnaryPredicate() 
      { 
      public boolean execute( Object object ){ return true; } 
      };
    }

  /**
   * Construct myself to iterate over the elements of enum that meet
   * the given condition.
   * @param enum The enumeration to traverse.
   * @param condition The predicate used to determine legal enumerated values.
   */
  public ConditionalEnumeration( Enumeration enum, UnaryPredicate condition )
    {
    this.enum = enum;
    this.condition = condition;
    }

  /**
   * Return <code>true</code> if there are more elements in my input stream 
   * that meet my condition.
   */
  public boolean hasMoreElements()
    {
    if ( !loaded )
      {
      hasMore = true;
      try
        {
        nextElement();
        }
      catch ( Exception ex )
        {
        hasMore = false;
        }
      loaded = true;
      }
    return hasMore;
    }

  /**
   * Return the next element in my input stream that meets my condition.
   * @exception NoSuchElementException If there are no more
   *  elements.
   */
  public Object nextElement() throws NoSuchElementException
    {
    if ( loaded && hasMore )
      loaded = false;
    else
      {
      do
        {
        object = enum.nextElement();
        }
      while ( !condition.execute( object ) );
      }
    return object;
    }

  static final long serialVersionUID = 7280624882633425321L;
  }
