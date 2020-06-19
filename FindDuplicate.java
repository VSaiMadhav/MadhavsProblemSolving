package com.alg.Top20Basic.Arrays;

import java.util.Arrays;

public class FindDuplicate {

	public static int findDuplicate(int[] in) {
		for (int i = 0; i < in.length - 1; ++i) {
			for (int j = i + 1; j < in.length; ++j) {
				if (in[i] == in[j])
					return in[i];
			}
		}

		return Integer.MIN_VALUE;
	}

	public static int findDuplicate2(int[] in) {
		Arrays.sort(in);
		for (int i = 1; i < in.length; ++i)
			if (in[i] == in[i - 1])
				return in[i];
		return Integer.MIN_VALUE;

	}

	public static int findDuplicate3(int[] in) {
		boolean[] aux = new boolean[in.length];
		for (int i = 0; i < in.length; ++i) {
			int tmp = in[i];
			if (aux[tmp] == true)
				return tmp;
			aux[tmp] = true;
		}
		return Integer.MIN_VALUE;
	}

	public static int findDuplicate4(int[] in) {
		for (int i = 0; i < in.length; ++i) {
			int tmp = Math.abs(in[i]);
			if (in[tmp] < 0)
				return tmp;
			in[tmp] *= -1;
		}
		return Integer.MIN_VALUE;

	}

	public static void testCase1(int[] in) {
		int i;
		for (i = 0; i < in.length - 1; ++i) {
			in[i] = i + 1;
		}
		in[i] = in.length - 1;
	}

	public static void testCase2(int[] in) {
		int i;
		for (i = 0; i < in.length - 1; ++i) {
			in[i] = in.length - 1 - i;
		}
		in[i] = in.length - 1;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] ib = new int[n];
		testCase2(ib);
		// System.out.println(Arrays.toString(ib));
		long start = System.currentTimeMillis();
		System.out.println(findDuplicate4(ib));
		long end = System.currentTimeMillis();
		// Benchmarking the Algorithm.
		System.out.println("Time taken:" + (end - start) / 1000.0 + "secs");
	}

}
