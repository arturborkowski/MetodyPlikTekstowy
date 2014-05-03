import java.io.IOException;



public class Tester {

	public static void main(String[] args) throws IOException {
		
		MetLib.ileZnakow("pliczek.txt");
		MetLib.ileDanychZnaków("pliczek.txt", 'd');
		MetLib.ileLiterIgnoreCase("pliczek.txt", 'D');
		MetLib.ileLiter("pliczek.txt", 'd');
		MetLib.ileLiter("pliczek.txt", 'D');
		MetLib.ileWszystkichLiter("pliczek.txt");
		MetLib.ileMalychLiter("pliczek.txt");
		MetLib.ileDuzychLiter("pliczek.txt");
		MetLib.ileSamoglosek("pliczek.txt");
		MetLib.ileSpolglosek("pliczek.txt");
		MetLib.ileCyfr("pliczek.txt");
		MetLib.ileZnakowAlfanum("pliczek.txt");
		MetLib.ileZnakowNieAlfanum("pliczek.txt");
		MetLib.ileZnakowBialych("pliczek.txt");
		MetLib.ileFraz("pliczek.txt", "ola");
		MetLib.ileFrazIgnoreCase("pliczek.txt", "ola");
		
		
		
	}

}
