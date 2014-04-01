/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.e_proxy.static_proxy;

import cn.frank.dp.e_proxy.HelloImpl;
import cn.frank.dp.e_proxy.IHello;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class ProxyMain implements IHello
{

  private IHello hello;
  public ProxyMain(IHello hello)
  {
    this.hello = hello;
  }

  @Override
  public void sayHello(String message)
  {
    System.out.println("security verified");
    hello.sayHello(message);
  }

  public static void main(String[] args)
  {
    IHello hello = new ProxyMain(new HelloImpl());
    hello.sayHello("Frank Fan");
  }

}
