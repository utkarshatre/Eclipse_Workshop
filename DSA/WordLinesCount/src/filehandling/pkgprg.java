package filehandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class pkgprg {
public static void main(String[] args) throws Exception {
	String line;
	int wc=0, lc=0;
	FileReader f = new FileReader("text.txt");
	BufferedReader br = new BufferedReader(f);
	while((line = br.readLine())!=null) {
		String []arr = line.split(" ");
		wc+=arr.length;
		lc++;	
	}
	System.out.println(wc+" word count");
	System.out.println(lc+" line count");
	
	
	
}
}
