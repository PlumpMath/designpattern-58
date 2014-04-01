/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.e_proxy;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class HelloImpl implements IHello
{

  @Override
  public void sayHello(String message)
  {
    System.out.println(String.format("Hello %s", message));
  }

}
