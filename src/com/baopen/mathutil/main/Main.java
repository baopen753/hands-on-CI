/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baopen.mathutil.main;

import com.baopen.mathutil.core.MathUtil;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input a number: ");
        int n = 5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);

        System.out.println("Expected: " + n + "! = " + expected);
        System.out.println("Actual: " + n + "! = " + actual);

    }

}
