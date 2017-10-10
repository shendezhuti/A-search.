package com.hzx.AstarSearch;

/*
 * 按照二维数组的特点，坐标原点在左上角，所以y是高，x是宽，y向下递增，x向右递增
 */
public class Coord {
      public int x;
      public int y;
      
      
      
      public Coord(int x,int y){
    	  this.x=x;
    	  this.y=y;
    	  
      }
      
      
      public boolean equals(Object obj){
    	  if(obj==null) return false;//做一个判断， 防止传进来的obj对象是空的
    	  if(obj instanceof Coord){//instanceof方法是判断前面的obj 是否是 Coord类的对象，是的话返回true
    		  Coord c= (Coord) obj; //强制转型
    		  return x==c.x&&y==c.y;
    	  }
    	  return false;
    	  
      }
      
      
}
