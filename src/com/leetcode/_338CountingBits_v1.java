package com.leetcode;

import java.util.Arrays;

public class _338CountingBits_v1 {

	public int[] countBits(int num) {
		int[] result = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			// Integer number = new Integer(i);
			String str = Integer.toBinaryString(i);
			str = str.replaceAll("0", "");
			result[i] = str.length();
		}
		return result;
	}

	public static int[] countBits2(int num) {
		if (num == 0)
			return new int[] { 0 };
		int[] result = new int[num + 1];

		int len, count = 0;
		while (true) 
		{
			len = count + 1;
			System.out.println( "len -> " + len);
			for (int i = 0; i < len; i++) 
			{
				count++;
				System.out.println( "	count -> " + count);
				
				result[count] = result[i] + 1;
				
				System.out.println( "		val -> " + result[count] + " with i = " + i);
				
				if (count >= num)
					return result;
			}
		}
	}

	public static void main(String[] args) {
		_338CountingBits_v1 clazz = new _338CountingBits_v1();
		long start = System.currentTimeMillis();

		int input = 50;

		int[] result = clazz.countBits2(input);
		System.out.println("total time " + (System.currentTimeMillis() - start));

		System.out.println(Arrays.toString(result));

		start = System.currentTimeMillis();

		result = clazz.countBits(input);
		System.out.println("total time " + (System.currentTimeMillis() - start));

		System.out.println(Arrays.toString(result));
	}

}
