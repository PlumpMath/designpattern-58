/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.j_brige;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-26
 * @changeLog:
 * 
 */
public class EngineA implements IEngine
{

  /* 
   * @see cn.frank.designpattern.j_brige.IEngine#installEngine()
   */
  @Override
  public void installEngine()
  {
    System.out.println("Engine A installed");
  }

}
