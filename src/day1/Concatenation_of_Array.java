package day1;

import java.util.Arrays;

public class Concatenation_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3 };
		int[] b = { 1, 4, 5, 6, 7 };
		int f = 0;
		int lngth = a.length + b.length;
		int[] c = new int[lngth];

		for (int element : a) {
			c[f] = element;
			f++;
		}

		for (int ele : b) {
			c[f] = ele;
			f++;
		}
		
		System.out.println(Arrays.toString(c));

	}

}
