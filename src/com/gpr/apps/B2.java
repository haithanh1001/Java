package com.gpr.apps;

public class B2 {
	static long giaithua(int n) {
		if (n==0) {
			return 1;
		}
		else return n*giaithua(n-1);
	}
}
