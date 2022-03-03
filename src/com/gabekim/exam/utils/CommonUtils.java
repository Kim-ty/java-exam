package com.gabekim.exam.utils;

public class CommonUtils {


    public void loggingList(String methods,Object obj){
        System.out.println();
        System.out.println("======================================================");
        System.out.println(methods);
        System.out.println("-------------------------------------------------------");
        System.out.println("list : "+obj.toString());
        System.out.println("======================================================");
        System.out.println();
    }

}
