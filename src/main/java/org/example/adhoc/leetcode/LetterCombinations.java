package org.example.adhoc.leetcode;

import java.util.*;

public class LetterCombinations {

    private static Map<Character, String> dataMap = new HashMap<>();

    static {
        dataMap.put('2', "abc");
        dataMap.put('3', "def");
        dataMap.put('4', "ghi");
        dataMap.put('5', "jkl");
        dataMap.put('6', "mno");
        dataMap.put('7', "pqrs");
        dataMap.put('8', "tuv");
        dataMap.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        Queue<String> ans = new LinkedList<>();
        ans.add("");

        for (int i = 0; i < digits.length(); i++) {

            String data = dataMap.get(digits.charAt(i));
            System.out.println(data);

            for (int k = 0; k < ans.size(); k++) {
                String val = ans.poll();

                StringBuilder sb = new StringBuilder(val);

                for (int j = 0; j < data.length(); j++) {
                    char c = data.charAt(j);
                    sb.append(c);
                    ans.add(new String());

                    sb.deleteCharAt(sb.length() - 1);
                }
            }

        }


        return new ArrayList<>(ans);
    }
}
