package meyerCipher2;

public class Test {
	public static void main(String[]args) {
		try {
			SubstitutionCipher s1 = new SubstitutionCipher("qwertzuiopüyxcvbnmasdfghjklöäß");
			
			String text = s1.encrypt("Hello World! 123");
			System.out.println(text);
			System.out.println(s1.decrypt(text));
		}catch(ExceptionsMeyer e) {
			System.out.println(e.toString());
		}
	}
}
