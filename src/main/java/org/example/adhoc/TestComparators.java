package org.example.adhoc;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparators {
    public static void main(String[] args) {
        int[][] arr = {{4, 5}, {1, 2}, {7, 10}, {1, 8}};
        Arrays.sort(arr, Comparator.comparingInt(x -> x[1]));
        Arrays.stream(arr).forEach(x->{System.out.println(x[0] + ", " + x[1]);});
    }
}
