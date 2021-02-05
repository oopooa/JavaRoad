package com.opoa;

import org.junit.Assert;
import org.junit.Test;


public class TestTwoSum {

    @Test
    public void testSolution1() {
        Assert.assertArrayEquals(new int[]{0, 1}, TwoSum.solution1(new int[]{2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[]{1, 2}, TwoSum.solution1(new int[]{1, 2, 3}, 5));
        Assert.assertArrayEquals(new int[]{}, TwoSum.solution1(new int[]{5, 2, 1}, 10));
    }

    @Test
    public void testSolution2() {
        Assert.assertArrayEquals(new int[]{0, 1}, TwoSum.solution2(new int[]{2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[]{1, 2}, TwoSum.solution2(new int[]{1, 2, 3}, 5));
        Assert.assertArrayEquals(new int[]{}, TwoSum.solution2(new int[]{5, 2, 1}, 10));
    }

}