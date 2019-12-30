package com.qcq.mall;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HelloWorld {
    public static final String NAME="aaa";
    private static final int i=0;
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);
        System.out.println("hello world!!");
        List<String> list = new ArrayList<>();
        list.add("aaa");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        try {
            FileInputStream fileInputStream=new FileInputStream("file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] strs=new String[]{"aaa","bbb","ccc"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        for (String str : strs) {
            System.out.println(str);
        }
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(111);
        list3.add(333);
        for (String s : list) {
            System.out.println(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static void f(){
        int num= 0;
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(111);
        list3.add(333);
        if (list3 == null) {
            
        }
        if (list3 != null) {
            
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
