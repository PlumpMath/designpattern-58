/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.e_proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class ProxyInvocationHandler implements InvocationHandler
{

  private Object target;
  public ProxyInvocationHandler(Object target)
  {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
  {
    System.out.println("dynamic security verified");
    Object result = method.invoke(target, args);
    System.out.println("dynamic call done");
    return result;
  }

}
