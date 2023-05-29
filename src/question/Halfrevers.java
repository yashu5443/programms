package question;

public class Halfrevers {
	public static void main(String[] args) {
		long x = 132132126162l;
		int div = 1;
		int mul = 1;
		long x1 = x;
		long y = 0;
		System.out.println("INPUT  NUMBER----->" + x);
		while (x != 0) {
			x = x / 10;
			if (x < 999999) {
				while (x != 0) {
					long rev = x % 10;
					y = y * 10 + rev;
					x = x / 10;
					mul = mul * 10;
				}
			}
			div = div * 10;
		}
		x1 = x1 % div;
		y = y * mul + x1;
		System.out.println("OUTPUT NUMBER---->" + y);
	}
}
