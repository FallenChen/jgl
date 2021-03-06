/**
 * VReversing.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager.algorithms;

public class VReversing extends com.objectspace.voyager.VObject
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.algorithms.Reversing" );
  private static final com.objectspace.voyager.util.Token __class0 = new com.objectspace.voyager.util.Token( "reverse(Lcom.objectspace.jgl.BidirectionalIterator;Lcom.objectspace.jgl.BidirectionalIterator;)V" );
  private static final com.objectspace.voyager.util.Token __class1 = new com.objectspace.voyager.util.Token( "reverse(Lcom.objectspace.jgl.Container;)V" );
  private static final com.objectspace.voyager.util.Token __class2 = new com.objectspace.voyager.util.Token( "reverseCopy(Lcom.objectspace.jgl.BidirectionalIterator;Lcom.objectspace.jgl.BidirectionalIterator;Lcom.objectspace.jgl.OutputIterator;)Lcom.objectspace.jgl.OutputIterator;" );
  private static final com.objectspace.voyager.util.Token __class3 = new com.objectspace.voyager.util.Token( "reverseCopy(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.OutputIterator;)Lcom.objectspace.jgl.OutputIterator;" );
  private static final com.objectspace.voyager.util.Token __class4 = new com.objectspace.voyager.util.Token( "reverseCopy(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.Container;)V" );
  
  static
    {
    __register( new VReversing() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VReversing that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VReversing()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.algorithms.Reversing";
    }
  
  public boolean originalIsInterface()
    {
    return false;
    }
  
  /**
   * Construct a VReversing and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VReversing( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverse( com.objectspace.jgl.BidirectionalIterator arg1, com.objectspace.jgl.BidirectionalIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class0, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverse( com.objectspace.jgl.BidirectionalIterator arg1, com.objectspace.jgl.BidirectionalIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return reverse( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void reverse( com.objectspace.jgl.BidirectionalIterator arg1, com.objectspace.jgl.BidirectionalIterator arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    reverse( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void reverse( com.objectspace.jgl.BidirectionalIterator arg1, com.objectspace.jgl.BidirectionalIterator arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    reverse( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverse( com.objectspace.jgl.Container arg1, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    return __staticMethod( __address, __classname, __messenger, __class1, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverse( com.objectspace.jgl.Container arg1, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return reverse( arg1, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void reverse( com.objectspace.jgl.Container arg1, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    reverse( arg1, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void reverse( com.objectspace.jgl.Container arg1, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    reverse( arg1, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverseCopy( com.objectspace.jgl.BidirectionalIterator arg1, com.objectspace.jgl.BidirectionalIterator arg2, com.objectspace.jgl.OutputIterator arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class2, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverseCopy( com.objectspace.jgl.BidirectionalIterator arg1, com.objectspace.jgl.BidirectionalIterator arg2, com.objectspace.jgl.OutputIterator arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return reverseCopy( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.OutputIterator reverseCopy( com.objectspace.jgl.BidirectionalIterator arg1, com.objectspace.jgl.BidirectionalIterator arg2, com.objectspace.jgl.OutputIterator arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.OutputIterator) reverseCopy( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.OutputIterator reverseCopy( com.objectspace.jgl.BidirectionalIterator arg1, com.objectspace.jgl.BidirectionalIterator arg2, com.objectspace.jgl.OutputIterator arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return reverseCopy( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverseCopy( com.objectspace.jgl.Container arg1, com.objectspace.jgl.OutputIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class3, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverseCopy( com.objectspace.jgl.Container arg1, com.objectspace.jgl.OutputIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return reverseCopy( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.OutputIterator reverseCopy( com.objectspace.jgl.Container arg1, com.objectspace.jgl.OutputIterator arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.OutputIterator) reverseCopy( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.OutputIterator reverseCopy( com.objectspace.jgl.Container arg1, com.objectspace.jgl.OutputIterator arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return reverseCopy( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverseCopy( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class4, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result reverseCopy( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return reverseCopy( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void reverseCopy( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    reverseCopy( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void reverseCopy( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    reverseCopy( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  }
