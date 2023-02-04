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
					for (int i=0;i<n;i++) {
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
		System.out.printf("%-5s%s\n","[9]","Liet ke so thuan nghich co 6 chu so");
		System.out.printf("%-5s%s\n","[10]","Liet ke cac so Fibonacci nho hon n la so nguyen to");
	}

}
