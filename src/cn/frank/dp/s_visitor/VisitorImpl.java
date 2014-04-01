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
public class VisitorImpl implements IVisitor
{
  @Override
  public void visit(E1 object)
  {
    object.displayE1();
  }

  @Override
  public void visit(E2 object)
  {
    object.displayE2();
  }
}
