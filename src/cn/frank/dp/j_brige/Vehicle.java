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
public abstract class Vehicle
{
  private IEngine engine = null;

  public Vehicle(IEngine engine)
  {
    super();
    this.engine = engine;
  }
  
  public abstract void installEngine();

  /**
   * @return the engine
   */
  public IEngine getEngine()
  {
    return engine;
  }

  /**
   * @param engine the engine to set
   */
  public void setEngine(IEngine engine)
  {
    this.engine = engine;
  }

  
}
