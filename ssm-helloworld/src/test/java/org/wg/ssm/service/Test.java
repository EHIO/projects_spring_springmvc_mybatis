package org.wg.ssm.service;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String str : list) {
            if ("2".equals(str)) {
                System.out.println(str);
                break;
            }
        }
    }
}
