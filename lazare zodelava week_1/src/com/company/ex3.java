package com.company;

import java.util.Scanner;

public class ex3 {
    public ex3(){
        System.out.println("ex3");
        int  x, y, z;
        Scanner scanner=new Scanner(System.in);
        System.out.print("X=");
        x = scanner.nextInt();
        System.out.print("Y=");
        y = scanner.nextInt();
        System.out.print("Z=");
        z = scanner.nextInt();
        System.out.println("X+Y+Z="+(x+y+z));
        System.out.println("X*Y*Z="+(x*y*z));
    }
}
