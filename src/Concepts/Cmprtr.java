package Concepts;

import java.util.*;

public class Cmprtr {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Comparator<String> cmp = Comparator.comparingInt(String::length);
        names.add("Viraj");
        names.add("Devajit");
        names.add("Yash");
        names.add("Abhijeet");
        names.sort(cmp);
        System.out.println(names);
    }
}
