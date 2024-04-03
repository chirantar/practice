package org.example.adhoc;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeDeque {
    public static void main(String[] args) {
//        Deque<Integer> q = new LinkedList<>();
//        Map<Integer, Integer> map = new HashMap<>();
////        map.remove();
//        StringBuilder sb = new StringBuilder();
//        sb.append(5);
//        sb.deleteCharAt(sb.length() -1);
//        int[] arr = {1, 2, 3};
//
//        List<Integer> list = Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.toList());

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 3; j++){
                System.out.print((i&(1<<j)) + ", ");
            }
            System.out.println();
        }

        Map<Integer, Integer> map = new HashMap<>();
//        StringBuilder sb = new StringBuilder();
//        sb.deleteCharAt();
    }

}
