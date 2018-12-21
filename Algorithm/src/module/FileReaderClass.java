package module;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderClass { 
	
	public static final String LINE_SEPARATOR = System.lineSeparator();
	
	public static void main(String[] args) {

		File path = new File("./resource_xml/");
		File[] list = path.listFiles();
		
		File txtPath = new File("C:\\Users\\kobic\\Desktop\\업무\\nabic\\NABIC_XML.txt");
		
		for(File file : list) {
			XmlReader(file, txtPath);
		}
		
	}
	
	
	public static void XmlReader(File input, File output) {
		int cnt = 0;
		
		try {
			FileReader fr = new FileReader(input);
			BufferedReader bufr = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(new FileWriter(output));
			String line ="";
			
			System.out.println("\t<project_set>");
			bw.write("\t<project_set>" + LINE_SEPARATOR);
			
			while((line = bufr.readLine()) != null) {
				++cnt;

				if(cnt >= 120 && cnt <= 185) {
					System.out.println(line);
					bw.write(line + LINE_SEPARATOR);
				}
			}
			
			System.out.println("\t</project_set>\n");
			bw.write("\t</project_set>" + LINE_SEPARATOR);
			
			fr.close();
			bufr.close();
			bw.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
