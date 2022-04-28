package mono;

public class Caesar {
	
	public static String klar = "";
	public static String geheim = "MHILYLZAZBHLXBPZXBLMVYABUHLHWWPBZJSHBKPBZJHLJBZKPJABTHYJHUBTLZAULBAYVU";

	public static int key = 0;
	
	public static String verschluesseln() {
		klar.toUpperCase();
		for(int i=0; i<klar.length(); i++) {
			char c = klar.charAt(i);
			c += key;
			if(c  > 90) {
				c -= 26;
			}
			geheim += c;			
		}
		return geheim;
	}
	
	public static String entschluesseln() {
		klar = "";
		geheim.toUpperCase();
		for(int i=0; i<geheim.length(); i++) {
			char c = geheim.charAt(i);
			c -= key;
			if(c  < 65) {
				c += 26;
			}
			klar += c;			
		}
		return klar;
	}
	
	public static void keyFinden() {
		for(key=0; key<26; key++) {
			System.out.print("key: " + key + " ");
			System.out.println(entschluesseln());

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(verschluesseln());
		System.out.println("geheim: " + geheim);
		System.out.println(entschluesseln());
		System.out.println("klar: " + klar);*/
		keyFinden();
		key = 7;
		System.out.println( "KLAR: " + entschluesseln());
	}

}
