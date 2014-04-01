/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.h_composite;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-23
 * @changeLog:
 * 
 */
public interface Component
{
   void add(Component c);
   void remove(Component c);
   void display(int depth);
}
