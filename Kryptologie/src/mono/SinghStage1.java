package mono;

import java.util.Arrays;

public class SinghStage1 {
									//"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	public static String decryptKey = "ciovyblkftqmadzhpsjnurgewx";

	public static String cipher =   "BT JPX RMLX PCUV AMLX ICVJP IBTWXVR CI M LMT'R PMTN, "
									+ "MTN YVCJX CDXV MWMBTRJ JPX AMTNGXRJBAH UQCT JPX "
									+ "QGMRJXV CI JPX YMGG CI JPX HBTW'R QMGMAX; MTN JPX "
									+ "HBTW RMY JPX QMVJ CI JPX PMTN JPMJ YVCJX. JPXT JPX "
									+ "HBTW'R ACUTJXTMTAX YMR APMTWXN, MTN PBR JPCUWPJR "
									+ "JVCUFGXN PBL, RC JPMJ JPX SCBTJR CI PBR GCBTR YXVX "
									+ "GCCRXN, MTN PBR HTXXR RLCJX CTX MWMBTRJ MTCJPXV. "
									+ "JPX HBTW AVBXN MGCUN JC FVBTW BT JPX MRJVCGCWXVR, "
									+ "JPX APMGNXMTR, MTN JPX RCCJPRMEXVR. MTN JPX HBTW "
									+ "RQMHX, MTN RMBN JC JPX YBRX LXT CI FMFEGCT, YPCRCXDXV "
									+ "RPMGG VXMN JPBR YVBJBTW, MTN RPCY LX JPX BTJXVQVXJMJBCT "
									+ "JPXVXCI, RPMGG FX AGCJPXN YBJP RAMVGXJ, MTN PMDX M "
									+ "APMBT CI WCGN MFCUJ PBR TXAH, MTN RPMGG FX JPX JPBVN "
									+ "VUGXV BT JPX HBTWNCL. JPXT AMLX BT MGG JPX HBTW'R YBRX "
									+ "LXT; FUJ JPXE ACUGN TCJ VXMN JPX YVBJBTW, TCV LMHX "
									+ "HTCYT JC JPX HBTW JPX BTJXVQVXJMJBCT JPXVXCI. JPXT YMR "
									+ "HBTW FXGRPMOOMV WVXMJGE JVCUFGXN, MTN PBR ACUTJXTMTAX "
									+ "YMR APMTWXN BT PBL, MTN PBR GCVNR YXVX MRJCTBRPXN. TCY "
									+ "JPX KUXXT, FE VXMRCT CI JPX YCVNR CI JPX HBTW MTN PBR "
									+ "GCVNR, AMLX BTJC JPX FMTKUXJ PCURX; MTN JPX KUXXT RQMHX "
									+ "MTN RMBN, C HBTW, GBDX ICVXDXV; GXJ TCJ JPE JPCUWPJR "
									+ "JVCUFGX JPXX, TCV GXJ JPE ACUTJXTMTAX FX APMTWXN; JPXVX "
									+ "BR M LMT BT JPE HBTWNCL, BT YPCL BR JPX RQBVBJ CI JPX "
									+ "PCGE WCNR; MTN BT JPX LAMER CI JPE IMJPXV GBWPJ MTN "
									+ "UTNXVRJMTNBTW MTN YBRNCL, GBHX JPX YBRNCL CI JPX WCNR, "
									+ "YMR ICUTN BT PBL; YPCL JPX HBTW TXFUAPMNTXOOMV JPE IMJPXV, "
									+ "JPX HBTW, B RME, JPE IMJPXV, LMNX LMRJXV CI JPX LMWBABMTR, "
									+ "MRJVCGCWXVR, APMGNXMTR, MTN RCCJPRMEXVR; ICVMRLUAP MR MT "
									+ "XZAXGGXTJ RQBVBJ, MTN HTCYGXNWX, MTN UTNXVRJMTNBTW, "
									+ "BTJXVQVXJBTW CI NVXMLR, MTN RPCYBTW CI PMVN RXTJXTAXR, "
									+ "MTN NBRRCGDBTW CI NCUFJR, YXVX ICUTN BT JPX RMLX NMTBXG, "
									+ "YPCL JPX HBTW TMLXN FXGJXRPMOOMV; TCY GXJ NMTBXG FX AMGGXN, "
									+ "MTN PX YBGG RPCY JPX BTJXVQVXJMJBCT. JPX IBVRJ ACNXYCVN BR "
									+ "CJPXGGC.";

	public static int[] absFreqs(String s) {
		int[] array = new int[40];
		int anzahl;
		int platz = 0;
		String schonGezählt = "";
		
		for(int i=0; i<s.length(); i++) {
			if(!schonGezählt.contains(s.charAt(i)+"")){
				schonGezählt += s.charAt(i);
				anzahl = 0;
				for(int j=i; j<s.length(); j++) {
					if(s.charAt(j) == s.charAt(i)) {
						anzahl++;
					}
				}
				array[platz] = anzahl;
				platz++;
			}
			
		}
		char[] arrayZeichen = new char[40];
		int x = 0;
		for(int k=0; k<schonGezählt.length(); k++) {
			arrayZeichen[x] = schonGezählt.charAt(k);
			x++;
		}
		System.out.println(schonGezählt);
		System.out.println(Arrays.toString(arrayZeichen));
		return array;
	}
	
	public static char decryptOneChar(char c){
		 if (c == 'A'){
			 return 'C';
		 }
		 else if (c == 'B'){
			 return 'I';
		 }
		 else if (c == 'C'){
			 return 'O';
		 }
		 else if (c == 'D'){
			 return 'V';
		 }
		 else if (c == 'E'){
			 return 'Y';
		 }
		 else if (c == 'F'){
			 return 'B';
		 }
		 else if (c == 'G'){
			 return 'L';
		 }
		 else if (c == 'H'){
			 return 'K';
		 }
		 else if (c == 'I'){
			 return 'F';
		 }
		 else if (c == 'J'){
			 return 'T';
		 }
		 else if (c == 'K'){
			 return 'Q';
		 }
		 else if (c == 'L'){
			 return 'M';
		 }
		 else if (c == 'M'){
			 return 'A';
		 }
		 else if (c == 'N'){
			 return 'D';
		 }
		 else if (c == 'O'){
			 return 'Z';
		 }
		 else if (c == 'P'){
			 return 'H';
		 }
		 else if (c == 'Q'){
			 return 'P';
		 }
		 else if (c == 'R'){
			 return 'S';
		 }
		 else if (c == 'S'){
			 return 'J';
		 }
		 else if (c == 'T'){
			 return 'N';
		 }
		 else if (c == 'U'){
			 return 'U';
		 }
		 else if (c == 'V'){
			 return 'R';
		 }
		 else if (c == 'W'){
			 return 'G';
		 }
		 else if (c == 'X'){
			 return 'E';
		 }
		 else if (c == 'Y'){
			 return 'W';
		 }
		 else if (c == 'Z'){
			 return 'X';
		 }
		 else{
		 // Keine Änderung des Zeichens
			 return c;
		 }
	}
	
	public static void main(String[] args) {//Main
		/*int [] f = absFreqs(cipher);
		System.out.println(Arrays.toString(f));
		String plain = "";
		for(int i=0; i<cipher.length(); i++){
			char c = cipher.charAt(i);
			if( Character.isLetter(c)){
				plain += decryptKey.charAt(c-65);
			}else{
				plain += c;
			}
		}
		System.out.println(plain);
		*/
		
		
		
		int [] f = absFreqs(cipher);
		System.out.println(Arrays.toString(f));
		System.out.println(cipher.length());
		System.out.println(cipher);

		for(int i=0; i<cipher.length(); i++) {
			System.out.print(decryptOneChar(cipher.charAt(i)));
			if (cipher.charAt(i) == '.' || cipher.charAt(i) == ';' || cipher.charAt(i) == ','){ //Zeilenumbrüche
				 System.out.println("");
			}
		}
		/*String abc = "IN THE SAME HOUR CAME FORTH FINGERS OF A MAN'S HAND, AND WROTE OVER AGAINST THE CANDLESTICK UPON THE PLASTER OF THE WALL OF THE KING'S PALACE; AND THE KING SAW THE PART OF THE HAND THAT WROTE. THEN THE KING'S COUNTENANCE WAS CHANGED, AND HIS THOUGHTS TROUBLED HIM, SO THAT THE JOINTS OF HIS LOINS WERE LOOSED, AND HIS KNEES SMOTE ONE AGAINST ANOTHER. THE KING CRIED ALOUD TO BRING IN THE ASTROLOGERS, THE CHALDEANS, AND THE SOOTHSAYERS. AND THE KING SPAKE, AND SAID TO THE WISE MEN OF BABYLON, WHOSOEVER SHALL READ THIS WRITING, AND SHOW ME THE INTERPRETATION THEREOF, SHALL BE CLOTHED WITH SCARLET, AND HAVE A CHAIN OF GOLD ABOUT HIS NECK, AND SHALL BE THE THIRD RULER IN THE KINGDOM. THEN CAME IN ALL THE KING'S WISE MEN; BUT THEY COULD NOT READ THE WRITING, NOR MAKE KNOWN TO THE KING THE INTERPRETATION THEREOF. THEN WAS KING BELSHAZZAR GREATLY TROUBLED, AND HIS COUNTENANCE WAS CHANGED IN HIM, AND HIS LORDS WERE ASTONISHED. NOW THE QUEEN, BY REASON OF THE WORDS OF THE KING AND HIS LORDS, CAME INTO THE BANQUET HOUSE; AND THE QUEEN SPAKE AND SAID, O KING, LIVE FOREVER; LET NOT THY THOUGHTS TROUBLE THEE, NOR LET THY COUNTENANCE BE CHANGED; THERE IS A MAN IN THY KINGDOM, IN WHOM IS THE SPIRIT OF THE HOLY GODS; AND IN THE MCAYS OF THY FATHER LIGHT AND UNDERSTANDING AND WISDOM, LIKE THE WISDOM OF THE GODS, WAS FOUND IN HIM; WHOM THE KING NEBUCHADNEZZAR THY FATHER, THE KING, I SAY, THY FATHER, MADE MASTER OF THE MAGICIANS, ASTROLOGERS, CHALDEANS, AND SOOTHSAYERS; FORASMUCH AS AN EXCELLENT SPIRIT, AND KNOWLEDGE, AND UNDERSTANDING, INTERPRETING OF DREAMS, AND SHOWING OF HARD SENTENCES, AND DISSOLVING OF DOUBTS, WERE FOUND IN THE SAME DANIEL, WHOM THE KING NAMED BELTESHAZZAR; NOW LET DANIEL BE CALLED, AND HE WILL SHOW THE INTERPRETATION. THE FIRST CODEWORD IS OTHELLO.";
		for(int i=0; i<1780; i++) {
			if(abc.charAt(i) =='Q') {
				System.out.println("JA");
			}
		}//Test auf vergessene Buchstaben*/
	}

}