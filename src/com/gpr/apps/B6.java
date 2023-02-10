package com.gpr.apps;

public class B6 {
	static String LietKeNguyenTo(int n) {
		int tmp = 0;
		String str = "";
		while(n>0) {
			if(B5.checkNT(tmp)) {
				str= str + tmp + " ";
				tmp++;
				n--;
			}
			tmp++;
		}
		return str;
	}
}


