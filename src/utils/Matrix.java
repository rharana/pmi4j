package utils;

import java.util.ArrayList;
import java.util.List;

public class Matrix
{
	private List<Integer[]> rows;
	private List<Integer[]> columns;
	
	//Getters-Setters
	public List<Integer[]> getRows() {
		return rows;
	}
	
	public List<Integer[]> getColumns() {
		return columns;
	}
	
	public void setRows(List<Integer[]> rows) {
		this.rows = rows;
	}
	
	public void setColumns(List<Integer[]> columns) {
		this.columns = columns;
	}
	
	//Constructor
	public Matrix (List<Integer[]> rows, List<Integer[]> columns) 
	{
		this.rows = rows;
		this.columns = columns;
	}
	
	public Matrix ()
	{
		this.rows = new ArrayList<Integer[]>();
		this.columns = new ArrayList<Integer[]>();
	}
	//Of Method
	public static Matrix ofArray(Integer[][] orderedItems, Integer rowSize, Integer columnSize)
	{
		List<Integer[]> resRows = new ArrayList<Integer[]>();
		List<Integer[]> resColumns = new ArrayList<Integer[]>();
	
		for(int i = 0; i < rowSize; i++) 
		{
			resRows.add(i, orderedItems[i]);
		}
		//CHANGE LINE WHEN POSSIBLE
		Integer[][] transpose = ArrayOperations.transpose(orderedItems, rowSize, columnSize);
		
		for(int i = 0; i < rowSize; i++) 
		{
			resColumns.add(i, transpose[i]);
		}
		
		return new Matrix(resRows, resRows);
	}
	
	public static void View(Matrix matrix) 
	{
		for(Integer[] row : matrix.getRows()) 
		{
			String rowLine = "";
			for(Integer num: row) 
			{
				rowLine += "[" + num.toString() +"]";
			}
			System.out.println(rowLine);
		}
	}
	
	public static void ViewTraspose(Matrix matrix) 
	{
		for(Integer[] column : matrix.getColumns()) 
		{
			String columnLine = "";
			for(Integer num: column) 
			{
				columnLine += "[" + num.toString() +"]";
			}
			System.out.println(columnLine);
		}
	}
	
	//Must be extremely optimised and formalised
	public static Matrix Product(Matrix matrixA, Matrix matrixB) 
	{
		if(matrixA.getColumns().size() != matrixB.getRows().size()) 
		{
			//Change later for formalised library exception
			System.out.println("Two Matrices can't be multiplied if first one's column number is not"
					+ "equal to second one's row number");
			return null;
		}
		
		else 
		{
			Integer currentProduct;
			
			Integer currentProductSum = 0;
			Integer[] currentRow;
			List<Integer[]> currentRows = new ArrayList<Integer[]>();
			
			for(int i = 0; i < matrixA.getRows().size(); i++) 
			{
				currentRow = new Integer[matrixB.getColumns().size()];
				
				for(int j = 0; j < matrixB.getColumns().size(); j++) 
				{
					currentProductSum = 0;
					for(int k = 0; k < matrixB.getRows().size(); k++) 
					{
						
						currentProduct = matrixA.getRows().get(i)[k] * matrixB.getColumns().get(j)[k];
						currentProductSum += currentProduct;
					}
					currentRow[j] = currentProductSum;
				}
				
				currentRows.add(currentRow);
			}
			return new Matrix (currentRows, currentRows);
		}
	}
}
