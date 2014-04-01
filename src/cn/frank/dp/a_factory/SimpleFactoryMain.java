/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.a_factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-22
 * @changeLog:
 * 
 */
public class SimpleFactoryMain
{

  public static void main(String[] args)
  {
    List<String> arrayList = ListFactory.getList(Type.ARRAYLIST);
    System.out.println(arrayList.getClass());
  }
  
  static class ListFactory
  {

    public static List<String> getList(Type type)
    {
      if (Type.ARRAYLIST.equals(type))
      {
        return new ArrayList<String>();
      }
      else if (Type.LINKEDLIST.equals(type))
      {
        return new LinkedList<String>();
      }
      return null;
    }

  }
 
 static enum Type{
   ARRAYLIST,LINKEDLIST;
 }

}
