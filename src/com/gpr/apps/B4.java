package com.gpr.apps;

public class B4 {
	static int UCLN(int a, int b) {
		
		    while ( a != b)
		    {
		        if (a > b)
		            a = a - b;
		        else
		            b = b - a;
		    }

		    return a; 
		}
	
	static int BCNN(int a,int b) {
		return (a*b) / UCLN(a,b);
	}
	
	}

