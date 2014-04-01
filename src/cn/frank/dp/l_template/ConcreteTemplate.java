/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.l_template;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-26
 * @changeLog:
 * 
 */
public class ConcreteTemplate extends AbstractTemplate
{

  /* 
   * @see cn.frank.designpattern.l_template.AbstractTemplate#step2()
   */
  @Override
  public void step2()
  {
    System.out.println("step2 concrete in child class");
  }
  
  public static void main(String[] args)
  {
    AbstractTemplate template = new ConcreteTemplate();
    template.template();
  }

}
