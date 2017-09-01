package com.test.modeldesign.singleton;

/**
 * 只允行生成三个Triple实例,且编号分别为0.1.2
 * @author Thinkpad
 *
 */
public class Triple  {
	private static Triple[] triple = new Triple[]{
			new Triple(0),
			new Triple(1),
			new Triple(2)
	};
	
	private int id;
	private Triple(int id){
		System.out.println("The instance "+id+" is created.");
		this.id = id;
	}
	public static Triple getInstance(int id){
		return triple[id];
	}
	
	@Override
	public String toString(){
		return "[Triple id = "+id+"]";
	}
}
