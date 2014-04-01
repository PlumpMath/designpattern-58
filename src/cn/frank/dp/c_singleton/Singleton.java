/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.c_singleton;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2012-12-29
 * @changeLog:
 * 
 */
public class Singleton
{

  private static Singleton singleton = null;

  private Singleton()
  { 
    System.out.println("Singleton");
  }
  
  public static Singleton getInstance(){
    if (singleton == null)
    {
      synchronized(Singleton.class){
        if (singleton == null)
        { 
          singleton = new Singleton();
        }
      }
    }  
    return singleton;
  }  
}
