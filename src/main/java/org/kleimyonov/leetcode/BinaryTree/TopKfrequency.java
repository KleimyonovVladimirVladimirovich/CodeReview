package org.kleimyonov.leetcode.BinaryTree;

import java.util.*;

public class TopKfrequency {
    public static void main(String[] args) {
        int low = 1;
        int high = 10;
        int max = 100;
        int[] nums = new Random()
                .ints(low, high)
                .limit(max)
                .toArray();
        System.out.println(Arrays.toString(topKFrequent(nums, 5)));
        int[] numsTest = new Random().ints(1,10).limit(5).toArray();
        System.out.println(Arrays.toString(numsTest));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {                                      /*First*/
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        List<Integer>[] frequencyList = new ArrayList[nums.length + 1];
        for (int i = 0; i < frequencyList.length; i++) {
            frequencyList[i] = new ArrayList<>();
        }                                                          /*Second*/
        for (int num : count.keySet()) {
            int frequency = count.get(num);
            frequencyList[frequency].add(num);
        }

        //СБОРКА ОТВЕТА
        List<Integer> resultList = new ArrayList<>();
        for (int i = frequencyList.length - 1; i >= 0; i--) {
            List<Integer> numsList = frequencyList[i];
            for (int num : numsList) {
                if (k <= 0) {
                   return resultList.stream().mapToInt(v -> v).toArray();
                }
                resultList.add(num);
                k--;
            }
        }
       return resultList.stream().mapToInt(v -> v).toArray();
    }
}
