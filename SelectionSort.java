package com.alg.top20.sortAlgos;

public class SelectionSort {

//(InputSize and time taken)1 Lakh : 2.85 secs   2 Lakh : 11.416 secs
	public static void selection_sort(int[] in) {
		for (int i = 0; i < in.length; ++i) {
			int minind = i;
			for (int j = i + 1; j < in.length; ++j) {
				if (in[j] < in[minind])
					minind = j;
			}
			ArrayUtils.swap(in, i, minind);
//			ArrayUtils.display(in);
		}

	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
//		int[] in = ArrayUtils.uniqueRandomData(n);
//		ArrayUtils.display(in);
//		selection_sort(in);
//		ArrayUtils.display(in);
		
		
//		Benchmarking of Algorithm
		int[] in = ArrayUtils.uniqueRandomData(n);
		long start = System.currentTimeMillis();
		selection_sort(in);
		long end = System.currentTimeMillis();
		System.out.println("Time taken by Algorithm:" + (end-start)/1000.0 + "secs");
		
	}

}
