package com.alg.top20basic.array;

public class LogarithmicProcess {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		// Repeated Doubling
		int ndays = 0;
		for (int nrabits = 1; nrabits <= n; nrabits *= 2)
			++ndays;
		System.out.println(ndays);

		// Repeated halving
		ndays = 0;
		for (int ncovid = n; ncovid >= 1; ncovid /= 2)
			++ndays;
		System.out.println(ndays);

		// total spread measure
		int total = 0;
		ndays = 0;
		for (int ncovid = 1; total <= n; ncovid *= 2) {
			total += ncovid;
			++ndays;
		}
		System.out.println(ndays);

//		n log n
		int count = 0;
		for (int i = 1; i <= n; i *= 2) {
			for (int j = 1; j <= n; ++j) {
				++count;
			}
		}
	}

}
