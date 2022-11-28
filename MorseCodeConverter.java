import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeConverter {
	public static MorseCodeTree morseTree = new MorseCodeTree();
	
	public MorseCodeConverter() {
		//morseTree = new MorseCodeTree();
	}
	
	public static String printTree(){
		ArrayList<String> str = morseTree.toArrayList();
		String toPrint = "";
		for(String ch : str) {
			toPrint += ch + " ";
			System.out.println(ch);
		}
		return toPrint.trim();
	}
	
	public static String convertToEnglish(String code){
		String[] str = code.split(" ");
		String eng = "";
		for(String ch : str) {
			if(ch.equals("/")) {
				eng += " ";
			}
			else {
				eng += morseTree.fetch(ch);
			}
		}
		return eng;
	}
	
	public static String convertToEnglish(File codeFile) throws FileNotFoundException{
		Scanner myScanner = new Scanner(codeFile);
		String code = myScanner.nextLine();
		return convertToEnglish(code);
	}
}
