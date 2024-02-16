package src.assignments.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        getAllSubSequence("", s, list);
        System.out.println(list);

    }

    static void getAllSubSequence(String s, String curr, List<String> list) {
        if(curr.isEmpty()) {
            list.add(s);
            return;
        }
        char ch = curr.charAt(0);
        getAllSubSequence(s + ch, curr.substring(1), list);
        getAllSubSequence(s, curr.substring(1), list);
    }
}
