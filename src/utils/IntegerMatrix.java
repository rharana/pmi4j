package utils;

import dataOps.ArrayOperations;

public class IntegerMatrix implements Matrix<Integer> {
	private Integer[][] values;
	private int rows;
	private int columns;

	public Integer[][] getValues() {
		return values;
	}

	public void setValues(Integer[][] values) {
		this.values = values;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	
	public IntegerMatrix(Integer[][] values) {
		setValues(values);
		setColumns(values[0].length);
		setRows(values.length);
	}
	
	@Override
	public Matrix<Integer> leftProduct(Matrix<Integer> rightMatrix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matrix<Integer> rightProduct(Matrix<Integer> leftMatrix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matrix<Integer> transpose() {
		return new IntegerMatrix(ArrayOperations.integerTranspose(this.values, this.rows, this.columns));
	}

	@Override
	public Integer determinant() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void view()
	{
		String concat;
		for (int i = 0; i < this.rows; i++) {
			concat = "";
	        for (int j = 0; j < this.columns; j++) {
	        	concat += this.values[i][j].toString();
	        }
	        System.out.println(concat);
	    }
	}

}
