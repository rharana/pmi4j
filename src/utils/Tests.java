package utils;

public class Tests {

	public static void main(String[] args) {
		
		
//		Integer [][] temporaryArray = {{0,1,2,3,4,5}, {3,4,5,3,4,5}, {6,7,8,3,4,5}};
//		Integer [][] temporaryArray2 = {{1,1,1,1,1,1}, {2,2,2,2,2,2}, {2,2,2,2,2,2}, {1,1,1,1,1,1}, {2,2,2,2,2,2}, {2,2,2,2,2,2}};
//		Matrix m = Matrix.ofArray(temporaryArray, 3, 6);
		Integer [][] temporaryArray = {{0,1,2,3,4,5}, {3,4,5,3,4,5}, {6,7,8,3,4,5}};
		IntegerMatrix mat = new IntegerMatrix(temporaryArray);
		mat.view();
		mat.transpose().view();
	}

}
