package game;

import java.util.*;

import fixtures.Room;

public class Main {

	public static Scanner scan = new Scanner(System.in);

	public static String input;
	public static String input1;
	public static String input2;
	public static char direction;
	public static Random rand = new Random();
	public static int rm; 
	public static Map<String, String> mRoomActivity = new HashMap<>();

	public static void main(String[] args) {
		boolean isPlaying = true;

		while (isPlaying) {
			System.out.print("Please type 'go' and direction, 'east', 'west', 'north', or 'south' to move to another room.\n");
			

			while (scan.hasNext()) {
				
				collectInput();
				parse(input);
				
				switch (direction) {
				case 'e':
					
					printRoom();
					break;
				case 'w':
					
					printRoom();
					break;

				case 'n':
					
					printRoom();
					break;

				case 's':
					
					printRoom();
					break;
				default:
					isPlaying = false;
					
				}

			}

			// close the scanner
			scan.close();

		}

	}

	public static void printRoom() {
		rm = rand.nextInt(8);
		String key = String.valueOf(rm);
		System.out.print(rm);
		System.out.println("     New landing spot:  "+RoomManager.rooms[rm][0].toUpperCase() +"\n\n");
		
		System.out.println(RoomManager.rooms[rm][1]+"\n");
		System.out.println(RoomManager.rooms[rm][2]+"\n");
		if(mRoomActivity.get(key)!=null) {
		System.out.println(mRoomActivity.get(key));
		}
		System.out.println("OK, tell me about your activity in this room.");
		collectActivity();
	}

	private static String collectInput() {
		input = scan.nextLine();
		//input1 = scan.next();
		//input2 = scan.next();
		return input;
	}
	
	private static void collectActivity() {
		input = scan.nextLine();
		String key = String.valueOf(rm); 
		if(mRoomActivity.get(key)!=null) {
			mRoomActivity.put(key, mRoomActivity.get(key)+"\n"+input);
			}else {
		mRoomActivity.put(key, input);
			}
		System.out.println("OK, where would you like to go next?");
	}

	private static void parse(String command) {
		direction = command.charAt(3);
	}
}
