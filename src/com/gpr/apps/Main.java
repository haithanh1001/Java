package com.gpr.apps;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		while (true && exit == false) {
			MENU();
			System.out.print("Chon chuong trinh! ");
			int select = input.nextInt();
			int n,a,b,c;
			switch(select) {
				case 1:
					System.out.print("Nhập a: ");
			         a = input.nextInt();
			        System.out.print("Nhập b: ");
			         b = input.nextInt();
			        System.out.print("Nhập c: ");
			         c = input.nextInt();
					B1.PTB2(a, b, c);
					break;
				case 2:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					System.out.printf("n giai thua la: %d! = %l",n,B2.giaithua(n));
					break;
				case 3:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					System.out.printf("So fibonacci thu %d cua day la: %d",n,B3.fibonacci(n));
					break;
				case 4:
					System.out.print("Nhập a: ");
				    a = input.nextInt();
				    System.out.print("Nhập b: ");
				    b = input.nextInt();
				    System.out.println("Uoc chung lon nhat la: " + B4.UCLN(a, b));
				    System.out.println("Boi chung nho nhat la: " + B4.BCNN(a, b));
				    break;
				case 5:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					for (long i=0;i<n;i++) {
						if(B5.checkNT(i)) {
							System.out.print(i + " ");
						}
					}
					break;
				case 6:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					System.out.printf("%d so nguyen to dau tien la: %s",n,B6.LietKeNguyenTo(n));
					break;
				case 7:
					System.out.println("Cac so nguyen to co 5 chu so la: ");
					B7.LietKe();
					break;
				case 8:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					System.out.printf("Tong cac chu so cua %d la: %d",n,B8.TongChuSo(n));
					break;
				case 9:
					System.out.println("Cac so thuan nghich co 6 chu so la: ");
					for (int i = 100000; i < 1000000 ; i++) {
						if (B9.isThuanNghich(i)) {
							System.out.print(i + " ");
						}
					}
					break;
				case 10:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					System.out.println("Cac so Fibonacci la so nguyen to nho hon n la: ");
					B10.LietKeNguyenTo2(n);
				case 11:
					float[] mang = {1,2,3,4,5,6,7,8};
					
//					float b[];
//					b = new float[5];
//					b[0]=1;
//					b[1]=2;
//					...
					System.out.printf("Tong cac phan tu cua mang: %.0f", BTMang.Tong(mang));
					break;
				case 12:
					float[] mang2 = {1,2,3,4,5,6,7,8,9,10};
					float[] kq = BTMang.MinMaxAve(mang2);
					System.out.printf("Max %.2f Min %.2f Average %.2f",kq[0],kq[1],kq[2]);
					
//					BTMang.MinMaxAve(mang2);
					break;
				case 13:
					float[] mang3 = {1,(float) 2.12,(float) 3.1,4,5,6,7,8,9,10};
					System.out.printf("Tong cac phan tu la so nguyen to cua mang la: %.0f", BTMang.TongNguyenTo(mang3));
					break;
				default:
					exit = true;
			}
		}
//		System.out.print("Moi ban nhap thu 1 chuoi: ");
//		String name = input.next();
//		System.out.println("Chuoi vua nhap: " + name);
//		int n = 11;
//		boolean kq = LaChan(n);
//		if(kq) {
//			System.out.print("La so chan!!!");
//		}
//		else System.out.println("La so le!!!");
//		
	}
	static boolean LaChan(int a) {
		return a%2==0;
	}
	
	static void MENU () {
		System.out.printf("\n%-5s%s\n","[1]","Phuong trinh bac 2");
		System.out.printf("%-5s%s\n","[2]","Giai thua");
		System.out.printf("%-5s%s\n","[3]","Tim so Fibonacci thu n");
		System.out.printf("%-5s%s\n","[4]","Tim UCLN va BCNN");
		System.out.printf("%-5s%s\n","[5]","Liet ke so nguyen to nho hon n");
		System.out.printf("%-5s%s\n","[6]","Liet ke n so nguyen to dau tien");
		System.out.printf("%-5s%s\n","[7]","Liet ke tat ca cac so nguyen to co 5 chu so");
		System.out.printf("%-5s%s\n","[8]","Tinh tong cac chu so cua 1 so nguyen");
		System.out.printf("%-5s%s\n","[9]","Liet ke so thuan nghich co 6 chu so (chua fix!!!!)");
		System.out.printf("%-5s%s\n","[10]","Liet ke cac so Fibonacci nho hon n la so nguyen to");
		System.out.printf("%-5s%s\n","[11]","Tinh tong cac phan tu cua mang (fix cung)");
		System.out.printf("%-5s%s\n","[12]","Tinh Max Min Average cua mang (fix cung)");
		System.out.printf("%-5s%s\n","[13]","Tinh tong cac phan tu cua mang la so nguyen to (fix cung)");

	}

}
