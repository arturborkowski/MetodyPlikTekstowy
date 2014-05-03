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
	

// metoda licz�ca ilo�� wszystkich znak�w w pliku tekstowym	
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
				System.out.println("Plik zawiera "+i+" znak�w.");
			}
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	

// metoda licz�ca ilo�� wyst�pie� okre�lonego znaku w pliku tekstowym
	public static void ileDanychZnak�w(String nazwaPliku, char znak) throws IOException {
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
				System.out.println("Plik zawiera "+i+" znak�w '"+znak+"'.");
			}
			
		} finally {
			if (czytPlik != null) {
				czytPlik.close();
			}
		}
		
	}
	
	
// metoda oblicza ilo�� wystapie� w pliku tekstowym danej litery ignoruj�c przy tym jej wielko��
	public static void ileLiterIgnoreCase(String nazwaPliku, char litera) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int i = 0;
			int c;
			
			if(((int) litera < 65 || (int)litera > 90) && ((int)litera < 97 || (int)litera > 122)){
				System.out.println("'"+litera+"' nie jest liter�.");
			} 
			else {
				while((c = czytPlik.read()) != -1) {
					if((int)litera == c || ((int)litera - 32) == c || ((int)litera + 32) == c) i++;
				}
				
				System.out.println("Ilo�� liter '"+litera+"' (ma�ych i du�ych), kt�re wyst�puj� w pliku tekstowym to "+i+".");
			}
			
		} finally {
			if (czytPlik != null) {
				czytPlik.close();
			}
		}
	
	}
	
	
// metoda obliczaj�ca ilo�� wyst�pie� danej litery, bior�c przy tym pod uwag� jej wielko��
	public static void ileLiter(String nazwaPliku, char litera) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int i = 0;
			int c;
			
			if(((int) litera < 65 || (int)litera > 90) && ((int)litera < 97 || (int)litera > 122)){
				System.out.println("'"+litera+"' nie jest liter�.");
			} 
			else {
				while((c = czytPlik.read()) != -1) {
					if((int)litera == c) i++;
				}
				
				System.out.println("Ilo�� liter '"+litera+"', kt�re wyst�puj� w pliku tekstowym to "+i+".");
			}
			
		} finally {
			if (czytPlik != null) {
				czytPlik.close();
			}
		}
	
	}
	
	
// metoda obliczaj�ca ilo�� wyst�pie� wszystkich liter w tek�cie	
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
				System.out.println("Plik zawiera "+i+" liter�.");
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
	

// metoda oblicza ilo�� wyst�pie� ma�ych liter w pliku tekstowym
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
				System.out.println("Plik zawiera 1 ma�� liter�.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("plik zawiera "+i+" ma�e litery.");
			}
			else {
				System.out.println("Plik zawiera "+i+" ma�ych liter.");
			}
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
// metoda oblicza ilo�� wyst�pie� du�ych liter w pliku tekstowym	
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
				System.out.println("Plik zawiera 1 du�� liter�.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("plik zawiera "+i+" du�� litery.");
			}
			else {
				System.out.println("Plik zawiera "+i+" du�ych liter.");
			}
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
	
// metoda obliczaj�ca ilo�� wszystkich samog�osek w pliku tekstowym
	public static void ileSamoglosek(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			char[] samogloski = {'a','A','�','�', 'e','E','�','�','i','I','o','O','�','�','u','U','y','Y'};
			
			while((c = czytPlik.read()) != -1) {
				for(char x: samogloski) {
					if(c==x) {
						i++;
						break;
					};
				}				
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" samog�osk�.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("Plik zawiera "+i+" samog�oski.");
			}
			else
				System.out.println("Plik zawiera "+i+" samog�osek.");
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
	
// metoda obliczj�ca ilo�� sp�g�osek w pliku tekstowym	
	public static void ileSpolglosek(String nazwaPliku) throws IOException {
		File txt = new File(nazwaPliku);
		FileReader czytPlik = null;
		
		try {
			czytPlik = new FileReader(txt);
			int c;
			int i = 0;
			char[] spolgloski = {'b','c','�','d','f','g','h','j','k','l','�','m','n','�','p','q','r','s','�','t','v','w','x','z','�','�',
									'B','C','�','D','F','G','H','J','K','L','�','M','N','P','Q','R','S','�','T','V','W','X','Z','�','�'};
			
			while((c = czytPlik.read()) != -1) {
				for(char x: spolgloski) {
					if(x==c) {
						i++;
						break;
					};
				}				
			}
			
			if(i == 1) {
				System.out.println("Plik zawiera "+i+" sp�g�osk�.");
			}
			else if(i > 1 && i < 5) {
				System.out.println("Plik zawiera "+i+" sp�g�oski.");
			}
			else
				System.out.println("Plik zawiera "+i+" sp�g�osek.");
			
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
// metoda obliczaj�ca ilo�� cyfr wyst�puj�cych w pliku tekstowym
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
				System.out.println("Plik zawiera "+i+" cyfr�.");
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
	
	
// metoda obliczaj�ca ilo�� wyst�pie� znak�w alfanumerycznych	
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
				System.out.println("Plik zawiera "+i+" znak�w alfanumerycznych.");
			}
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
	// metoda obliczaj�ca ilo�� wyst�pie� znak�w niealfanumerycznych	
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
				System.out.println("Plik zawiera "+i+" znak�w niealfanumerycznych.");
			}
		} finally {
			if(czytPlik != null) {
				czytPlik.close();
			}
		}
	}
	
	
	
	// metoda obliczaj�ca ilo�� znak�w bia�ych wyst�puj�cych w pliku tekstowym
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
					System.out.println("Plik zawiera "+i+" znak bia�y.");
				}
				else if(i > 1 && i < 5) {
					System.out.println("Plik zawiera "+i+" znaki bia�e.");
				}
				else {
					System.out.println("Plik zawiera "+i+" znak�w bia�ych.");
				}
				
			} finally {
				if(czytPlik != null) {
					czytPlik.close();
				}
			}
		}
		
	
	
// metoda licz�ca ilo�� powt�rze� danego �a�cucha znak�w	
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
				System.out.println("Fraza \""+fraza+"\" zosta�a powt�rzona w tek�cie "+i+" raz.");
			}
			else {
				System.out.println("Fraza \""+fraza+"\" zosta�a powt�rzona w tek�cie "+i+" razy.");
			}
		} finally {
			if(odczytaj != null) {
				odczytaj.close();
			}
		}
	}
	
	
// metoda licz�ca ilo�� powt�rze� danego �a�cucha znak�w bez wzgl�du na wielko�� liter	
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
					System.out.println("Fraza \""+fraza+"\" zosta�a powt�rzona w tek�cie "+i+" raz.");
				}
				else {
					System.out.println("Fraza \""+fraza+"\" zosta�a powt�rzona w tek�cie "+i+" razy.");
				}
			} finally {
				if(odczytaj != null) {
					odczytaj.close();
				}
			}
		}
	
	

}
