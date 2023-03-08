package utils;

import java.util.ArrayList;
import java.util.List;

public class Matrix
{
	private List<Integer[]> rows;
	private List<Integer[]> columns;
	
	//Constructor
	public Matrix (List<Integer[]> rows, List<Integer[]> columns) 
	{
		this.rows = rows;
		this.columns = columns;
	}
	//Of Method
	public Matrix of(Integer[][] orderedItems, Integer rowSize, Integer columnSize)
	{
		List<Integer[]> resLines = new ArrayList<Integer[]>();
		List<Integer[]> resColumns = new ArrayList<Integer[]>();
	
		for(int i = 0; i < rowSize; i++) 
		{
			resLines.add(i, orderedItems[i]);
		}
		//CHANGE LINE WHEN POSSIBLE
		Integer[][] transpose = ArrayOperations.transpose(orderedItems, rowSize, columnSize);
		
		for(int i = 0; i < columnSize; i++) 
		{
			resColumns.add(i, transpose[i]);
		}
		
		return new Matrix(resLines, resColumns);
	}
	
}
