package com.venu.basic.programs;
import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {
    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        list.parallelStream().forEach(System.out::println);
    }
}
