/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.g_adapter;

import java.util.List;
import java.util.Vector;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class ObjectAdapter implements ITarget
{
  private OriginalClass oc = null;

  public ObjectAdapter(OriginalClass oc)
  {
    this.oc = oc;
  }

  @Override
  public void printAll(List<String> lst)
  {
    Vector<String> v = new Vector<String>();
    for (int i = 0; i < lst.size(); i++)
    {
      v.add(lst.get(i));
    }
    oc.printAll(v);
  }

}
