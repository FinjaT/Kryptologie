package poly;

public class Vigenere {

	public static char shift(char c, int k) {
		return (char) ((( c - 65 + k ) % 26 ) + 65 );
	}
	
	/*public static String caesar(String arg, int key) {
		String res = "";
		for(int i=0; i<arg.length(); i++) {
			char c = arg.charAt(i);
			res += shift(c, key);
		}
		return res;
	}*/
	
	public static String vigenere(String arg, String keyword) {
		String res = "";
		
		for(int i=0; i<arg.length(); i++) {
			char c = arg.charAt(i);
			res += shift(c, (keyword.charAt(i % keyword.length()) - 65 )  );

			// keyword = BRUTUS

			// c = arg.charAt(i);
			// res += shift(c, 'B'-65);
			
			// c = arg.charAt(i);
			// res += shift(c, 'R'-65); 

			// c = arg.charAt(i);
			// res += shift(c, 'U'-65); 
		
		}
		
		return res;
	}
	
	public static String vigenereDecode(String arg, String keyword) {
		String res = "";
		
		
		for(int i=0; i<arg.length(); i++) {
			char c = arg.charAt(i);
			res += shift(c, 26 - (keyword.charAt(i % keyword.length()) - 65 )  );	
		}
		
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String plain = "VENIVIDIVICI";

		String cipher = vigenere(plain, "BRUTUS");
		System.out.println( cipher );
		
		String cipherDecode = vigenereDecode(cipher, "BRUTUS");
		System.out.println( cipherDecode );
		
		//System.out.println( caesar( cipher, 23 ) );
	}

}
