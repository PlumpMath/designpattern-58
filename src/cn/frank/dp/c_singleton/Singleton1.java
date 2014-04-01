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
public class Singleton1
{

  private static Singleton1 singleton = new Singleton1();

  private Singleton1()
  { 
    System.out.println("Singleton");
  }
  
  public static Singleton1 getInstance(){
    return singleton;
  }  
}
