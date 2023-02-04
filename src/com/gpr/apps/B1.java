package com.gpr.apps;
import java.lang.Math;
public class B1 {
	static void PTB2(int a, int b, int c) {
		System.out.printf("Phuong trinh %dx^2+%dx+%d\n",a,b,c);
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.print("Phuong trinh vo so nghiem!");
				}
				else {
					System.out.print("Phuong trinh vo nghiem!");
				}
			}
			else {
				float n = -c/b;
				System.out.printf("Phuong trinh co 1 nghiem duy nhat: x = %.4f", n);
			}
			return;
		}
		else {
			float delta = b*b - 4*a*c;
			float x1;
			float x2;
			if(delta>0) {
				x1=(float)((-b+Math.sqrt(delta))/(2*a));
				x2=(float)((-b-Math.sqrt(delta))/(2*a));
				System.out.printf("Phuong trinh co 2 nghiem la x1 = %.4f va x2 = %.4f",x1,x2);
			}
			else if (delta ==0) {
				x1 = (float)(-b/(2*a));
				System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.4f", x1);
			}
			else {
				System.out.print("Phuong trinh vo nghiem!");
			}
			return;
		}
	}
}
