import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.PrintWriter;

public class PlayerFile {
	private static File f;
	private static String fileName;

	public PlayerFile(String file) {
		f = new File(file);
		fileName = file;
	}

	private static ArrayList readDiccionary(String file) {
 		/*leo listado de palabra=traduccion*/
        File f = new File(file);
 		BufferedReader reader;
 		ArrayList<String> dictionary = new ArrayList<String>();
 		try {
             reader = new BufferedReader(new FileReader(f));
             while(reader.ready()){
 				dictionary.add(reader.readLine().trim());
         	}
 		} catch (IOException e) {
             e.printStackTrace();
 		}
 		
 		return dictionary;
 	}
 	
	private static void writeQuery(ArrayList<String> list) {
        File f = new File(fileName);
        String[] translate;
        
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i=0;i<list.size();i++) {
                translate = list.get(i).split("=");
                pw.append("test");
            }
            pw.close();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();   
        }
    }
}
