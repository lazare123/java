package com.company;

import java.util.Scanner;

public class ex2 {
    public ex2(){
        System.out.println("ex2");
        Scanner scanner=new Scanner(System.in);
        int x,y;
        System.out.print("x=");
        x = scanner.nextInt();
        System.out.print("y=");
        y = scanner.nextInt();
        System.out.println("მეორის პირველზე გაყოფის შედეგად მიღებულ ნაშთი=");
        System.out.print(x%y);
        System.out.println("\nპირველის მეორეზე გაყოფის შედეგი=");
        System.out.print(y/x);


    }
}
