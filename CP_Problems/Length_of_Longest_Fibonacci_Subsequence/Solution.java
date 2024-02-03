package CP_Problems.Length_of_Longest_Fibonacci_Subsequence;
import java.util.*;
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> st = new HashSet<>();
        for(int no : arr)
        {
            st.add(no);
        }
        int first = -1;
        int second = -1;
        int maxLen = 0;
        int currLen = 0;
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = i+1;j < arr.length;j++)
            {
                first = arr[i];
                second = arr[j];
                if(st.contains(first + second)) currLen = 2;
                while(st.contains(first + second))
                {
                    int temp = first + second;
                    first = second;
                    second = temp;
                    // System.out.println(temp);
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }
}
