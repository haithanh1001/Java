package com.gpr.apps;
import java.util.Scanner;
public class BTMang {
	
	/**
	 * Tinh tong cac phan tu trong mang
	 * @param mang Mang can tinh tong
	 * @return Tong cac phan tu
	 */
	
	public static float Tong(float[] mang) {
		int n = mang.length;
		float s = 0;
		for (int i=0;i<n;i++) {
			s = s + mang[i];
		}
		return s;
	}
	
	public static float[] MinMaxAve (float[] mang) {
		float MMA[];
		MMA = new float[3];
		float min = mang[0];
		float max = mang[0];
		float tong =0;
		
		for (int i=0;i<mang.length;i++) {
			tong = tong + mang[i];
			if(mang[i]>max) {
				max = mang[i];
			}
		}
		MMA[0] = max;
		
		for (int i=0;i<mang.length;i++) {
			if(mang[i]<min) {
				min = mang[i];
			}
		}
		MMA[1] = min;
		MMA[2] = tong/mang.length;
	return MMA;
	}
	public static float TongNguyenTo(float[] mang) {
		float tong = 0;
		for(int i=0;i<mang.length;i++) {
			if((int)mang[i]==mang[i]) {
				if(B5.checkNT((long)mang[i])){
					tong=tong + mang[i];
				}
			}
		}
		return tong;
	}
	
	public static void nhapMaTran(int matran[][]) {
		Scanner input = new Scanner(System.in);
		for (int i=0;i<matran.length;i++) {
			for (int j=0;j<matran[i].length;i++) {
				matran[i][j]=input.nextInt();
			}
		}
	}
	
	public static int[][] congHaiMaTran(int matran1[][], int matran2[][]){
		int matran[][]= new int[matran1.length][matran1[0].length];
		for(int i=0;i<matran1.length;i++) {
			for (int j=0;j<matran1[i].length;j++) {
				matran[i][j]=matran1[i][j] + matran2[i][j];
			}
		}
		return matran;
	}
}
