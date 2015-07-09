package com.mine.javalearning.algo;

public class Solution {

	public static String solution(String str1, String str2) {
		char[] a = new StringBuffer(str1).reverse().toString().toCharArray();  
        char[] b = new StringBuffer(str2).reverse().toString().toCharArray();
        
        StringBuilder sb = new StringBuilder();
        int c = 0;
        int la = a.length;
        int lb = b.length;
        int len = la > lb ? la: lb;
        for (int i = 0; i < len; i++) {
        	 int itemA = i < la ? (a[i] - '0') : 0;  
             int itemB = i < lb ? (b[i] - '0') : 0;
             int sum = itemA + itemB;
             sb.append(sum%10 + c);
             c = sum /10;
        }
        if (c != 0) {
        	sb.append(c);
        }
        return sb.reverse().toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "9999";
		String s2 = "1111";
		System.out.println(solution(s1,s2));
	}

}
