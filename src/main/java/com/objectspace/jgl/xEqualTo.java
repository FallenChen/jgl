// Copyright(c) 1997 ObjectSpace, Inc.

package com.objectspace.jgl;

final class xEqualTo implements BinaryPredicate
  {
  /**
   * @see com.objectspace.jgl.predicates.EqualTo#execute(Object, Object)
   */
  public boolean execute( Object first, Object second )
    {
    return first.equals( second );
    }

  static final long serialVersionUID = -8584901860090939159L;
  }
