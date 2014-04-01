/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.a_factory.abs;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-22
 * @changeLog:
 * 
 */
public class FactoryMain
{
  private IButton ib = null;
  private IText it = null;
  
  
  public static void main(String args[])
  {
    FactoryMain fm = new FactoryMain(new Win7WidgetFactory());
    fm.display();
    fm = new FactoryMain(new MacWidgetFactory());
    fm.display();
  }
  
  public FactoryMain(IWidgetFactory iwf)
  {
    if(iwf == null){
      throw new RuntimeException("No widget factory found");
    }
    this.setIb(iwf.getButton());
    this.setIt(iwf.getText());
  }
  
  public void display()
  {
    this.getIb().print();
    this.getIt().print();
  }

  /**
   * @return the ib
   */
  public IButton getIb()
  {
    return ib;
  }

  /**
   * @param ib the ib to set
   */
  public void setIb(IButton ib)
  {
    this.ib = ib;
  }

  /**
   * @return the it
   */
  public IText getIt()
  {
    return it;
  }

  /**
   * @param it the it to set
   */
  public void setIt(IText it)
  {
    this.it = it;
  }

  
}
