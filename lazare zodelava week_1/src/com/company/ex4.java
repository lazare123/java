package com.company;

import java.util.Scanner;

public class ex4 {
    public ex4(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ex4");
        int x,y,z,c;
        System.out.print("x=");
        x=scanner.nextInt();
        while (x<100){
            System.out.println("repeat");
            System.out.print("x=");
            x=scanner.nextInt();

        }
        y=x/100;
        z=(x/10)%10;
        c=x%10;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);
    }
}
