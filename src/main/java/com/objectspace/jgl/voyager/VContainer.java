/**
 * VContainer.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager;

public class VContainer extends com.objectspace.voyager.VObject implements com.objectspace.jgl.Container
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.Container" );
  private static final com.objectspace.voyager.util.Token __instance0 = new com.objectspace.voyager.util.Token( "clone()Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance1 = new com.objectspace.voyager.util.Token( "toString()Ljava.lang.String;" );
  private static final com.objectspace.voyager.util.Token __instance2 = new com.objectspace.voyager.util.Token( "size()I" );
  private static final com.objectspace.voyager.util.Token __instance3 = new com.objectspace.voyager.util.Token( "maxSize()I" );
  private static final com.objectspace.voyager.util.Token __instance4 = new com.objectspace.voyager.util.Token( "isEmpty()Z" );
  private static final com.objectspace.voyager.util.Token __instance5 = new com.objectspace.voyager.util.Token( "clear()V" );
  private static final com.objectspace.voyager.util.Token __instance6 = new com.objectspace.voyager.util.Token( "elements()Ljava.util.Enumeration;" );
  private static final com.objectspace.voyager.util.Token __instance7 = new com.objectspace.voyager.util.Token( "start()Lcom.objectspace.jgl.ForwardIterator;" );
  private static final com.objectspace.voyager.util.Token __instance8 = new com.objectspace.voyager.util.Token( "finish()Lcom.objectspace.jgl.ForwardIterator;" );
  private static final com.objectspace.voyager.util.Token __instance9 = new com.objectspace.voyager.util.Token( "add(Ljava.lang.Object;)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance10 = new com.objectspace.voyager.util.Token( "remove(Ljava.util.Enumeration;)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance11 = new com.objectspace.voyager.util.Token( "remove(Ljava.util.Enumeration;Ljava.util.Enumeration;)I" );
  
  static
    {
    __register( new VContainer() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VContainer that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VContainer()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.Container";
    }
  
  public boolean originalIsInterface()
    {
    return true;
    }
  
  /**
   * Construct a VContainer and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VContainer( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result clone( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance0 );
    }
  
  
  public Object clone()
    {
    com.objectspace.voyager.message.Result __result = clone( __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result toString( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance1 );
    }
  
  
  public String toString()
    {
    com.objectspace.voyager.message.Result __result = toString( __newDefaultMessenger() );
    return (String) __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result size( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance2 );
    }
  
  
  public int size()
    {
    com.objectspace.voyager.message.Result __result = size( __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result maxSize( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance3 );
    }
  
  
  public int maxSize()
    {
    com.objectspace.voyager.message.Result __result = maxSize( __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result isEmpty( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance4 );
    }
  
  
  public boolean isEmpty()
    {
    com.objectspace.voyager.message.Result __result = isEmpty( __newDefaultMessenger() );
    return __result.readBooleanRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result clear( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance5 );
    }
  
  
  public void clear()
    {
    com.objectspace.voyager.message.Result __result = clear( __newDefaultMessenger() );
    __result.rethrowExceptionRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result elements( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance6 );
    }
  
  
  public java.util.Enumeration elements()
    {
    com.objectspace.voyager.message.Result __result = elements( __newDefaultMessenger() );
    return (java.util.Enumeration) __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result start( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance7 );
    }
  
  
  public com.objectspace.jgl.ForwardIterator start()
    {
    com.objectspace.voyager.message.Result __result = start( __newDefaultMessenger() );
    return (com.objectspace.jgl.ForwardIterator) __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result finish( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance8 );
    }
  
  
  public com.objectspace.jgl.ForwardIterator finish()
    {
    com.objectspace.voyager.message.Result __result = finish( __newDefaultMessenger() );
    return (com.objectspace.jgl.ForwardIterator) __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result add( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance9 );
    }
  
  
  public Object add( Object arg1 )
    {
    com.objectspace.voyager.message.Result __result = add( arg1, __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result remove( java.util.Enumeration arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance10 );
    }
  
  
  public Object remove( java.util.Enumeration arg1 )
    {
    com.objectspace.voyager.message.Result __result = remove( arg1, __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result remove( java.util.Enumeration arg1, java.util.Enumeration arg2, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __instanceMethod( __messenger, __instance11 );
    }
  
  
  public int remove( java.util.Enumeration arg1, java.util.Enumeration arg2 )
    {
    com.objectspace.voyager.message.Result __result = remove( arg1, arg2, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  }
