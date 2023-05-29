package question;

import java.util.HashSet;

public class LongestSubstring {
	public static String longestSubstring(String str) {
		int n = str.length();
		int m=str.charAt(0)-48;
		System.out.println(m);
		int count;
		String longest = "";
		HashSet<Character> l = new HashSet<Character>();
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				l.clear();
				count=0;
				String sub = str.substring(i, j);
				for (int k = i; k < j; k++) {
					l.add(str.charAt(k));
				}
				for(Object c:l){
					count++;
				}
//				System.out.println(sub);
					 if (count==m&&sub.length() > longest.length()) {
						longest = sub;
						System.out.println(longest);
					}
				
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		String str = "3aabacbebebe";
		String str1 = "2aabbcbbbadef";
		String str2 = "5aabbbcdeefgh";
		String longest = longestSubstring(str);
		System.out.println("Longest substring is: " + longest);
		String longest1 = longestSubstring(str1);
		System.out.println("Longest substring is: " + longest1);
		String longest2 = longestSubstring(str2);
		System.out.println("Longest substring is: " + longest2);
	}
}
