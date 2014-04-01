/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.g_adapter;

import java.util.Vector;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class OriginalClass
{
  
  public void printAll(Vector<String> v)
  {
    for (int i = 0; i < v.size(); i++)
    {
      System.out.println(String.format("Vector %s value %s", i, v.get(i)));
    }
  }

}
