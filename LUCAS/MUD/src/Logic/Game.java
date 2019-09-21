package Logic;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

import Objects.Room;

public class Game {
	static String com;
	static boolean end = false;
	static Scanner tecla = new Scanner(System.in);
	static int index = 0;
	static Room[] area1 = new Room[4];
	static int curr = 0;
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the MUD");
		readCSV();
		
		do {
			System.out.println("Name a command or type 'help' to display command list:");
			com = tecla.next();
			
			switch(com){
				case "n":  checkMove(com); break;
				case "s":  checkMove(com); break;
				case "e":  checkMove(com); break;
				case "w":  checkMove(com); break;
				case "help": dHelp(); break;
				case "look": look(); break;
				case "scout":scout(); break;
				case "exit": end = true; break;
				default: System.out.printf("I don't know how to %s\n", com);
			}
			
		} while (!end);
		
		System.out.println("Bye bye!");

	}

	public static void dHelp() {
		System.out.println("---------COMMAND LIST--------");
		System.out.println("n = North | s = South | e = East | w = West");
		System.out.println("Type 'look' to look around");
		System.out.println("Type 'scout' to see obvious available paths");
		System.out.println("Type 'exit' to exit the game");
		System.out.println("Type 'help' to display this command list");
		System.out.println("------------------------------");
	}
	
	public static void look() {
		System.out.println(area1[curr].getDescription());
	}

	public static void scout() {
		if(area1[curr].getN() != -1) System.out.println("NORTH");
		if(area1[curr].getS() != -1) System.out.println("SOUTH");
		if(area1[curr].getE() != -1) System.out.println("EAST");
		if(area1[curr].getW() != -1) System.out.println("WEST");
	}
	
	public static void readCSV() {
		  File file = new File("src/area1.csv");
		  Scanner sc = null;
		  try {
			  sc = new Scanner(file);
		  
			   while(sc.hasNextLine()){
				   String str = sc.nextLine();
				   parseAndCreate(str);
			   }
		  } catch (IOException  exp) {
		   exp.printStackTrace();
		  }
		  sc.close();
	}
	public static void parseAndCreate(String str) {
		String index, name, desc, n, s, e, w;
		  Scanner sc = new Scanner(str);
		  sc.useDelimiter(";");
		  while(sc.hasNext()){
		   index = sc.next();
		   name = sc.next();
		   desc = sc.next();
		   n = sc.next();
		   s = sc.next();
		   e = sc.next();
		   w = sc.next();
		   area1[Integer.parseInt(index)] = new Room(Integer.parseInt(index), name, desc, 
				   							Integer.parseInt(n), Integer.parseInt(s), 
				   							Integer.parseInt(e), Integer.parseInt(w));
		  }
		  sc.close();
	}
	
	public static void checkMove(String com) {
		switch(com) {
			case "n": northMover(com); break;
			case "s": southMover(com); break;
			case "e": eastMover(com); break;
			case "w": westMover(com); break;
		}
	}
	
	public static void northMover(String com) {
		if(area1[curr].getN() != -1) {
			curr = area1[area1[curr].getN()].getIndex();
			System.out.println("You moved to the north now you're at " + area1[curr].getName());
		} else System.out.println("You can't move there");
	}
	
	public static void southMover(String com) {
		if(area1[curr].getS() != -1) {
			curr = area1[area1[curr].getS()].getIndex();
			System.out.println("You moved to the south now you're at " + area1[curr].getName());
		} else System.out.println("You can't move there");
	}
	
	public static void eastMover(String com) {
		if(area1[curr].getE() != -1) {
			curr = area1[area1[curr].getE()].getIndex();
			System.out.println("You moved to the east now you're at " + area1[curr].getName());
		} else System.out.println("You can't move there");
	}
	
	public static void westMover(String com) {
		if(area1[curr].getW() != -1) {
			curr = area1[area1[curr].getW()].getIndex();
			System.out.println("You moved to the west now you're at " + area1[curr].getName());
		} else System.out.println("You can't move there");
	}
	
}

/* BKP DE CODIGO VELHO
 int dir = 0;
		String car = "";
		for(int i = 0;i < area1.length;i++) {
			System.out.printf("%s - %s\n", area1[i].getName(), area1[i].getDescription());
			for(int j = 0;j <= area1.length-1;j++) {
				if(matrix[i][j] != 0) {
					dir = matrix[i][j];
					switch (dir) {
						case 1: car = "North"; break;
						case 2: car = "South"; break;
						case 3: car = "West"; break;
						case 4: car = "East"; break;
					}
					System.out.println("Links with: " + area1[j].getName() + " Cardinal: " + car);
					break;
				}
			}
		}
*/
