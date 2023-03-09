package utils;

public class Tests {

	public static void main(String[] args) {
		Integer[][] matrix;
		
		
		
//		Integer [][] temporaryArray = {{0,1,2,3,4,5}, {3,4,5,3,4,5}, {6,7,8,3,4,5}};
//		Integer [][] temporaryArray2 = {{1,1,1,1,1,1}, {2,2,2,2,2,2}, {2,2,2,2,2,2}, {1,1,1,1,1,1}, {2,2,2,2,2,2}, {2,2,2,2,2,2}};
//		Matrix m = Matrix.ofArray(temporaryArray, 3, 6);
//		Matrix n = Matrix.ofArray(temporaryArray2, 6, 6);
//		Matrix.View(m);
//		System.out.println("");
//		Matrix.View(n);
		//Matrix mxn = Matrix.Product(m, n);
		//Matrix.View(mxn);
		Integer [][] temporaryArray = {{0,1,2,3,4,5}, {3,4,5,3,4,5}, {6,7,8,3,4,5}};
		View(temporaryArray);
		View(transpose(temporaryArray));
		
	}
		public static Integer[][] transpose(Integer[][] matrix)
		{
			if (matrix == null || matrix.length == 0)
		        return matrix;
		    
			int rows = matrix.length;
		    int columns = matrix[0].length;

		    Integer[][] res = new Integer[columns][rows];
		    
			for (int i = 0; i < columns; i++) {
		        for (int j = 0; j < rows; j++) {
		        	res[i][j] = matrix[j][i];
		        }
		    }
			return res;
		}
		
		public static void View(Integer[][] matrix)
		{
			String concat;
			int rows = matrix.length;
		    int columns = matrix[0].length;
			for (int i = 0; i < rows; i++) {
				concat = "";
		        for (int j = 0; j < columns; j++) {
		        	concat += matrix[i][j].toString();
		        }
		        System.out.println(concat);
		    }
		}
		
		public static void setGraphicalRep(Integer[][] matrix)
		{
			String concat;
			int rows = matrix.length;
		    int columns = matrix[0].length;
			for (int i = 0; i < rows; i++) {
				concat = "";
		        for (int j = 0; j < columns; j++) {
		        	concat += matrix[i][j].toString();
		        }
		        System.out.println(concat);
		    }
		}

}
