/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.j_brige;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-26
 * @changeLog:
 * 
 */
public class Main
{

  public static void main(String[] args)
  {
    Vehicle v = new Car(new EngineA());
    Vehicle v2 = new Bus(new EngineB());
    v.installEngine();
    v2.installEngine();   
  }
}
