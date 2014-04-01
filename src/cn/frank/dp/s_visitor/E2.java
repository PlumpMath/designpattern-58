/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.s_visitor;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-1-4
 * @changeLog:
 * 
 */
public class E2 implements IElement
{
  @Override
  public void accept(IVisitor visitor)
  {
    visitor.visit(this);
  }

  public void displayE2()
  {
    System.out.println("display E2");
  }
}
