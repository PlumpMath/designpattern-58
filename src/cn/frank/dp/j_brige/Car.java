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
public class Car extends Vehicle
{

  /**
   * @param engine
   */
  public Car(IEngine engine)
  {
    super(engine);
  }

  /* 
   * @see cn.frank.designpattern.j_brige.Vehicle#installEngine()
   */
  @Override
  public void installEngine()
  {
    System.out.println("Install Engine for Car");
    this.getEngine().installEngine();
  }

}
