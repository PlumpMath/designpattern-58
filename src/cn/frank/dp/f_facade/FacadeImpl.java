/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.f_facade;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class FacadeImpl implements IFacade
{

  private DrawerOne d1 = new DrawerOne();
  private DrawerTwo d2 = new DrawerTwo();
  
  
  public static void main(String[] args)
  {
    IFacade facade = new FacadeImpl();
    facade.getSecretFile();
  }

  /* 
   * @see cn.frank.designpattern.f_facade.IFacade#open()
   */
  @Override
  public void getSecretFile()
  {
    this.getD1().open();
    this.getD2().open();
  }

  /**
   * @return the d1
   */
  public DrawerOne getD1()
  {
    return d1;
  }

  /**
   * @return the d2
   */
  public DrawerTwo getD2()
  {
    return d2;
  }

  
}
