package com.gpr.apps;
import java.util.ArrayList;

public class B9 {
	public static int DEC_10 = 10;
     
    public static boolean isThuanNghich(int n) {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        // phân tích số n thành các chữ số và lưu vào listNumbers
        do {
            listNumbers.add(n % DEC_10);
            n = n / DEC_10;
        } while (n > 0);
        // kiểm tra tính thuận nghịch
        int size = listNumbers.size();
        for (int i = 0; i < (size/2); i++) {
            if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}


