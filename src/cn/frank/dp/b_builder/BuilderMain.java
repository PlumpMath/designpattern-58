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
public class BuilderMain
{

  /**
   * @param args
   * @since: 2013-4-22
   */
  public static void main(String[] args)
  {

    int maze[][] =
        { { 1, 1, 1, 1, 1, 1, 1 }, 
          { 1, 0, 0, 0, 0, 2, 1 }, 
          { 1, 0, 1, 0, 1, 0, 1 },
          { 1, 0, 2, 1, 0, 1, 1 }, 
          { 1, 1, 0, 1, 0, 1, 1 }, 
          { 1, 0, 0, 2, 0, 0, 1 },
          { 1, 1, 1, 1, 1, 1, 1 } };

    System.out.println("Build SolidMaze....");
    MazeDirector mazeDirector = new MazeDirector();
    mazeDirector.setMaze(maze);
    mazeDirector.setMazeBuilder(new SolidMazeBuilder());
    mazeDirector.buildMaze();
    
    System.out.println("Build DiamondMaze....");
    mazeDirector.setMazeBuilder(new DiamondMazeBuilder());
    mazeDirector.buildMaze();
  }

}
