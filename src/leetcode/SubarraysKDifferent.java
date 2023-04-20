package leetcode;

import java.util.ArrayList;

public class SubarraysKDifferent {
    static int maxL=0;
    public static void main(String[] args) {
        String s= "pwwkew";
        // System.out.println(lengthOfLongestSubstring(s) );
        int[] nums = {1,2,3};
        System.out.println(subarraysWithKDistinct(nums,3) );
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
       int res =0;
       ArrayList<Integer>  subarr = new ArrayList<Integer>();
       func( nums, k, 0,0, subarr);
       return maxL;

    }
   // 长度为k的子数组
    static void func(int[] nums, int k,int stari, int curi, ArrayList<Integer> subarr) {
        int len = subarr.size();
        if((len+1) > k  ){
            // -> len +1 == k
            maxL++;
            for(int j=0; j<subarr.size();j++)
                System.out.print(subarr.get(j) +" " );

            System.out.println("["+stari +curi+"]");
            return ;
        }
        else{

            for (int i = curi; i < nums.length; i++) {
                subarr.add(nums[i]);
                stari = i;
                System.out.println("curi = "+ (curi+1));
                func(nums, k, stari, curi + 1, subarr);
                subarr.remove(subarr.size()-1);
                for(int j=0; j<subarr.size();j++)
                    System.out.print(subarr.get(j) +" " );
            }
        }
    }

}
