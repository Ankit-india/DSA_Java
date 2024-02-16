package src.assignments.recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> ans = permutationsList("", "ankitKumar");
        System.out.println(ans);
    }

    static void permutations(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            permutations(first + ch + second, unProcessed.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String processed, String unProcessed) {
        ArrayList<String> list = new ArrayList<>();
        if(unProcessed.isEmpty()) {
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);
        for(int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i, processed.length());
            list.addAll(permutationsList(first + ch + second, unProcessed.substring(1)));
        }
        return list;
    }
}
