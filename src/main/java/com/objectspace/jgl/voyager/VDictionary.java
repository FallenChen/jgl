/**
 * VDictionary.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager;

public class VDictionary extends com.objectspace.voyager.VObject
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "java.util.Dictionary" );
  private static final com.objectspace.voyager.util.Token __class0 = new com.objectspace.voyager.util.Token( "<init>()" );
  private static final com.objectspace.voyager.util.Token __instance0 = new com.objectspace.voyager.util.Token( "size()I" );
  private static final com.objectspace.voyager.util.Token __instance1 = new com.objectspace.voyager.util.Token( "isEmpty()Z" );
  private static final com.objectspace.voyager.util.Token __instance2 = new com.objectspace.voyager.util.Token( "keys()Ljava.util.Enumeration;" );
  private static final com.objectspace.voyager.util.Token __instance3 = new com.objectspace.voyager.util.Token( "elements()Ljava.util.Enumeration;" );
  private static final com.objectspace.voyager.util.Token __instance4 = new com.objectspace.voyager.util.Token( "get(Ljava.lang.Object;)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance5 = new com.objectspace.voyager.util.Token( "put(Ljava.lang.Object;Ljava.lang.Object;)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance6 = new com.objectspace.voyager.util.Token( "remove(Ljava.lang.Object;)Ljava.lang.Object;" );
  
  static
    {
    __register( new VDictionary() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VDictionary that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VDictionary()
    {
    }
  
  public String getOriginalClassName()
    {
    return "java.util.Dictionary";
    }
  
  public boolean originalIsInterface()
    {
    return false;
    }
  
  /**
   * Construct a VDictionary and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VDictionary( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result size( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance0 );
    }
  
    /**
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public int size() throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Result __result = size( __newDefaultMessenger() );
    return __result.readInt();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result isEmpty( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance1 );
    }
  
    /**
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public boolean isEmpty() throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Result __result = isEmpty( __newDefaultMessenger() );
    return __result.readBoolean();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result keys( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance2 );
    }
  
    /**
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public java.util.Enumeration keys() throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Result __result = keys( __newDefaultMessenger() );
    return (java.util.Enumeration) __result.readObject();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result elements( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance3 );
    }
  
    /**
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public java.util.Enumeration elements() throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Result __result = elements( __newDefaultMessenger() );
    return (java.util.Enumeration) __result.readObject();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result get( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance4 );
    }
  
    /**
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public Object get( Object arg1 ) throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Result __result = get( arg1, __newDefaultMessenger() );
    return __result.readObject();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result put( Object arg1, Object arg2, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __instanceMethod( __messenger, __instance5 );
    }
  
    /**
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public Object put( Object arg1, Object arg2 ) throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Result __result = put( arg1, arg2, __newDefaultMessenger() );
    return __result.readObject();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result remove( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance6 );
    }
  
    /**
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public Object remove( Object arg1 ) throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Result __result = remove( arg1, __newDefaultMessenger() );
    return __result.readObject();
    }
  }