/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.g_adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class ClassAdapter extends OriginalClass implements ITarget
{

  public static void main(String[] args)
  {
    List<String> lst = new ArrayList<String>();
    lst.add("Frank Fan");
    lst.add("Fan Jun");
    ITarget target = new ClassAdapter();
    target.printAll(lst);
  }

  @Override
  public void printAll(List<String> lst)
  {
    Vector<String> v = new Vector<String>();
    for (int i = 0; i < lst.size(); i++)
    {
      v.add(lst.get(i));
    }
    this.printAll(v);
  }

}
