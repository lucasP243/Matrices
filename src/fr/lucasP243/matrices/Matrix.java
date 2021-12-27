package fr.lucasP243.matrices;

@SuppressWarnings("unused")
public interface Matrix<T extends Number> {

    T get(int x, int y);

    Matrix<T> add(Matrix<T> matrix);

    Matrix<T> add(T scalar);

    Matrix<T> sub(Matrix<T> matrix);

    Matrix<T> sub(T scalar);

    Matrix<T> multiply(Matrix<T> matrix);

    Matrix<T> multiply(T scalar);

    Matrix<T> divide(Matrix<T> matrix);

    Matrix<T> divide(T scalar);

    Matrix<T> transpose();

    T[][] toArray();
}
