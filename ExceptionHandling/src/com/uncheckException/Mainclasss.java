package com.uncheckException;

public class Mainclasss {

	public static void main(String[] args) {
     System.out.println(print());
	}
	private static int print() 
	{
		try {
			int i=10/0;
			return 1;
		}catch(Exception e){
			return 2;
		}finally {
			return 3;
		}
		
	}

}
