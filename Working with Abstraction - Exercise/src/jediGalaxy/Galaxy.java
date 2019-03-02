package jediGalaxy;

public class Galaxy {
	int[][] matrix;

	public Galaxy(int rows, int cols) {
		this.matrix = new int[rows][cols];

		int counter = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.matrix[i][j] = counter++;
			}
		}
	}

	public void doEvil(int evilRow, int evilCol) {
		while (evilRow >= 0 
				&& evilCol >= 0) {
			if (isStillInside(evilRow, evilCol)) {
				this.matrix[evilRow][evilCol] = 0;
			}
			
			evilRow--;
			evilCol--;
		}
	}
	
	public long doGood(int ivoRow, int ivoCol, long sum) {
		 while (ivoRow >= 0 
				 && ivoCol < matrix[1].length) {
			 
             if (isStillInside(ivoRow, ivoCol)) {
                 sum += matrix[ivoRow][ivoCol];
             }

             ivoCol++;
             ivoRow--;
         }
		 
		 return sum;
	}
	
	private boolean isStillInside(int row, int col) {
		return row >= 0 
       		 && row < this.matrix.length 
       		 && col >= 0 
       		 && col < this.matrix[0].length;
	}
}
