package com.hzx.AstarSearch;
/**
 * 这个类将A*Search算法的输入数据封装在一起，便于传递参数
 * @author hzx
 *
 */
public class MapInfo {

	 public int [][] maps;//二维数组的地图
	 public int width;//地图的宽
	 public int height;//地图的高
	 public Node start;//起始结点
	 public Node end;//最终结点
	 
	public MapInfo(int [][]maps, int width,int height,Node start,Node end){
	this.maps=maps;
	this.width=width;
	this.height=height;
	this.start=start;
	this.end=end;
	
	}
}
