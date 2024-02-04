package CP_Problems.Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram;

class Solution {
    public int minSteps(String s, String t) { 
        if(s.equals(t)) return 0;
        int ans = 0;
        int arr[] = new int[26];
        for(int i = 0;i < s.length();i++)
        {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int freq : arr) if(freq > 0) ans += freq;
        return ans; 
    }
}