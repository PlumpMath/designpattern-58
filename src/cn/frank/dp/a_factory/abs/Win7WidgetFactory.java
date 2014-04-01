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
public class Win7WidgetFactory implements IWidgetFactory
{

  @Override
  public IButton getButton()
  {
    return new Win7Button();
  }


  @Override
  public IText getText()
  {
    return new Win7Text();
  }

}
