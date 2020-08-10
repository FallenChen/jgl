// Copyright(c) 1996,1997 ObjectSpace, Inc.
// Portions Copyright(c) 1995, 1996 Hewlett-Packard Company.

package com.objectspace.jgl;

import java.util.Enumeration;

/**
 * InputIterator is the interface of all iterators that can read one
 * item at a time in a forward direction. InputIterator is an extension
 * of the java.lang.Enumeration class.
 * <p>
 * @see OutputIterator
 * @see Enumeration
 * @version 3.1.0
 * @author ObjectSpace, Inc.
 */

public interface InputIterator extends Enumeration, Cloneable
  {
  /**
   * Return true if I'm positioned at the first item of my input stream.
   */
  public boolean atBegin();

  /**
   * Return true if I'm positioned after the last item in my input stream.
   */
  public boolean atEnd();

  /**
   * Return the object at my current position.
   */
  public Object get();

  /**
   * Advance by one.
   */
  public void advance();

  /**
   * Advance by a specified amount.
   * @param n The amount to advance.
   */
  public void advance( int n );

  /**
   * Return a clone of myself.
   */
  public Object clone();

  /**
   * Return true if both <CODE>iterator</CODE> and myself can be used
   * as a range.
   */
  public boolean isCompatibleWith( InputIterator iterator );
  }
