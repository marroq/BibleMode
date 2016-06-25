import java.util.Random;
import java.util.ArrayList;

public class LibroBiblia {
	private int escoger;
	private Random aleatorio = new Random();
	public static final String ABDIAS="ABDIAS";
	public static final String AMOS="AMOS";
	public static final String APOCALIPSIS="APOCALIPSIS";
	public static final String CANTARES="CANTARES";
	public static final String COLOSENES="COLOSENES";
	public static final String CORINTIOS1 = "1 CORINTIOS";
	public static final String CORINTIOS2 = "2 CORINTIOS";
	public static final String CRONICAS1 = "1 CRONICAS";
	public static final String CRONICAS2 = "2 CRONICAS";
	public static final String DANIEL = "DANIEL";
	public static final String DEUTERONOMIO = "DEUTERONOMIO";
	public static final String ECLESIASTES = "ECLESIASTES";
	public static final String EFESIOS = "EFESIOS";
	public static final String ESDRAS = "ESDRAS";
	public static final String ESTER = "ESTER";
	public static final String EXODO = "EXODO";
	public static final String EZEQUIEL = "EZEQUIEL";
	public static final String FILEMON = "FILEMON";
	public static final String FILIPENSES = "FILIPENSES";
	public static final String GALATAS = "GALATAS";
	public static final String GENESIS = "GENESIS";
	public static final String HABACUC = "HABACUC";
	public static final String HAGEO = "HAGEO";
	public static final String HEBREOS = "HEBREOS";
	public static final String HECHOS = "HECHOS";
	public static final String ISAIAS = "ISAIAS";
	public static final String JEREMIAS = "JEREMIAS";
	public static final String JOB = "JOB";
	public static final String JOEL ="JOEL";
	public static final String JONAS = "JONAS";
	public static final String JOSUE = "JOSUE";
	public static final String JUAN = "JUAN";
	public static final String JUAN1 = "1 JUAN";
	public static final String JUAN2 = "2 JUAN";
	public static final String JUAN3 = "3 JUAN";
	public static final String JUDAS = "JUDAS";
	public static final String JUECES = "JUECES";
	public static final String LAMENTACIONES = "LAMENTACIONES";
	public static final String LEVITICO = "LEVITICO";
	public static final String LUCAS = "LUCAS";
	public static final String MALAQUIAS = "MALAQUIAS";
	public static final String MARCOS = "MARCOS";
	public static final String MATEO = "MATEO";
	public static final String MIQUEAS = "MIQUEAS";
	public static final String NAHUM = "NAHUM";
	public static final String NEHEMIAS = "NEHEMIAS";
	public static final String NUMEROS = "NUMEROS";
	public static final String OSEAS = "OSEAS";
	public static final String PEDRO1 = "1 PEDRO";
	public static final String PEDRO2 = "2 PEDRO";
	public static final String PROVERBIOS = "PROVERBIOS";
	public static final String REYES1 = "1 REYES";
	public static final String REYES2 = "2 REYES";
	public static final String ROMANOS = "ROMANOS";
	public static final String RUT = "RUT";
	public static final String SALMOS = "SALMOS";
	public static final String SAMUEL1 = "1 SAMUEL";
	public static final String SAMUEL2 = "2 SAMUEL";
	public static final String SANTIAGO = "SANTIAGO";
	public static final String SOFONIAS = "SOFONIAS";
	public static final String TESA1 = "1 TESALONICENSES";
	public static final String TESA2 = "2 TESALONICENSES";
	public static final String TIMOTEO1 = "1 TIMOTEO";
	public static final String TIMOTEO2 = "2 TIMOTEO";
	public static final  String TITO = "TITO";
	public static final String ZACARIAS = "ZACARIAS";

	public LibroBiblia(){
	}

	public String azarBook() {
		String libro="";
		escoger = aleatorio.nextInt(65);
		switch (escoger) {
			case 0:  libro=GENESIS; 		break;
			case 1:  libro=EXODO; 			break;
			case 2:  libro=LEVITICO; 		break;
			case 3:  libro=NUMEROS; 		break;
			case 4:  libro=DEUTERONOMIO; 	break;
			case 5:  libro=JOSUE; 			break;
			case 6:  libro=JUECES; 			break;
			case 7:  libro=RUT; 			break;
			case 8:  libro=SAMUEL1; 		break;
			case 9:  libro=SAMUEL2; 		break;
			case 10: libro=REYES1; 			break;
			case 11: libro=REYES2; 			break;
			case 12: libro=CRONICAS1; 		break;
			case 13: libro=CRONICAS2; 		break;
			case 14: libro=ESDRAS; 			break;
			case 15: libro=NEHEMIAS; 		break;
			case 16: libro=ESTER; 			break;
			case 17: libro=JOB; 			break;
			case 18: libro=SALMOS; 			break;
			case 19: libro=PROVERBIOS; 		break;
			case 20: libro=ECLESIASTES; 	break;
			case 21: libro=CANTARES; 		break;
			case 22: libro=ISAIAS; 			break;
			case 23: libro=JEREMIAS; 		break;
			case 24: libro=LAMENTACIONES; 	break;
			case 25: libro=EZEQUIEL; 		break;
			case 26: libro=DANIEL; 			break;
			case 27: libro=OSEAS; 			break;
			case 28: libro=JOEL; 			break;
			case 29: libro=AMOS; 			break;
			case 30: libro=ABDIAS; 			break;
			case 31: libro=JONAS; 			break;
			case 32: libro=MIQUEAS; 		break;
			case 33: libro=NAHUM; 			break;
			case 34: libro=HABACUC; 		break;
			case 35: libro=SOFONIAS; 		break;
			case 36: libro=HAGEO; 			break;
			case 37: libro=ZACARIAS; 		break;
			case 38: libro=MALAQUIAS; 		break;
			case 39: libro=MATEO; 			break;
			case 40: libro=MARCOS; 			break;
			case 41: libro=LUCAS; 			break;
			case 42: libro=JUAN; 			break;
			case 43: libro=HECHOS; 			break;
			case 44: libro=ROMANOS; 		break;
			case 45: libro=CORINTIOS1; 		break;
			case 46: libro=CORINTIOS2; 		break;
			case 47: libro=GALATAS; 		break;
			case 48: libro=EFESIOS; 		break;
			case 49: libro=FILIPENSES; 		break;
			case 50: libro=COLOSENES; 		break;
			case 51: libro=TESA1; 			break;
			case 52: libro=TESA2; 			break;
			case 53: libro=TIMOTEO1; 		break;
			case 54: libro=TIMOTEO2; 		break;
			case 55: libro=TITO; 			break;
			case 56: libro=FILEMON; 		break;
			case 57: libro=HEBREOS; 		break;
			case 58: libro=SANTIAGO; 		break;
			case 59: libro=PEDRO1; 			break;
			case 60: libro=PEDRO2; 			break;
			case 61: libro=JUAN1; 			break;
			case 62: libro=JUAN2; 			break;
			case 63: libro=JUAN3; 			break;
			case 64: libro=JUDAS; 			break;
			case 65: libro=APOCALIPSIS;
		}

		return libro;
	}

	public String book(int numLibro) {
		String libro="";
		if (numLibro<0 && numLibro>66) {
			return "";
		}

		switch (numLibro) {
			case 1:  libro=GENESIS; 		break;
			case 2:  libro=EXODO; 			break;
			case 3:  libro=LEVITICO; 		break;
			case 4:  libro=NUMEROS; 		break;
			case 5:  libro=DEUTERONOMIO; 	break;
			case 6:  libro=JOSUE; 			break;
			case 7:  libro=JUECES; 			break;
			case 8:  libro=RUT; 			break;
			case 9:  libro=SAMUEL1; 		break;
			case 10:  libro=SAMUEL2; 		break;
			case 11: libro=REYES1; 			break;
			case 12: libro=REYES2; 			break;
			case 13: libro=CRONICAS1; 		break;
			case 14: libro=CRONICAS2; 		break;
			case 15: libro=ESDRAS; 			break;
			case 16: libro=NEHEMIAS; 		break;
			case 17: libro=ESTER; 			break;
			case 18: libro=JOB; 			break;
			case 19: libro=SALMOS; 			break;
			case 20: libro=PROVERBIOS; 		break;
			case 21: libro=ECLESIASTES; 	break;
			case 22: libro=CANTARES; 		break;
			case 23: libro=ISAIAS; 			break;
			case 24: libro=JEREMIAS; 		break;
			case 25: libro=LAMENTACIONES; 	break;
			case 26: libro=EZEQUIEL; 		break;
			case 27: libro=DANIEL; 			break;
			case 28: libro=OSEAS; 			break;
			case 29: libro=JOEL; 			break;
			case 30: libro=AMOS; 			break;
			case 31: libro=ABDIAS; 			break;
			case 32: libro=JONAS; 			break;
			case 33: libro=MIQUEAS; 		break;
			case 34: libro=NAHUM; 			break;
			case 35: libro=HABACUC; 		break;
			case 36: libro=SOFONIAS; 		break;
			case 37: libro=HAGEO; 			break;
			case 38: libro=ZACARIAS; 		break;
			case 39: libro=MALAQUIAS; 		break;
			case 40: libro=MATEO; 			break;
			case 41: libro=MARCOS; 			break;
			case 42: libro=LUCAS; 			break;
			case 43: libro=JUAN; 			break;
			case 44: libro=HECHOS; 			break;
			case 45: libro=ROMANOS; 		break;
			case 46: libro=CORINTIOS1; 		break;
			case 47: libro=CORINTIOS2; 		break;
			case 48: libro=GALATAS; 		break;
			case 49: libro=EFESIOS; 		break;
			case 50: libro=FILIPENSES; 		break;
			case 51: libro=COLOSENES; 		break;
			case 52: libro=TESA1; 			break;
			case 53: libro=TESA2; 			break;
			case 54: libro=TIMOTEO1; 		break;
			case 55: libro=TIMOTEO2; 		break;
			case 56: libro=TITO; 			break;
			case 57: libro=FILEMON; 		break;
			case 58: libro=HEBREOS; 		break;
			case 59: libro=SANTIAGO; 		break;
			case 60: libro=PEDRO1; 			break;
			case 61: libro=PEDRO2; 			break;
			case 62: libro=JUAN1; 			break;
			case 63: libro=JUAN2; 			break;
			case 64: libro=JUAN3; 			break;
			case 65: libro=JUDAS; 			break;
			case 66: libro=APOCALIPSIS;		break;
		}
		return libro;
	}

	public ArrayList bookList() {
		ArrayList<String> listBible = new ArrayList<String>();
		for(int i=1;i<=66;i++) {
			listBible.add((book(i)));
		}
		return listBible;
	}
}
