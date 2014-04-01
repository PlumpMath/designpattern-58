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
public class MazeDirector
{
  private int[][]      maze;
  private IMazeBuilder mazeBuilder;

  public void buildMaze()
  {
    if (maze == null || mazeBuilder == null)
    {
      throw new RuntimeException("Condition is not enough to build maze");
    }

    for (int i = 0; i < maze.length; i++)
    {
      for (int j = 0; j < maze[i].length; j++)
      {
        switch (maze[i][j])
        {
          case 0:
            mazeBuilder.createRoadBlock();
            break;
          case 1:
            mazeBuilder.createWallBlock();
            break;
          case 2:
            mazeBuilder.createTreasureBlock();
            break;
          default:
            break;
        }
      }
      mazeBuilder.nextRow();  
    }

  }

  public void setMaze(int[][] maze)
  {
    this.maze = maze;
  }

  public void setMazeBuilder(IMazeBuilder mazeBuilder)
  {
    this.mazeBuilder = mazeBuilder;
  }
}
