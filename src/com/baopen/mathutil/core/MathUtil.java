/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baopen.mathutil.core;

/**
 *
 * @author bao.kun
 */
public class MathUtil {

    // trong class này cung cấp ra ngoài nhiều hàm xử lý toán học
    // hàm thư viện xài chung cho ai đó mà ko cần lưu lại trạng thái thì ta sẽ chọn thiết kế là hàm static
    // hàm tính giai thừa !!!
    public static long getFactorial(int n) {

        if (n < 0 || n > 2) {
            throw new IllegalArgumentException("Invalid arguments. N must be between 0...20");
        }

        if (n == 1 || n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
