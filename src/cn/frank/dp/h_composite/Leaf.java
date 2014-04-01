/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.h_composite;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class Leaf implements Component
{

  private String name = "";
  
  public Leaf(String name)
  {
    super();
    this.name = name;
  }

  @Override
  public void add(Component c)
  {
    System.out.println("Leaf can't add component");
  }

  @Override
  public void remove(Component c)
  {
    System.out.println("Leaf can't remove component");
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
  }

}
