package fr.lucasP243.matrices;

@SuppressWarnings("unused")
public interface Matrix<T extends Number> {

    /**
     * Get the matrix element at position (x, y).
     *
     * @param x The vertical coordinate of the element (row).
     * @param y The horizontal coordinate of the element (column).
     * @return The matrix element at position (x, y).
     */
    T get(int x, int y);

    /**
     * Set the matrix element at position (x, y) to the given value.
     *
     * @param x The vertical coordinate of the element (row).
     * @param y The horizontal coordinate of the element (column).
     * @param value The value to set at position (x, y).
     * @return The modified matrix.
     */
    Matrix<T> set(int x, int y, T value);


    /**
     * Add a scalar to this matrix.
     *
     * @param scalar The number to add to the matrix.
     * @return The modified matrix.
     */
    Matrix<Number> add(Number scalar);

    /**
     * Subtract a scalar to this matrix.
     *
     * @param scalar The number to subtract to the matrix.
     * @return The modified matrix.
     */
    Matrix<Number> subtract(Number scalar);

    /**
     * Multiply this matrix by a scalar.
     *
     * @param scalar The number to multiply this matrix by.
     * @return The modified matrix.
     */
    Matrix<Number> multiply(Number scalar);

    /**
     * Divide this matrix by a scalar.
     *
     * @param scalar The number to divide this matrix by.
     * @return The modified matrix.
     */
    Matrix<Number> divide(Number scalar);


    /**
     * Add a matrix to this matrix.
     *
     * @param matrix The matrix to add to this matrix.
     * @return The modified matrix.
     */
    Matrix<Number> add(Matrix<? extends Number> matrix);

    /**
     * Subtract a matrix to this matrix.
     *
     * @param matrix The matrix to subtract to this matrix.
     * @return The modified matrix.
     */
    Matrix<Number> subtract(Matrix<? extends Number> matrix);

    /**
     * Multiply this matrix by another matrix.
     *
     * @param matrix The matrix to multiply this matrix by.
     * @return The modified matrix.
     */
    Matrix<Number> multiply(Matrix<? extends Number> matrix);


    /**
     * Compute the matrix determinant.
     *
     * @return The determinant of the matrix.
     */
    T determinant();

    /**
     * Check if the matrix is invertible.
     * This is equivalent to checking if the determinant is above zero.
     *
     * @return {@code true} if this matrix is invertible, {@code false} otherwise.
     */
    boolean isInvertible();

    /**
     * Compute the inverse of this matrix.
     *
     * @return The inverse of this matrix.
     */
    Matrix<Number> inverse();

    /**
     * Transpose this matrix.
     *
     * @return The transpose of this matrix.
     */
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
     * If the arrays have different lengths, the corresponding matrix rows will be right-padded with zeroes.
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
