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
public class Main
{

  public static void main(String[] args)
  {
    Component root = new Composite("C:\\");
    Component program = new Composite("Program Files");
    program.add(new Leaf("Office2007"));
    program.add(new Leaf("temp"));
    Component windows = new Composite("Windows");
    windows.add(new Leaf("temp"));
    windows.add(new Leaf("system32"));
    Component temp = new Leaf("fanjun.txt");
    
    root.add(program);
    root.add(windows);
    root.add(temp);
    root.display(0);
    
  }

}
