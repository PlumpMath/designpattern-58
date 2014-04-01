/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.h_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class Composite implements Component
{

  private String name = "";
  private List<Component> children = new ArrayList<Component>();
  
  /**
   * @param name
   */
  public Composite(String name)
  {
    super();
    this.name = name;
  }

  @Override
  public void add(Component c)
  {
    children.add(c);
  }

  @Override
  public void remove(Component c)
  {
    children.remove(c);
  }

  @Override
  public void display(int depth)
  {
    String sketon = "";
    for (int i = 0; i < depth; i++)
    {
      sketon += "-";
    }
    System.out.println(sketon + name);
    for (Component c : children)
    {
       c.display(depth+2);
    }
      
  }

}
