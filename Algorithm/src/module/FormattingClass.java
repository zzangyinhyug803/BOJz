package module;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FormattingClass {
	public static final String LINE_SEPARATOR = System.lineSeparator();
	public static void main(String[] agrs) {
		File xml_file = new File("./resource_xml/NABIC1_origin.xml");
		processXML(xml_file);
	}
	
	public static void processXML(File file) {
		
		String register_id = "";
		String temp_id = "";
		
		String file_name = "";
		String temp_fn="";
//		String[] names = null;
		
		StringTokenizer st;
		
		int cnt = 0;
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				++cnt;
				if((cnt - 22)%69 == 0) { // file_name
					st = new StringTokenizer(line);
					
					while(st.hasMoreTokens()) {
						temp_fn = st.nextToken();
						
						if(temp_fn.contains("file_name=\"")) {
							file_name = temp_fn.replace("file_name=", "");
						}
						
						line = line.replace("file_name=", "");
						line = line.replace(file_name, "");
						
						file_name = file_name.replaceAll("\"", "");	
					}
				}
				
				if((cnt - 3)%69 == 0 ) { // data_registation_id
					st = new StringTokenizer(line);
					
					while(st.hasMoreTokens()) {
						temp_id = st.nextToken();
						
						if(temp_id.contains("data_registration_id=\"")) {
							register_id = temp_id.replace("data_registration_id=", "");
						}
					}
				}
				
				System.out.println(line);
				
				if( (cnt - 33)%69 == 0 ) { // after </raw_data> 
					System.out.println("<register_file>");
					
					String[] names = file_name.split(",");
					
					for(String name : names) 
						System.out.printf("<file id=%s name=\"%s\" path=\"%s\"/>\n",register_id,name,name);
					
					System.out.println("</register_file>");
				}
			}
			
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
