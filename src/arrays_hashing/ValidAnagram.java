package leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;


        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false; // character not found
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);    // clean up when count hits zero
        }


        return map.isEmpty();
    }


    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram")); // true
        System.out.println(va.isAnagram("rat", "car"));         // false
    }
}
