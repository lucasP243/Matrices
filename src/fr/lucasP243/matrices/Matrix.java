package fr.lucasP243.matrices;

@SuppressWarnings("unused")
public interface Matrix<T extends Number> {

    T get(int x, int y);

    Matrix<T> set(int x, int y);


    Matrix<Number> add(Number scalar);

    Matrix<Number> sub(Number scalar);

    Matrix<Number> multiply(Number scalar);

    Matrix<Number> divide(Number scalar);


    Matrix<Number> add(Matrix<? extends Number> matrix);

    Matrix<Number> sub(Matrix<? extends Number> matrix);

    Matrix<Number> multiply(Matrix<? extends Number> matrix);

    Matrix<Number> divide(Matrix<? extends Number> matrix);


    T determinant();

    boolean isInvertible();

    Matrix<Number> inverse();

    Matrix<T> transpose();


    /**
     * Convert this matrix into a matrix of bytes.
     * This operation may involve data loss as rounding and truncation.
     *
     * @return A new matrix of bytes deduced from the original matrix.
     */
    Matrix<Byte> toByteMatrix();

    /**
     * Convert this matrix into a matrix of shorts.
     * This operation may involve data loss as rounding and truncation.
     *
     * @return A new matrix of shorts deduced from the original matrix.
     */
    Matrix<Short> toShortMatrix();

    /**
     * Convert this matrix into a matrix of integers.
     * This operation may involve data loss as rounding and truncation.
     *
     * @return A new matrix of integers deduced from the original matrix.
     */
    Matrix<Integer> toIntegerMatrix();

    /**
     * Convert this matrix into a matrix of longs.
     * This operation may involve data loss as rounding and truncation.
     *
     * @return A new matrix of longs deduced from the original matrix.
     */
    Matrix<Long> toLongMatrix();

    /**
     * Convert this matrix into a matrix of floats.
     * This operation may involve data loss as rounding.
     *
     * @return A new matrix of floats deduced from the original matrix.
     */
    Matrix<Float> toFloatMatrix();

    /**
     * Convert this matrix into a matrix of doubles.
     * This operation may involve data loss as rounding.
     *
     * @return A new matrix of doubles deduced from the original matrix.
     */
    Matrix<Double> toDoubleMatrix();


    /**
     * Convert this matrix into a two-dimensional array.
     *
     * @return An array of arrays giving a two-dimensional representation of the matrix.
     */
    T[][] toArray();

    /**
     * Create a new matrix from a two-dimensional array.
     *
     * @param array An array of arrays giving a two-dimensional representation of the matrix.
     * @param <S> The type of the matrix elements.
     *
     * @return The newly created matrix.
     */
    static <S extends Number> Matrix<S> createFromArray(S[][] array) {
        return null; // TODO : add MatrixFactory
    }
}
