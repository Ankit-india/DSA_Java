package src.assignments.sorting;

import java.util.ArrayList;
import java.util.List;

public class SortCharactersByFrequency {
    // https://leetcode.com/problems/sort-characters-by-frequency/
    class Pair implements Comparable<Pair> {
        int key;
        int val;

        public Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(other.val, this.val);
        }
    }

    public String frequencySort(String s) {
        int[] arr = new int[123];
        for(char x: s.toCharArray()) {
            arr[(int)x] += 1;
        }
        List<Pair> pairList = new ArrayList<>();
        for(int i = 0; i < 123; i++) {
            if(arr[i] != 0) {
                pairList.add(new Pair(i, arr[i]));
            }
        }
        pairList.sort(null);
        StringBuilder ans = new StringBuilder();
        for(Pair pair : pairList) {
            for(int i = 0; i < pair.val; i++) {
                ans.append((char)pair.key);
            }
        }
        return ans.toString();
    }
}