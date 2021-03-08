package com.company;

import java.util.Scanner;

public class ex5 {
    public ex5(){
        System.out.println("ex5");
        Scanner scanner=new Scanner(System.in);
        int x,y,z,c,v;
        System.out.print("x=");
        x=scanner.nextInt();
        while (x<1000){
            System.out.print("x < 1000. repeat. x=");
            x=scanner.nextInt();
        }
        y=x/1000;
        z=(x/100)%10;
        c=(x/10)%10;
        v=x%10;
        System.out.println(x);
        System.out.println("რიცხვის ციფრთა ჯამი="+(y+z+c+v));
    }
}
