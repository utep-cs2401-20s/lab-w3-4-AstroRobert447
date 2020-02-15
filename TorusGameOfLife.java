//Roberto Johnson
public class TorusGameOfLife {
	int size;
	int[][] Board;
	int[][] Previous;
	
	TorusGameOfLife(int size){
		this.size = size;
	}
	
	public static void main(String[] args){
	}
	
	TorusGameOfLife(int[][] Board){
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
		count+=Previous[(row-1)%size][(col-1)%size];
		count+=Previous[(row-1)%size][col%size];
		count+=Previous[(row-1)%size][(col+1)%size];
		
		count+=Previous[(row)%size][(col-1)%size];
		count+=Previous[row%size][(col+1)%size];
		
		count+=Previous[(row+1)%size][(col-1)%size];
		count+=Previous[(row+1)%size][col%size];
		count+=Previous[(row+1)%size][(col+1)%size];
		
		return count;

	}
	
	public void evolution (int n){
		for(int i=0; i <= 8; i++) {
			oneStep();
		
		}
	}
}
