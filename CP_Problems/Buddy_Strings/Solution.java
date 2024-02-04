package CP_Problems.Buddy_Strings;
import java.util.*;
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        Set<Character> st = new HashSet<>();
        int[] freq = new int[26]; 
        int count = 0; 
        for(int i = 0;i < s.length();i++)
        {
            freq[s.charAt(i) - 'a']++;
            freq[goal.charAt(i) - 'a']--; 
            st.add(s.charAt(i)); 
            if(s.charAt(i) != goal.charAt(i)) count++;
        }

        if(s.equals(goal) && st.size() < s.length()) return true;

        for(int f : freq) {
            if(f != 0) return false;
        }

        if(count == 2) return true;
        return false;

    }
}