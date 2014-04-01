/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.a_factory;

import java.util.Queue;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-22
 * @changeLog:
 * 
 */
public abstract class FactoryMethod
{

  private Queue<String> queue = null;
  

  public FactoryMethod()
  {
    queue = this.createQueue();
  }

  public abstract Queue<String> createQueue();

  public void addTask(String taskName)
  {
    queue.offer(taskName);
  }

  public String getTopTask()
  {
    return queue.poll();
  }
  
}
