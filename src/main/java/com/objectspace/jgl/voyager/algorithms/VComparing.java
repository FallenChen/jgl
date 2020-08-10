/**
 * VComparing.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager.algorithms;

public class VComparing extends com.objectspace.voyager.VObject
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.algorithms.Comparing" );
  private static final com.objectspace.voyager.util.Token __class0 = new com.objectspace.voyager.util.Token( "median(Ljava.lang.Object;Ljava.lang.Object;Ljava.lang.Object;Lcom.objectspace.jgl.BinaryPredicate;)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __class1 = new com.objectspace.voyager.util.Token( "mismatch(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;)Lcom.objectspace.jgl.Pair;" );
  private static final com.objectspace.voyager.util.Token __class2 = new com.objectspace.voyager.util.Token( "mismatch(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.Container;)Lcom.objectspace.jgl.Pair;" );
  private static final com.objectspace.voyager.util.Token __class3 = new com.objectspace.voyager.util.Token( "mismatch(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.BinaryPredicate;)Lcom.objectspace.jgl.Pair;" );
  private static final com.objectspace.voyager.util.Token __class4 = new com.objectspace.voyager.util.Token( "mismatch(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.BinaryPredicate;)Lcom.objectspace.jgl.Pair;" );
  private static final com.objectspace.voyager.util.Token __class5 = new com.objectspace.voyager.util.Token( "equal(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;)Z" );
  private static final com.objectspace.voyager.util.Token __class6 = new com.objectspace.voyager.util.Token( "equal(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.Container;)Z" );
  private static final com.objectspace.voyager.util.Token __class7 = new com.objectspace.voyager.util.Token( "lexicographicalCompare(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;)Z" );
  private static final com.objectspace.voyager.util.Token __class8 = new com.objectspace.voyager.util.Token( "lexicographicalCompare(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.Container;)Z" );
  private static final com.objectspace.voyager.util.Token __class9 = new com.objectspace.voyager.util.Token( "lexicographicalCompare(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.BinaryPredicate;)Z" );
  private static final com.objectspace.voyager.util.Token __class10 = new com.objectspace.voyager.util.Token( "lexicographicalCompare(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.BinaryPredicate;)Z" );
  
  static
    {
    __register( new VComparing() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VComparing that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VComparing()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.algorithms.Comparing";
    }
  
  public boolean originalIsInterface()
    {
    return false;
    }
  
  /**
   * Construct a VComparing and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VComparing( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result median( Object arg1, Object arg2, Object arg3, com.objectspace.jgl.BinaryPredicate arg4, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    __messenger.writeObject( arg4 );
    return __staticMethod( __address, __classname, __messenger, __class0, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result median( Object arg1, Object arg2, Object arg3, com.objectspace.jgl.BinaryPredicate arg4, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return median( arg1, arg2, arg3, arg4, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static Object median( Object arg1, Object arg2, Object arg3, com.objectspace.jgl.BinaryPredicate arg4, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return median( arg1, arg2, arg3, arg4, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static Object median( Object arg1, Object arg2, Object arg3, com.objectspace.jgl.BinaryPredicate arg4, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return median( arg1, arg2, arg3, arg4, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result mismatch( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class1, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result mismatch( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return mismatch( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Pair mismatch( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.Pair) mismatch( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Pair mismatch( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return mismatch( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result mismatch( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class2, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result mismatch( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return mismatch( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Pair mismatch( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.Pair) mismatch( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Pair mismatch( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return mismatch( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result mismatch( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.BinaryPredicate arg4, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    __messenger.writeObject( arg4 );
    return __staticMethod( __address, __classname, __messenger, __class3, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result mismatch( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.BinaryPredicate arg4, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return mismatch( arg1, arg2, arg3, arg4, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Pair mismatch( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.BinaryPredicate arg4, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.Pair) mismatch( arg1, arg2, arg3, arg4, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Pair mismatch( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.BinaryPredicate arg4, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return mismatch( arg1, arg2, arg3, arg4, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result mismatch( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class4, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result mismatch( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return mismatch( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Pair mismatch( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.Pair) mismatch( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Pair mismatch( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return mismatch( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result equal( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class5, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result equal( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return equal( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean equal( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return equal( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean equal( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return equal( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result equal( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class6, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result equal( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return equal( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean equal( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return equal( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean equal( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return equal( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result lexicographicalCompare( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.InputIterator arg4, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    __messenger.writeObject( arg4 );
    return __staticMethod( __address, __classname, __messenger, __class7, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result lexicographicalCompare( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.InputIterator arg4, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, arg3, arg4, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean lexicographicalCompare( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.InputIterator arg4, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, arg3, arg4, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean lexicographicalCompare( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.InputIterator arg4, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, arg3, arg4, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result lexicographicalCompare( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class8, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result lexicographicalCompare( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean lexicographicalCompare( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean lexicographicalCompare( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result lexicographicalCompare( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.InputIterator arg4, com.objectspace.jgl.BinaryPredicate arg5, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    __messenger.writeObject( arg4 );
    __messenger.writeObject( arg5 );
    return __staticMethod( __address, __classname, __messenger, __class9, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result lexicographicalCompare( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.InputIterator arg4, com.objectspace.jgl.BinaryPredicate arg5, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, arg3, arg4, arg5, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean lexicographicalCompare( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.InputIterator arg4, com.objectspace.jgl.BinaryPredicate arg5, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, arg3, arg4, arg5, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean lexicographicalCompare( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.InputIterator arg3, com.objectspace.jgl.InputIterator arg4, com.objectspace.jgl.BinaryPredicate arg5, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, arg3, arg4, arg5, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result lexicographicalCompare( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class10, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result lexicographicalCompare( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean lexicographicalCompare( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean lexicographicalCompare( com.objectspace.jgl.Container arg1, com.objectspace.jgl.Container arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return lexicographicalCompare( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  }