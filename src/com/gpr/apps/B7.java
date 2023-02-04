package com.gpr.apps;

public class B7 {
	static void LietKe() {
		for(int i=10000;i<100000;i++) {
			if (B5.checkNT(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
