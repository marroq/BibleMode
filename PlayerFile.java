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
	private File f;
	private String fileName;

	public PlayerFile(String file) {
		f = new File(file);
		fileName = file;
	}

	public ArrayList readFilePlayer() {
		/*LEO EL ARCHIVO Y LLENO LISTA CON ELEMENTOS DEL AFD*/
		BufferedReader reader;
		ArrayList<String> players = new ArrayList<String>();
		try {
            reader = new BufferedReader(new FileReader(f));
            while(reader.ready()){
				players.add(reader.readLine());
        	}
		} catch (IOException e) {
            e.printStackTrace();
		}
		
		return players;
	}

	public void writeFilePlayer(String file) {
		FileWriter fileW = null;
		PrintWriter writer = null;
		BufferedWriter bw = null;
		File f = new File(file);
		try {
			if (f.createNewFile()) {
				f.setExecutable(true);
				f.setReadable(true);
				f.setWritable(true);
			} else {
				bw = new BufferedWriter(new FileWriter(fileName));
				for (int x=0;x<10;x++)
   					bw.write("Fila numero " + x + "\n");
				System.out.println("holaaaaa");
				fileW = new FileWriter(f);
				fileW.write("hola");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
