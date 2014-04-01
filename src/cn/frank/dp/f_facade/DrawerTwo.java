/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.f_facade;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public class DrawerTwo
{
  public void open()
  {
    System.out.println("open second drawer by key got from first drawer");
    getSecretFile();
  }
  
  public void getSecretFile()
  {
    System.out.println("Successfully got the secret file! Task Done");
  }
}
