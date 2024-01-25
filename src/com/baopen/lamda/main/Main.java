/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baopen.lamda.main;

import com.baopen.lamda.core.Salutation;

/**
 *
 * @author bao.kun
 */
public class Main {

    public static void main(String[] args) {

        // c1: xài interface kiểu truyền thống - new class Con đã được implements Cha
        Salutation greeting = new SalutationVN();
        greeting.sayHello("Say hello Vietnamese");

        
        
        // c2: ko cần làm class Con 
        // anonymous class: nghĩa là ko cần tạo class tương minh như trên
        Salutation hi = new Salutation() {
            @Override
            public void sayHello(String msg) {
                System.out.println(msg);
            }
        };
        hi.sayHello("Hello by Engish");

        
        
        // v2
        // hello by japan
        Salutation helloJP = (String msg) -> {
            System.out.println(msg);
        };
        helloJP.sayHello("Hello by Japan");
        
        
        
        // v2:
        
        
    }
}
