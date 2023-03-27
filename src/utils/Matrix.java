package utils;

public interface Matrix<T>
{
	Matrix<T> leftProduct(Matrix<T> rightMatrix); //Normal product
	Matrix<T> rightProduct(Matrix<T> leftMatrix); //Inverse product
	Matrix<T> transpose();
	T determinant();
	void view();
}
