package question;

public class OppAlf {
	public static void main(String[] args) {
		String str = "ABCxyzXYZabc";
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				char ch1 = 'a';
				int count = 122;
				while (ch1 != ch) {
					count--;
					ch1++;
				}
				ch = (char) count;
				System.out.print(ch);
			} else if (ch >= 'A' && ch <= 'Z') {
				char ch1 = 'A';
				int count = 90;
				while (ch1 != ch) {
					count--;
					ch1++;
				}
				ch = (char)count;
				System.out.print(ch);

			}
		}
	}
}
