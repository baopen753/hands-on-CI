/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.baopen.lamda.core;

/**
 *
 * @author bao.kun
 */


// sử dụng lamda-expression  @FunctionalInterface: là Interface chỉ có duy nhất một hàm 
                                 // từ JDK 8 có thể viết body trong hàm của interface - nhưng phải tại hàm static hoặc default 
    // vì trong functional interface chỉ có 1 hàm, nhưng khi ta gọi hàm này thì việc gọi cả interface cấp phát vùng nhớ là điều ko cần thiết
    ///   ->> @FunctionalInterface sẽ hỗ trợ gọi hàm trong Interface mà ko cần phải khởi tạo Interface
@FunctionalInterface
public interface Salutation {
    
    public  void sayHello(String mesg);
    
    
}
