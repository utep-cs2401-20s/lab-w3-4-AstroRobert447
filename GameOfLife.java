//Roberto Johnson
public class GameOfLife{
	int size;
	int[][] Board;
	int[][] Previous;
	
	GameOfLife(int size){
		this.size = size;
	}
	public static void main(String[] args){
	}
	
	GameOfLife(int[][] Board){
		this.size = Board.length;
		this.Board = new int [size][size];
		this.Previous = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				Previous[i][j] = Board [i][j];
			}
		}
	}
	public int [][] getBoard(){
		return this.Board;
	}
	public void oneStep() {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				int a = neighbors(i, j );
				if(!(Board[i][j] == 1 && (a == 2 || a == 3))){
					Board[i][j] = 0;
				}
				if(Board[i][j]== 0 && a == 3) {
					Board[i][j] = 1;
				}
			}
		}
	}
	public int neighbors(int row, int col) {
		int count = 0;
			if(Previous[row-1][col-1]== 1) {
				count++;
			}
			if(Previous[row-1][col]== 1) {
				count++;
			}
			if(Previous[row-1][col+1]== 1) {
				count++;
			}
			if(Previous[row][col-1]== 1) {
				count++;
			}
			if(Previous[row][col+1]== 1) {
				count++;
			}
			if(Previous[row+1][col-1]== 1) {
				count++;
			}
			if(Previous[row+1][col]== 1) {
				count++;
			}
			if(Previous[row+1][col+1]== 1) {
				count++;
			}
		return count;
	}
	public void evolution (int n){
		for(int i=0; i <= 8; i++) {
			oneStep();
		
		}
	}
}