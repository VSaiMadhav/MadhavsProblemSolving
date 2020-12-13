package com.alg.top20.sortAlgos;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

	public static void swap(int[] in, int i, int j) {
		int tmp = in[i];
		in[i] = in[j];
		in[j] = tmp;
	}

	public static int[] sortedData(int n) {
		int[] in = new int[n];
		for (int i = 0; i < n; ++i)
			in[i] = i + 1;
		return in;
	}

	public static int[] revsortedData(int n) {
		int[] in = new int[n];
		for (int i = 0; i < n; ++i)
			in[i] = n - i;
		return in;
	}

	private static void shuffle(int[] in) {
		Random r = new Random();
		for (int i = in.length - 1; i > 0; --i) {
			swap(in, i, r.nextInt(i + 1));
		}

	}

	public static int[] uniqueRandomData(int n) {
		int[] in = new int[n];
		for (int i = 0; i < n; ++i)
			in[i] = i + 1;
		shuffle(in);
		return in;
	}

	public static void display(int[] in) {
		for (int i = 0; i < in.length; ++i)
			System.out.print(in[i] + " ");
		System.out.println();
//		System.out.println(Arrays.toString(in));

	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		display(sortedData(n));
		display(revsortedData(n));
		display(uniqueRandomData(n));
	}

}
