package com.example;

import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    int result;

    int[][] grid;

    static Solution solution;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void onlyOneValor(){

        result = 1;

        grid = new int[][] {{1}};

        assertEquals(result, solution.deleteGreatestValue(grid));
    }

    @Test
    public void multipleValors(){

        result = 8;

        grid = new int[][] {{1,2,4}, {3,3,1}};

        assertEquals(result, solution.deleteGreatestValue(grid));
    }
}
