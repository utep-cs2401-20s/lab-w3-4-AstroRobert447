//Roberto Johnson
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class GOLTester {
		@Test
		public void GameOfLife1() {
			int[][] Board = {
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,1,1,1,0},
					{0,0,0,0,0},
					{0,0,0,0,0}
		};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(1,1)); 
		}
		
		@Test
		public void GameOfLife2() {
			int[][] Board = {
					{0,0,0,0,0,0},
					{0,1,1,0,0,0},
					{0,1,1,0,0,0},
					{0,0,0,1,1,0},
					{0,0,0,1,1,0},
					{0,0,0,0,0,0}
			};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(1,3)); 
		}
		
		@Test
		public void GameOfLife3() {
			int[][] Board = {
					{0,0,1,0,0,0},
					{0,0,1,0,0,0},
					{0,1,1,1,0,0},
					{0,0,0,0,0,0},
					{0,0,0,1,1,0}
		};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(2,3)); 
		}
		
		@Test
		public void GameOfLife4() {
			int[][] Board = {
					{0,0,0,0,0,0},
					{0,0,1,1,0,0},
					{0,1,0,0,1,0},
					{0,0,1,1,0,0},
					{0,0,0,0,0,0}
		};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(1,1)); 
		}
		
		@Test
		public void GameOfLife5() {
			int[][] Board = {
					{0,0,0,0,0,0,0,0,0},
					{0,0,1,0,0,0,1,0,0},
					{0,0,0,1,1,1,0,0,0},
					{0,0,0,1,0,1,0,0,0},
					{0,0,0,0,1,0,0,0,0},
					{0,1,0,0,1,0,0,1,0},
					{0,0,1,0,0,0,1,0,0},
					{0,0,0,1,1,1,0,0,0},
					{0,0,0,0,0,0,0,0,0}
					
		};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(6,7)); 
		}
		
		@Test
		public void GameOfLife6() {
			int[][] Board = {
					{0,0,0,0,0,0,0,0,0,0},
					{0,1,0,1,0,0,1,0,1,0},
					{0,0,0,1,0,0,1,0,0,0},
					{0,1,1,0,0,0,0,1,1,0},
					{0,0,0,1,0,0,1,0,0,0},
					{0,0,0,0,1,1,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					
		};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(1,5)); 
		}
		
		@Test
		public void GameOfLife7() {
			int[][] Board = {
					{0,0,0,0,1,1,0,0,0,},
					{1,0,1,0,1,1,0,1,0,},
					{1,0,0,0,1,0,0,0,1,},
					{0,0,0,1,1,0,1,1,0,},
					{0,0,1,0,1,0,1,0,1,},
					{0,0,0,0,0,0,0,0,0,}				
					
		};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(2,2)); 
		}
		
		@Test
		public void GameOfLife8() {
			int[][] Board = {
					{0,0,0,1,1,0,1,1,0,0,0},
					{0,0,1,0,0,1,0,0,1,0,0},
					{0,0,0,1,1,0,1,1,0,0,0},
					{0,0,1,0,0,1,0,0,1,0,0},
					{0,0,0,1,1,0,1,1,0,0,0}
					
		};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(3,2)); 
		}
		
		@Test
		public void GameOfLife9() {
			int[][] Board = {
					{0,0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,1,0,0,0,0,0},
					{0,0,0,0,1,0,1,0,0,0,0},
					{0,0,0,0,0,1,0,0,0,0,0},
					{0,0,1,0,0,1,0,0,1,0,0},
					{0,0,1,0,0,1,0,0,1,0,0},
					{0,0,0,1,1,1,1,1,0,0,0},
					{0,0,0,0,1,1,1,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0,0}
					
					
		};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(5,2)); 
		}
		
		@Test
		public void GameOfLife10() {
			int[][] Board = {
					{0,0,0,0,0,0,0,0,0,0,0},
					{0,0,0,1,1,1,1,1,0,0,0},
					{0,0,1,0,1,0,1,0,1,0,0},
					{0,1,0,0,1,0,1,0,0,1,0},
					{0,1,0,0,1,0,1,0,0,1,0},
					{0,0,1,0,1,0,1,0,1,0,0},
					{0,0,0,1,1,1,1,1,0,0,0},
					{0,0,0,0,0,0,0,0,0,0,0}
					
					
		};
			GameOfLife sol = new GameOfLife(Board);
			assertEquals(2, sol.neighbors(3,1)); 
		}
		
		@Test
		public void TorusGameOfLife1() {
			int[][] Board = {
					{0,0,0,0,0,0},
					{0,0,0,0,0,0},
					{0,0,1,1,1,0},
					{0,1,1,1,0,0},
					{0,0,0,0,0,0},
					{0,0,0,0,0,0}
			};
			TorusGameOfLife sol = new TorusGameOfLife(Board);
			assertEquals(2, sol.neighbors(1,2)); 
		}
		
		
		
		@Test
		public void TorusGameOfLife2() {
			int[][] Board = {
					{0,0,0,0,0,0,0},
					{0,0,0,1,0,0,0},
					{0,0,1,0,1,0,0},
					{0,1,0,1,0,1,0},
					{0,0,0,1,0,0,0},
					{0,0,0,1,0,0,0},
					{0,0,0,0,0,0,0}
			};
			TorusGameOfLife sol = new TorusGameOfLife(Board);
			assertEquals(2, sol.neighbors(2,5)); 
		}
		
		@Test
		public void TorusGameOfLife3() {
			int[][] Board = {
					{0,0,0,1,0,0,0},
					{1,1,1,0,1,1,1},
					{0,0,0,1,0,0,0}
			};
			TorusGameOfLife sol = new TorusGameOfLife(Board);
			assertEquals(2, sol.neighbors(1,6)); 
		}
		
		@Test
		public void TorusGameOfLife4() {
			int[][] Board = {
					{0,0,0,1,0,0,0},
					{0,0,1,0,1,0,0},
					{0,0,0,1,0,0,0},
					{0,1,1,1,1,1,0},
					{0,0,1,0,1,0,0},
					{0,0,1,0,1,0,0},
					{0,0,1,0,1,0,0}
			};
			TorusGameOfLife sol = new TorusGameOfLife(Board);
			assertEquals(2, sol.neighbors(3,5)); 
		}
		
		@Test
		public void TorusGameOfLife5() {
			int[][] Board = {
					{0,0,0,0,0},
					{0,1,0,1,0},
					{1,0,1,0,1},
					{1,1,0,1,1},
					{1,0,0,0,1},		
			};
			TorusGameOfLife sol = new TorusGameOfLife(Board);
			assertEquals(2, sol.neighbors(1,3)); 
		}			
	
}
