/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.a_factory;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-22
 * @changeLog:
 * 
 */
public class FactoryMethodMain extends FactoryMethod
{

  public static void main(String[] args)
  {
    FactoryMethodMain fmm = new FactoryMethodMain();
    fmm.addTask("task1");
    fmm.addTask("task9");
    fmm.addTask("task5");
    String topTask = fmm.getTopTask();
    System.out.println(topTask);
    System.out.println(fmm.getTopTask());
  }

  @Override
  public Queue<String> createQueue()
  {
    return new ArrayDeque<String>();
  }

}
