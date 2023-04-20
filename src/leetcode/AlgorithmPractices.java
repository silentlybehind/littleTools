package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.Math.max;

public class AlgorithmPractices {

    public static int lengthOfLongestSubstring(String s) {
        String res ="";
        int  maxL=0;
        for(int i=0; i<s.length();i++)
        {
            for(int j=i; j<s.length();j++)
            {
                 String tmp =s.substring(i,j+1);
                //System.out.println(i +" "+ j + " "+tmp );
                Set<Character> con  =  new HashSet<Character>();
                for(int k=0; k<tmp.length();k++)  con.add(tmp.charAt(k));
                 if( tmp.length()==con.size() && tmp.length()>=maxL ) {
                     res = tmp;
                     maxL = tmp.length();
                 }
            }
        }
        return maxL;
    }

    static int repeatString(String s) {
        Set<Character> con  =  new HashSet<Character>();
        for(int i=0; i<s.length();i++)
        {
            con.add(s.charAt(i));
        }
        return con.size();
    }

    // 滑动串口
    public static int lengthOfLongestSubstringMethods(String s) {
        String res ="";
        int  maxLen=0, curLen = 0 , startIndex =0 ;
        // Set<Character> con  =  new HashSet<Character>();
        Map<Character, Integer> con = new HashMap<>();
        for(int i=0; i<s.length();i++)
        {
            //扩充窗口
            if(!con.containsKey(s.charAt(i))){
                con.put(s.charAt(i),(Integer) i);
                curLen ++;
            }
            //收缩窗口
            else{
              if(curLen > maxLen) maxLen = curLen;
                startIndex = Math.max(con.get(s.charAt(i)),startIndex) ;
                curLen = i - startIndex;
                con.put(s.charAt(i),(Integer) i);
            }
            //
            if(curLen > maxLen) maxLen = curLen;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s= "pwwkew";
        // System.out.println(lengthOfLongestSubstring(s) );
        System.out.println(lengthOfLongestSubstringMethods(s) );
    }
}
