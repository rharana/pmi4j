package dataOps;

public class ArrayOperations {
	
	public static Integer[][] integerTranspose(Integer[][] arg, Integer rows, Integer columns)
	{
		Integer[][] newArr = new Integer[columns][rows];
		return transpose(arg, newArr,rows,columns);
	}
	
	public static Double[][] doubleTranspose(Double[][] arg, Integer rows, Integer columns)
	{
		Double[][] newArr = new Double[columns][rows];
		return transpose(arg, newArr,rows,columns);
	}
	
	public static String[][] stringTranspose(String[][] arg, Integer rows, Integer columns)
	{
		String[][] newArr = new String[columns][rows];
		return transpose(arg, newArr,rows,columns);
	}
	
	public static Float[][] floatTranspose(Float[][] arg, Integer rows, Integer columns)
	{
		Float[][] newArr = new Float[columns][rows];
		return transpose(arg, newArr,rows,columns);
	}
	
	public static <T> T[][] transpose(T[][] arg,T[][] res, Integer rows, Integer columns)
	{   
		for (int i = 0; i < columns; i++) {
	        for (int j = 0; j < rows; j++) {
	        	res[i][j] = arg[j][i];
	        }
	    }
		return res;
	}
}
