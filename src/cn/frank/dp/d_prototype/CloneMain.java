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
public class CloneMain
{

  /**
   * @param args
   * @throws CloneNotSupportedException 
   * @since: 2013-4-22
   */
  public static void main(String[] args) throws CloneNotSupportedException
  {
    Person p = new Person();
    p.setId(1L);
    p.setName("Frank");
    
    Person pclone = (Person) p.clone();
    pclone.setDesc("Add more detail for this person");
    
    System.out.println(pclone.getName());
    
  }

}
