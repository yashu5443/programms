package question;

public class Hellojava {
	public static void main(String[] args) {
		String str="Hello Java";
		String str1="";
		String str2="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'){
				str1=str1+ch;
			}
			else {
				str2=str2+ch;
			}
		}
		System.out.println(str2+str1);
   }
}
