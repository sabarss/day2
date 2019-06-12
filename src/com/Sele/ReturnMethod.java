package com.Sele;


public class ReturnMethod {
	
	public static   int max(int a,int b) {
		int result;
		if(a>b)
			result= a;
		else
			result= b;
		return result;
		
		//System.out.println(result);
	}
	
	
  
	public static void main(String[] args) {
		//max();
		int a=40,b=20,maximum,n3=40;
		maximum=max(a, b);
		System.out.println("maximum is" +maximum);
		System.out.println("maximum is"+max(33,66));
		System.out.println("maximum is"+max(33,69));
	}

}
	/*public static void max(int a,int b) {
		int result;
		if(a>b)
			result= a;
		else
			result= b;
		
		
	System.out.println(result);
	}
	public static void main(String[] args) {
		max(20,30);
		max(40,50);
		max(40,50);
	}
}*/