package com.Sele;

public class testexception {

	public static void main(String[] args) {
		/*
		 * System.out.println(1); System.out.println(2/0);
		 */

		// String s=null;

		// System.out.println(s.length());
		String s = "12345";
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(30);
			try {
				System.out.println(3 / 0);
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
