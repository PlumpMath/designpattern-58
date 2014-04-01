/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.k_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-25
 * @changeLog:
 * 
 */
public class FlyweightFactory
{
  private Map<String, Flyweight> cache = new HashMap<String, Flyweight>();

  public Flyweight getFlyweight(String key)
  {
    if (cache.containsKey(key))
    {
      return cache.get(key);
    }
    else
    {
      // load from db or web service soap
      Flyweight temp = new Flyweight(key, "the content load from db");
      cache.put(key, temp);
      return temp;
    }
  }

}
