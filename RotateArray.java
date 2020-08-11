package com.alg.top20basic.array;

import java.util.Arrays;
import java.util.Random;

public class RotateArray {
	// TC : Theta(kn) SC: O(n)
	public static void rotateArray1(int[] in, int k) {
		for (int i = 1; i <= k; ++i) {
			int last = in[in.length - 1];
			for (int j = in.length - 2; j >= 0; --j)
				in[j + 1] = in[j];
			in[0] = last;
		}
	}

	// TC : Theta(n) SC: Theta(n)
	public static void rotateArray2(int[] in, int k) {
		int[] aux = new int[in.length];
		for (int i = 0; i < in.length; ++i) {
			aux[(i + k) % in.length] = in[i];
		}
		for (int i = 0; i < in.length; ++i) {
			in[i] = aux[i];
		}
	}
	
	private static void reverse(int[] in, int l , int r) {
		while(l<r) {
			int tmp = in[l];
			in[l] = in[r];
			in[r] = tmp;
			l++;
			r--;	
		}
	}

	// TC : Theta(n) SC: O(1)
	public static void rotateArray3(int[] in, int k) {
		reverse(in,0,in.length-1);
		reverse(in,0,k-1);
		reverse(in,k,in.length-1);
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] in = new int[n];
		Random r = new Random();
		for (int i = 0; i < in.length; ++i)
			in[i] = r.nextInt(n) + 1;
		int k = n-1;
		//System.out.println(Arrays.toString(in));
		System.out.println(k);
		long start = System.currentTimeMillis();
		// Solution2 1million:0.008secs 10million:0.043secs 100million:0.394secs
		rotateArray3(in, k);
		long end = System.currentTimeMillis();
		System.out.println("Time taken =" + (end - start) / 1000.0 + "secs");
		//System.out.println(Arrays.toString(in));

	}

}
