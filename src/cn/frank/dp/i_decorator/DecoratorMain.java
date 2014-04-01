/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.i_decorator;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-24
 * @changeLog:
 * 
 */
public class DecoratorMain
{

  /**
   * @param args
   * @since: 2013-4-24
   * 
   */
  public static void main(String[] args)
  {

    InputStream in = DecoratorMain.class.getResourceAsStream("source.txt");
    BufferedInputStream f = new BufferedInputStream(in);
    byte[] b = new byte[1024];
    try
    {
      while (f.read(b) > 0)
      {
        System.out.println(new String(b));
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    finally
    {
       try
      {
        f.close();
        in.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }

  }

}
