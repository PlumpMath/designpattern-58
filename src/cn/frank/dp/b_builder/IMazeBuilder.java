/**
 * (C) Copyright Frank Fan -  All Rights Reserved.
 */
package cn.frank.dp.b_builder;

/**
 * @author: jun.fan2@hp.com
 * @version: 1.0
 * @since: 2013-4-22
 * @changeLog:
 * 
 */
public interface IMazeBuilder
{
  public void createRoadBlock();
  public void createWallBlock();
  public void createTreasureBlock();
  public void nextRow();
}
