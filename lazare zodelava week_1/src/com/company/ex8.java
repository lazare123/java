package com.company;

import java.util.Scanner;

public class ex8 {
    public ex8(){
        System.out.println("ex8");
        Scanner scanner=new Scanner(System.in);
        int m,n,x;
        System.out.print("M=");
        m=scanner.nextInt();
        System.out.print("N=");
        n=scanner.nextInt();
        System.out.print("რიცხვები M-დან N-მდე    ");
        for (int i=0;i<(n-m);i++){
            x=m+i;
            System.out.print(x+",");


        }
    }
}
