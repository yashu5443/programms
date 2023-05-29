package question;

public class EvoluvsStrRev {
	public static void main(String[] args) {
		String str="iam java developer";
		String[] arr=str.split(" ");
		for (int i =arr.length-1; i>=0; i--) {
			String a=arr[i];
			for (int j = 0; j < a.length(); j++) {
				if(j==a.length()-1){
//					char ch=a.charAt(j);
//						ch=(char)(ch-32);
//						System.out.print(ch);
					System.out.print((char)(a.charAt(j)-32));
				}
				else{
					System.out.print(a.charAt(j));
				}
			}
			System.out.print(" ");
		}
		
	}

}
