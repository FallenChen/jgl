/**
 * VInputIterator.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager;

public class VInputIterator extends com.objectspace.voyager.VObject implements com.objectspace.jgl.InputIterator
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.InputIterator" );
  private static final com.objectspace.voyager.util.Token __instance0 = new com.objectspace.voyager.util.Token( "atBegin()Z" );
  private static final com.objectspace.voyager.util.Token __instance1 = new com.objectspace.voyager.util.Token( "atEnd()Z" );
  private static final com.objectspace.voyager.util.Token __instance2 = new com.objectspace.voyager.util.Token( "get()Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance3 = new com.objectspace.voyager.util.Token( "advance()V" );
  private static final com.objectspace.voyager.util.Token __instance4 = new com.objectspace.voyager.util.Token( "advance(I)V" );
  private static final com.objectspace.voyager.util.Token __instance5 = new com.objectspace.voyager.util.Token( "clone()Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance6 = new com.objectspace.voyager.util.Token( "isCompatibleWith(Lcom.objectspace.jgl.InputIterator;)Z" );
  private static final com.objectspace.voyager.util.Token __instance7 = new com.objectspace.voyager.util.Token( "hasMoreElements()Z" );
  private static final com.objectspace.voyager.util.Token __instance8 = new com.objectspace.voyager.util.Token( "nextElement()Ljava.lang.Object;" );
  
  static
    {
    __register( new VInputIterator() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VInputIterator that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VInputIterator()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.InputIterator";
    }
  
  public boolean originalIsInterface()
    {
    return true;
    }
  
  /**
   * Construct a VInputIterator and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VInputIterator( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result atBegin( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance0 );
    }
  
  
  public boolean atBegin()
    {
    com.objectspace.voyager.message.Result __result = atBegin( __newDefaultMessenger() );
    return __result.readBooleanRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result atEnd( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance1 );
    }
  
  
  public boolean atEnd()
    {
    com.objectspace.voyager.message.Result __result = atEnd( __newDefaultMessenger() );
    return __result.readBooleanRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result get( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance2 );
    }
  
  
  public Object get()
    {
    com.objectspace.voyager.message.Result __result = get( __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result advance( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance3 );
    }
  
  
  public void advance()
    {
    com.objectspace.voyager.message.Result __result = advance( __newDefaultMessenger() );
    __result.rethrowExceptionRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result advance( int arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeInt( arg1 );
    return __instanceMethod( __messenger, __instance4 );
    }
  
  
  public void advance( int arg1 )
    {
    com.objectspace.voyager.message.Result __result = advance( arg1, __newDefaultMessenger() );
    __result.rethrowExceptionRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result clone( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance5 );
    }
  
  
  public Object clone()
    {
    com.objectspace.voyager.message.Result __result = clone( __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result isCompatibleWith( com.objectspace.jgl.InputIterator arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance6 );
    }
  
  
  public boolean isCompatibleWith( com.objectspace.jgl.InputIterator arg1 )
    {
    com.objectspace.voyager.message.Result __result = isCompatibleWith( arg1, __newDefaultMessenger() );
    return __result.readBooleanRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result hasMoreElements( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance7 );
    }
  
  
  public boolean hasMoreElements()
    {
    com.objectspace.voyager.message.Result __result = hasMoreElements( __newDefaultMessenger() );
    return __result.readBooleanRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result nextElement( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance8 );
    }
  
  
  public Object nextElement()
    {
    com.objectspace.voyager.message.Result __result = nextElement( __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  }
