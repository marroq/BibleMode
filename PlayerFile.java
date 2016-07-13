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
	public PlayerFile() {
	}

	public ArrayList readFilePlayer(String file) {
		/*LEO EL ARCHIVO Y LLENO LISTA CON ELEMENTOS DEL AFD*/
        File f = new File(file);
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

	public void writeFilePlayer(String file, String player, int coins) {
		File f = new File(file);
		FileWriter fileW = null;
		PrintWriter writer = null;
		try {
			if (f.createNewFile()) {
				f.setExecutable(true);
				f.setReadable(true);
				f.setWritable(true);
			} else {
				System.out.println("holaaaaa");
				fileW = new FileWriter(file);
				fileW.write("hola");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
