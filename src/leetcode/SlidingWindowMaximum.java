package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zhangyu
 * @version V1.0
 * @ClassName: SlidingWindowMaximum
 * @Description: TOTO
 * @date 2018/12/25 15:03
 **/


public class SlidingWindowMaximum {

    @Test
    public void fun() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int key = 3;
        List<Integer> arr = slidingWindowMaximum(nums, key);
        System.out.println(arr);
    }

    private List<Integer> slidingWindowMaximum(int[] nums, int key) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - key + 1; i++) {
            int temp = i + key;
            int j = i;
            int max = Integer.MIN_VALUE;
            while (j < temp && temp <= nums.length) {
                if (nums[j] > max) {
                    max = nums[j];
                }
                j++;
            }
            list.add(max);
        }
        return list;
    }
}
