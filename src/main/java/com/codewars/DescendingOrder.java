package com.codewars;

import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.valueOf(String.valueOf(num).chars().mapToObj(x -> -1*Character.getNumericValue(x)).sorted().map(i-> String.valueOf(-i)).collect(Collectors.joining("")));
    }
}