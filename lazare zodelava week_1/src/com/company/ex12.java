package com.company;

import java.util.Arrays;
import java.util.Random;

public class ex12 {
    public ex12(){
        int m[] = new int[8];
        Random random = new Random();
        for(int i=0; i<m.length; i++){
            m[i] = random.nextInt(20);
        }
        Arrays.sort(m);
//        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(m));
        for(int i=0; i<m.length/2; i++){
            int tmp = m[i];
            m[i]=m[m.length-1-i];
            m[m.length-1-i] = tmp;
        }
        System.out.println(Arrays.toString(m));
    }
}
