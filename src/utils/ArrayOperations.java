package utils;

public class ArrayOperations {
	
	public static Integer[][] transpose(Integer[][] arg, Integer rowSize, Integer columnSize)
	{
		Integer[][] transposeArray = new Integer[rowSize][columnSize];

		for(int i = 0; i < rowSize ; i++)
		{    
			for(int j = 0; j < columnSize; j++)
			{    
				transposeArray[i][j] = transposeArray[j][i];  
			}    
		}  
		return transposeArray;
	}
	
}
