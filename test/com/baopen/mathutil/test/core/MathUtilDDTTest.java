/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.baopen.mathutil.test.core;

import com.baopen.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// câu lệnh này của Junit báo hiệu rằng sẽ biến class này thành class Tham Số Hóa
// và cần loop qua tập data để lấy cặp data input/expected mồi vào hàm test
@RunWith(value = Parameterized.class)
// bản chất @Annotation là interface, còn MathUtilDDTTest implements @RunWith

public class MathUtilDDTTest {

    //ta sẽ trả về mảng hai chiều gồm nhiều cặp Expected | Input
    @Parameterized.Parameters  // JUnit sẽ ngầm chạy loop qua từng dòng để lấy ra được cặp data Input|Expected
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24}
        };

    }

    @Parameterized.Parameter(value = 0)  // value  = 0 là map với mảng data
    public int n;   // biến map với value của cột 0 của mảng

    @Parameterized.Parameter(value = 1)
    public long expected;   // kiểu long vì giá trị getFactorial(n) là kiểu long

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }

}



// NẾU VÀO FILE buil-impl.xml cấu hình lại ở dòng 1204: thêm 'test' vào sau complie thì Netbean sẽ triệu hồi JUnit tham gia quá trình đóng gói cùng Ant
//                                                                                     --> nếu Test fail thì ko đóng gói    
//                                                                                     --> nguyên lý hoạt động của CI                                             