package com.qcq.mall;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qcq
 * @create 2019/12/30-5:17 下午
 */
public class Debug {
    public static void main(String[] args) {
        Map map=new HashMap<String,String>();
        map.put("name","qcq");
        map.put("age","28");
        map.put("subject","java");
        map.put("salary","100");
        String age= (String) map.get("age");
        System.out.println("age = " + age);

    }
}
