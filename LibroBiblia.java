import java.util.Random;

public class LibroBiblia {
		private int escoger;
		private Random aleatorio = new Random();
		public String ABDIAS="ABDIAS";
		public String AMOS="AMOS";
		public String APOCALIPSIS="APOCALIPSIS";
		public String CANTARES="CANTARES";
		public String COLOSENES="COLOSENES";
		public String CORINTIOS1 = "1 CORINTIOS";
		public String CORINTIOS2 = "2 CORINTIOS";
		public String CRONICAS1 = "1 CRONICAS";
		public String CRONICAS2 = "2 CRONICAS";
		public String DANIEL = "DANIEL";
		public String DEUTERONOMIO = "DEUTERONOMIO";
		public String ECLESIASTES = "ECLESIASTES";
		public String EFESIOS = "EFESIOS";
		public String ESDRAS = "ESDRAS";
		public String ESTER = "ESTER";
		public String EXODO = "EXODO";
		public String EZEQUIEL = "EZEQUIEL";
		public String FILEMON = "FILEMON";
		public String FILIPENSES = "FILIPENSES";
		public String GALATAS = "GALATAS";
		public String GENESIS = "GENESIS";
		public String HABACUC = "HABACUC";
		public String HAGEO = "HAGEO";
		public String HEBREOS = "HEBREOS";
		public String HECHOS = "HECHOS";
		public String ISAIAS = "ISAIAS";
		public String JEREMIAS = "JEREMIAS";
		public String JOB = "JOB";
		public String JOEL ="JOEL";
		public String JONAS = "JONAS";
		public String JOSUE = "JOSUE";
		public String JUAN = "JUAN";
		public String JUAN1 = "1 JUAN";
		public String JUAN2 = "2 JUAN";
		public String JUAN3 = "3 JUAN";
		public String JUDAS = "JUDAS";
		public String JUECES = "JUECES";
		public String LAMENTACIONES = "LAMENTACIONES";
		public String LEVITICO = "LEVITICO";
		public String LUCAS = "LUCAS";
		public String MALAQUIAS = "MALAQUIAS";
		public String MARCOS = "MARCOS";
		public String MATEO = "MATEO";
		public String MIQUEAS = "MIQUEAS";
		public String NAHUM = "NAHUM";
		public String NEHEMIAS = "NEHEMIAS";
		public String NUMEROS = "NUMEROS";
		public String OSEAS = "OSEAS";
		public String PEDRO1 = "1 PEDRO";
		public String PEDRO2 = "2 PEDRO";
		public String PROVERBIOS = "PROVERBIOS";
		public String REYES1 = "1 REYES";
		public String REYES2 = "2 REYES";
		public String ROMANOS = "ROMANOS";
		public String RUT = "RUT";
		public String SALMOS = "SALMOS";
		public String SAMUEL1 = "1 SAMUEL";
		public String SAMUEL2 = "2 SAMUEL";
		public String SANTIAGO = "SANTIAGO";
		public String SOFONIAS = "SOFONIAS";
		public String TESA1 = "1 TESALONICENSES";
		public String TESA2 = "2 TESALONICENSES";
		public String TIMOTEO1 = "1 TIMOTEO";
		public String TIMOTEO2 = "2 TIMOTEO";
		public String TITO = "TITO";
		public String ZACARIAS = "ZACARIAS";

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
			switch (numLibro) {
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
				case 65: libro=APOCALIPSIS;		break;
				case 66: libro=APOCALIPSIS;		break;
				case 67: libro=EXODO;
			}
			return libro;
		}
}
