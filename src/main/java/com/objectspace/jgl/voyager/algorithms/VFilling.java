/**
 * VFilling.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager.algorithms;

public class VFilling extends com.objectspace.voyager.VObject
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.algorithms.Filling" );
  private static final com.objectspace.voyager.util.Token __class0 = new com.objectspace.voyager.util.Token( "fill(Lcom.objectspace.jgl.ForwardIterator;Lcom.objectspace.jgl.ForwardIterator;Ljava.lang.Object;)V" );
  private static final com.objectspace.voyager.util.Token __class1 = new com.objectspace.voyager.util.Token( "fill(Lcom.objectspace.jgl.Container;Ljava.lang.Object;)V" );
  private static final com.objectspace.voyager.util.Token __class2 = new com.objectspace.voyager.util.Token( "fillN(Lcom.objectspace.jgl.OutputIterator;ILjava.lang.Object;)V" );
  
  static
    {
    __register( new VFilling() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VFilling that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VFilling()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.algorithms.Filling";
    }
  
  public boolean originalIsInterface()
    {
    return false;
    }
  
  /**
   * Construct a VFilling and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VFilling( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result fill( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, Object arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class0, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result fill( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, Object arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return fill( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void fill( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, Object arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    fill( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void fill( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, Object arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    fill( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result fill( com.objectspace.jgl.Container arg1, Object arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class1, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result fill( com.objectspace.jgl.Container arg1, Object arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return fill( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void fill( com.objectspace.jgl.Container arg1, Object arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    fill( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void fill( com.objectspace.jgl.Container arg1, Object arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    fill( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result fillN( com.objectspace.jgl.OutputIterator arg1, int arg2, Object arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeInt( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class2, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result fillN( com.objectspace.jgl.OutputIterator arg1, int arg2, Object arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return fillN( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void fillN( com.objectspace.jgl.OutputIterator arg1, int arg2, Object arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    fillN( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void fillN( com.objectspace.jgl.OutputIterator arg1, int arg2, Object arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    fillN( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  }