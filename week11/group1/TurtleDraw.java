import java.util.Scanner;

class TurtleDraw {
	
	private static void displayBoard(int b[][]) {
		//print the board
		
		for (int i=0;i<b.length;i++) {
			for (int j=0;j < b[i].length;j++) {
				if (b[i][j] == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String args[]) {
		
		int board[][] = new int[20][20];
		
		Scanner in = new Scanner(System.in);
		

		boolean exit = false;
			
		int currentRow = 0;	
		int currentColumn = 0;	
			
		int mode = 0; //0 - row, 1 - column	
		int dir = 1;  //1 - forward, "-1" - back
		int pen = 0; //0 - up, 1 - down	
		while (!exit) {
			int command = in.nextInt();
			
			switch (command) {
				
				case 9: exit = true; break; 
				case 1: 
					pen = 0;
				; break;
				case 2: 
					pen = 1;
				; break;
				case 3: //turn right
					
				
				
					if (mode == 0) { //is row
						mode = 1;
					} else { // else column
						
						if (dir == 1) {
							dir = -1; 
						} 
						
						mode = 0;
					}
				; break; 
				case 4: //turn left
					if (mode == 0) { //is row
						mode = 1;
					} else { //else column
						mode = 0;
					}
				
				; break;
				case 5: 
					int distance = in.nextInt();
					
					if (pen == 0) {
						continue; //do nothing 
					}
					
					//column
					if (mode == 1) {
						for (int i=currentRow;i<distance;i+=dir) {
							board[i][currentColumn] = 1;	
						}
						currentRow += distance;
					} else {
						//else is row mode

						for (int i=currentColumn;i<distance;i+=dir) {
							board[currentRow][i] = 1;	
						}
						
						currentColumn += distance;
					}
				break;
				case 6: 
					displayBoard(board);
				; break;
				
			}
			
		}	
		
	}
} 
