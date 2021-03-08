package com.company;

import java.util.Arrays;
import java.util.Random;

public class ex11 {
    public ex11(){
        System.out.println("ex11");
        int m[]=new int[8];
        Random random=new Random();
        for (int i=0;i<m.length;i++){
            m[i]=random.nextInt(20);
        }
        System.out.println(Arrays.toString(m));
    }
}
