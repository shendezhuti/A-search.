package com.hzx.AstarSearch;

public class Test {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int[][] maps = { 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 } 
				};
		
		MapInfo info=new MapInfo(maps, maps[0].length,maps.length , new Node(1,5), new Node(10,5));
		new Astar().start(info);
		printMap(maps);
	}

	private static void printMap(int[][] maps) {
      for (int i=0;i<maps.length;i++){
    	  
    	  {
    		  for (int j=0;j<maps[i].length;j++){
    			  System.out.print(maps[i][j]+"");
    		  }
    		  System.out.println();
    	  }
      }
	}

}
