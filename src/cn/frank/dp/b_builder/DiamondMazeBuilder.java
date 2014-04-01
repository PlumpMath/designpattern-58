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
public class DiamondMazeBuilder implements IMazeBuilder
{

  @Override
  public void createRoadBlock()
  {
    System.out.print("　");
  }

  @Override
  public void createWallBlock()
  {
    System.out.print("◇");
  }

  @Override
  public void createTreasureBlock()
  {
    System.out.print("* ");
  }

  @Override
  public void nextRow()
  {
    System.out.println();
  }

}
