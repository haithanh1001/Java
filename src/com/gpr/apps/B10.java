package com.gpr.apps;
import java.util.ArrayList;

public class B10 {
	static void LietKeNguyenTo2(int n) {
		ArrayList<Long> arrayFibo = new ArrayList<>();
		int tmp = 0;
		long t = B3.fibonacci(tmp);
		while (t<n) {
			if(B5.checkNT(t)) {
				arrayFibo.add(t);
				tmp++;
				t = B3.fibonacci(tmp);
			}
			else {
				tmp++;
				t = B3.fibonacci(tmp);
			}
		}
		for (int i=0;i<arrayFibo.size();i++) {
			System.out.print(arrayFibo.get(i) + " ");
		}
	}
}
