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
public class VisitorMain
{

  public static void main(String[] args)
  {
    IElement[] es = {new E1(), new E2()};
    IVisitor iv = new VisitorImpl();
    for (IElement e : es)
    {
      e.accept(iv);
    }
  }
}
