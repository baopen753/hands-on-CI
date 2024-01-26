/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.baopen.mathutil.test.core;

import com.baopen.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author bao.kun
 */
public class MathUtilTest {

    // đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    // để kiểm tra code chính - hàm tính Giai thừa bên .core.MathUtil
    //  VIẾT CODE ĐỂ TEST CODE
    // có nhiều quy tắc đặt tên hàm kiểm thử 
    // @Test: JUnit sẽ phối hợp với JVM sẽ chạy hàm này
    // @Test phía hậu trường chính là public static void main()
    // có nhiều @Test ứng với nhiều case khác nhau để kiêm thử hàng tính giai thừa
    // C1: test với trả về là value tường minh
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() // đặt tên hàm phải liên quan đến case cự thể mà test
    {

        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);

        // so sánh dừng framework : XANH & ĐỎ
        Assert.assertEquals(expected, actual);  // hàm giúp so sánh 2 giá trị nào đó có giống nhau ko

        //2. gộp thêm vài case 
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));

        // nếu sai một case trong bộ test thì sẽ ĐỎ hết (SAI - bộ test case không bao quát)
        // tương đương mệnh đề AND
    }

    // hàm getF() ta thiết kế có hai tình huống xử lý
    // 1. đưa data tử tế trong  [0...20]   --- done !
    // 2. đưa dữ liệu < 0 || > 20  ---- theo thiết kế của hàm thì sẽ throw Exception
    // ko dùng assertEquals() để so sánh 2 ngoại lệ
    // C2: test khi trả về là exception
    // testcase
    // input: -5
    // expected: IllegalArgumentException xuất hiện
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentReturnsException() {

        MathUtil.getFactorial(-5);    // hàm @Test , hay hàm getF() chạy sẽ ném về ngoại lệ

    }

    // C3: cách khác để bắt ngoại lệ, viết tự nhiên hơn
    // sử dụng lamda-expression  @FunctionalInterface: là Interface chỉ có duy nhất một hàm 
    // từ JDK 8 có thể viết body trong hàm của interface - nhưng phải tại hàm static hoặc default 
    // vì trong functional interface chỉ có 1 hàm, nhưng khi ta gọi hàm này thì việc gọi cả interface cấp phát vùng nhớ là điều ko cần thiết
    ///   ->> @FunctionalInterface sẽ hỗ trợ gọi hàm trong Interface mà ko cần phải khởi tạo Interface
    @Test
    public void testGetFactorialGivenWrongArgumentReturnsExceptionLamdaVersion() {
        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5)
        );
        // arg1: loại ngoại lệ cần so sánh
        // arg2: đoạn code chạy vẩn ngoại lệ - runnable
        //  MathUtil.getFactorial(-5);    // hàm @Test , hay hàm getF() chạy sẽ ném về ngoại lệ
    }

    // C4: chủ động kiểm soát ngoại lệ theo đúng message
    @Test
    public void testGetFactorialGivenWrongArgumentReturnsExceptionLamdaVersion_TryCatch() {

        try {
            MathUtil.getFactorial(-10);
        } catch (Exception e) {
            Assert.assertEquals("Invalid arguments. N must be between 0...20", e.getMessage());
        }
        // bắt try_catch là JUnit sẽ ra màu xanh do đãn chủ động bắt ngoại lệ
        // những ko biết chắc ngoại lệ mình bắt có đúng hay ko
        // phải có code kiểm soát ngoại lệ IllegalArgumentException
    }
}
