import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetLib {

	private MetLib() {
	}
	
	
	
	/*************  METODY ***************/
	

// metoda licz¹ca iloœæ wszystkich znaków w pliku tekstowym	
	public static void ileZnakow(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			
			while((c = czytPlik.read()) != -1) {
				i++;
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" znak.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("Plik zawiera "+i+" znaki.");
			}
			else {
				System.out.println("Plik zawiera "+i+" znaków.");
			}
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	

// metoda licz¹ca iloœæ wyst¹pieñ okreœlonego znaku w pliku tekstowym
	public static void ileDanychZnaków(String nazwaPliku, char znak) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int i = 0;
			int c;
			
			while((c = czytPlik.read()) != -1) {
				if ((int)znak == c) i++;
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" znak '"+znak+"'.");
			}
			else if(i > i && i < 5) {
				System.out.println("Plik zawiera "+i+" znaki '"+znak+"'.");
			}
			else {
				System.out.println("Plik zawiera "+i+" znaków '"+znak+"'.");
			}
			
		} finally {
			if (czytPlik != null) {
				czytPlik.close();
			}
		}
		
	}
	
	
// metoda oblicza iloœæ wystapieñ w pliku tekstowym danej litery ignoruj¹c przy tym jej wielkoœæ
	public static void ileLiterIgnoreCase(String nazwaPliku, char litera) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int i = 0;
			int c;
			
			if(((int) litera < 65 || (int)litera > 90) && ((int)litera < 97 || (int)litera > 122)){
				System.out.println("'"+litera+"' nie jest liter¹.");
			} 
			else {
				while((c = czytPlik.read()) != -1) {
					if((int)litera == c || ((int)litera - 32) == c || ((int)litera + 32) == c) i++;
				}
				
				System.out.println("Iloœæ liter '"+litera+"' (ma³ych i du¿ych), które wystêpuj¹ w pliku tekstowym to "+i+".");
			}
			
		} finally {
			if (czytPlik != null) {
				czytPlik.close();
			}
		}
	
	}
	
	
// metoda obliczaj¹ca iloœæ wyst¹pieñ danej litery, bior¹c przy tym pod uwagê jej wielkoœæ
	public static void ileLiter(String nazwaPliku, char litera) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int i = 0;
			int c;
			
			if(((int) litera < 65 || (int)litera > 90) && ((int)litera < 97 || (int)litera > 122)){
				System.out.println("'"+litera+"' nie jest liter¹.");
			} 
			else {
				while((c = czytPlik.read()) != -1) {
					if((int)litera == c) i++;
				}
				
				System.out.println("Iloœæ liter '"+litera+"', które wystêpuj¹ w pliku tekstowym to "+i+".");
			}
			
		} finally {
			if (czytPlik != null) {
				czytPlik.close();
			}
		}
	
	}
	
	
// metoda obliczaj¹ca iloœæ wyst¹pieñ wszystkich liter w tekœcie	
	public static void ileWszystkichLiter(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			
			while((c = czytPlik.read()) != -1) {
				if(!(( c < 65 || c > 90) && (c < 97 || c > 122))) i++;
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" literê.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("Plik zawiera "+i+" litery.");
			}
			else {
				System.out.println("Plik zawiera "+i+" liter.");
			}
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	

// metoda oblicza iloœæ wyst¹pieñ ma³ych liter w pliku tekstowym
	public static void ileMalychLiter(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			
			while((c=czytPlik.read()) != -1) {
				if(c >= 97 && c <= 122) i++;
			}
			
			if(i==1) {
				System.out.println("Plik zawiera 1 ma³¹ literê.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("plik zawiera "+i+" ma³e litery.");
			}
			else {
				System.out.println("Plik zawiera "+i+" ma³ych liter.");
			}
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
// metoda oblicza iloœæ wyst¹pieñ du¿ych liter w pliku tekstowym	
	public static void ileDuzychLiter(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			
			while((c=czytPlik.read()) != -1) {
				if(c >= 65 && c <= 90) i++;
			}
			
			if(i==1) {
				System.out.println("Plik zawiera 1 du¿¹ literê.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("plik zawiera "+i+" du¿¹ litery.");
			}
			else {
				System.out.println("Plik zawiera "+i+" du¿ych liter.");
			}
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
	
// metoda obliczaj¹ca iloœæ wszystkich samog³osek w pliku tekstowym
	public static void ileSamoglosek(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			char[] samogloski = {'a','A','¹','¥', 'e','E','ê','Ê','i','I','o','O','ó','Ó','u','U','y','Y'};
			
			while((c = czytPlik.read()) != -1) {
				for(char x: samogloski) {
					if(c==x) {
						i++;
						break;
					};
				}				
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" samog³oskê.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("Plik zawiera "+i+" samog³oski.");
			}
			else
				System.out.println("Plik zawiera "+i+" samog³osek.");
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
	
// metoda obliczj¹ca iloœæ spó³g³osek w pliku tekstowym	
	public static void ileSpolglosek(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			char[] spolgloski = {'b','c','æ','d','f','g','h','j','k','l','³','m','n','ñ','p','q','r','s','œ','t','v','w','x','z','¿','Ÿ',
									'B','C','Æ','D','F','G','H','J','K','L','£','M','N','P','Q','R','S','Œ','T','V','W','X','Z','¯',''};
			
			while((c = czytPlik.read()) != -1) {
				for(char x: spolgloski) {
					if(x==c) {
						i++;
						break;
					};
				}				
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" spó³g³oskê.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("Plik zawiera "+i+" spó³g³oski.");
			}
			else
				System.out.println("Plik zawiera "+i+" spó³g³osek.");
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
// metoda obliczaj¹ca iloœæ cyfr wystêpuj¹cych w pliku tekstowym
	public static void ileCyfr(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			char[] cyfry = {'0','1','2','3','4','5','6','7','8','9'};
			
			while((c = czytPlik.read()) != -1) {
				for(char x: cyfry) {
					if(x==c) {
						i++;
						break;
					};
				}				
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" cyfrê.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("Plik zawiera "+i+" cyfry.");
			}
			else {
				System.out.println("Plik zawiera "+i+" cyfr.");
			}
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
// metoda obliczaj¹ca iloœæ wyst¹pieñ znaków alfanumerycznych	
	public static void ileZnakowAlfanum(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			
			while((c = czytPlik.read()) != -1) {
				if(!(( c < 65 || c > 90) && (c < 97 || c > 122) && (c < 48 || c > 57))) i++;
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" znak alfanumeryczny.");
			}
			else if (i > 1 && i < 5) {
				System.out.println("Plik zawiera "+i+" znaki alfanumeryczne.");
			}
			else {
				System.out.println("Plik zawiera "+i+" znaków alfanumerycznych.");
			}
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
	// metoda obliczaj¹ca iloœæ wyst¹pieñ znaków niealfanumerycznych	
	public static void ileZnakowNieAlfanum(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			
			while((c = czytPlik.read()) != -1) {
				if((( c < 65 || c > 90) && (c < 97 || c > 122) && (c < 48 || c > 57))) i++;
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" znak niealfanumeryczny.");
			}
			else if (i > 1 && i < 5) {
				System.out.println("Plik zawiera "+i+" znaki niealfanumeryczne.");
			}
			else {
				System.out.println("Plik zawiera "+i+" znaków niealfanumerycznych.");
			}
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
	
	// metoda obliczaj¹ca iloœæ znaków bia³ych wystêpuj¹cych w pliku tekstowym
		public static void ileZnakowBialych(String nazwaPliku) throws IOException {
			File txt = new File(nazwaPliku);
			FileReader czytPlik = null;
			
			try {
				czytPlik = new FileReader(txt);
				int c;
				int i = 0;
				char[] znaki = {' ','\t','\n'};
				
				while((c = czytPlik.read()) != -1) {
					for(char x: znaki) {
						if(x==c) {
							i++;
							break;
						};
					}				
				}
				
				if(i == 1) {
					System.out.println("Plik zawiera "+i+" znak bia³y.");
				}
				else if(i > 1 && i < 5) {
					System.out.println("Plik zawiera "+i+" znaki bia³e.");
				}
				else {
					System.out.println("Plik zawiera "+i+" znaków bia³ych.");
				}
				
			} finally {
				if(czytPlik != null) {
					czytPlik.close();
				}
			}
		}
		
	
	
// metoda licz¹ca iloœæ powtórzeñ danego ³añcucha znaków	
	public static void ileFraz(String nazwaPliku, String fraza) throws IOException {
		File txt = new File(nazwaPliku);
		BufferedReader odczytaj = null;
		
		try {
			int i = 0;
			odczytaj = new BufferedReader(new FileReader(txt));
			String linia = "";
			
			while((linia = odczytaj.readLine()) != null) {
				Matcher m = Pattern.compile(fraza).matcher(linia);
				while (m.find()) {
					i++;
				}
			}
			
			if(i == 1) {
				System.out.println("Fraza \""+fraza+"\" zosta³a powtórzona w tekœcie "+i+" raz.");
			}
			else {
				System.out.println("Fraza \""+fraza+"\" zosta³a powtórzona w tekœcie "+i+" razy.");
			}
		} finally {
			if(odczytaj != null) {
				odczytaj.close();
			}
		}
	}
	
	
// metoda licz¹ca iloœæ powtórzeñ danego ³añcucha znaków bez wzglêdu na wielkoœæ liter	
		public static void ileFrazIgnoreCase(String nazwaPliku, String fraza) throws IOException {
			File txt = new File(nazwaPliku);
			BufferedReader odczytaj = null;
			
			try {
				int i = 0;
				odczytaj = new BufferedReader(new FileReader(txt));
				String linia = "";
				
				while((linia = odczytaj.readLine()) != null) {
					Matcher m = Pattern.compile(fraza.toLowerCase()).matcher(linia.toLowerCase());
					while (m.find()) {
						i++;
					}
				}
				
				if(i == 1) {
					System.out.println("Fraza \""+fraza+"\" zosta³a powtórzona w tekœcie "+i+" raz.");
				}
				else {
					System.out.println("Fraza \""+fraza+"\" zosta³a powtórzona w tekœcie "+i+" razy.");
				}
			} finally {
				if(odczytaj != null) {
					odczytaj.close();
				}
			}
		}
	
	

}
