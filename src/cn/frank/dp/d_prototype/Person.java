/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.d_prototype;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-22
 * @changeLog:
 * 
 */
public class Person implements Cloneable
{
  private Long   id   = 0L;
  private String name = "";
  private String desc = "";

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getDesc()
  {
    return desc;
  }

  public void setDesc(String desc)
  {
    this.desc = desc;
  }

  /* 
   * @see java.lang.Object#clone()
   */
  @Override
  protected Object clone() throws CloneNotSupportedException
  {
    return super.clone();
  }
  
}
