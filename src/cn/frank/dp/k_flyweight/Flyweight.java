/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.k_flyweight;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-25
 * @changeLog:
 * 
 */
public final class Flyweight
{

  private final String key;
  private final String description;
  
  /**
   * @param key
   * @param description
   */
  public Flyweight(String key, String description)
  {
    super();
    this.key = key;
    this.description = description;
  }
  
  /**
   * @return the key
   */
  public String getKey()
  {
    return key;
  }
  /**
   * @return the description
   */
  public String getDescription()
  {
    return description;
  }
  
}
