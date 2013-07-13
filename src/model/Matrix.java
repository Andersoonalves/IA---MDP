package model;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

	static List<Point> matrix;

	static Integer[][] world = new Integer[3][4];
	static Integer[][] result = new Integer[3][4];
	static List<Point> goals = new ArrayList<Point>();
	

	public static List<Point> g(){
		goals.add(new Point(0, 3, null)); 
		goals.add(new Point(1, 3, null)); 
		return goals;
	}
	
	public static Integer[][] w(){
		world[0][0] = -3;		world[0][1] = -3; 		world[0][2] = -3;		world[0][3] = 100;		
		world[1][0] = -3;		world[1][1] = null;		world[1][2] = -3;		world[1][3] = -100;		
		world[2][0] = -3;		world[2][1] = -3;		world[2][2] = -3;		world[2][3] = -3;
		return world;
	}
	
	public static Integer[][] r(){
		result[0][0] = 0;		result[0][1] = 0; 		result[0][2] = 0;		result[0][3] = 100;		
		result[1][0] = 0;		result[1][1] = null;	result[1][2] = 0;		result[1][3] = -100;		
		result[2][0] = 0;		result[2][1] = 0;		result[2][2] = 0;		result[2][3] = 0;
		return result;
	}
	
}
