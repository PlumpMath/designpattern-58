/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.l_template;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-25
 * @changeLog:
 * 
 */
public abstract class AbstractTemplate
{

  public void step1()
  {
    System.out.println("step 1 same for all");
  }
  
  public abstract void step2();
  
  public final void template()
  {
    step1();
    step2();
  }
}
