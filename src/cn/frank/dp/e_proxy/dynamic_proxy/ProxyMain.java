/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.e_proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

import cn.frank.dp.e_proxy.HelloImpl;
import cn.frank.dp.e_proxy.IHello;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class ProxyMain
{

  /**
   * @param args
   * @since: 2013-4-23
   */
  public static void main(String[] args)
  {
    IHello hello = new HelloImpl();
    ProxyInvocationHandler phandler = new ProxyInvocationHandler(hello);
    IHello proxyHello = (IHello)Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), phandler);
    proxyHello.sayHello("Frank Fan");
  }

}
