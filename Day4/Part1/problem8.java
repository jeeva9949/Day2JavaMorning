class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    public Matrix(int r, int c) {
        rows = r;
        columns = c;
        elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }

    public void addMatrices(Matrix matrix2) {
        if (this.rows != matrix2.rows || this.columns != matrix2.columns) {
            System.out.println("Matrices cannot be added.");
            return;
        }

        Matrix result = new Matrix(this.rows, this.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.elements[i][j] = this.elements[i][j] + matrix2.elements[i][j];
            }
        }

        System.out.println("Resultant Matrix after addition:");
        result.printMatrix();
    }

    public void multiplyMatrices(Matrix matrix2) {
        if (this.columns != matrix2.rows) {
            System.out.println("Matrices cannot be multiplied.");
            return;
        }

        Matrix result = new Matrix(this.rows, matrix2.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix2.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.elements[i][j] += this.elements[i][k] * matrix2.elements[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix after multiplication:");
        result.printMatrix();
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        Matrix matrix2 = new Matrix(3, 2);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(1, 0, 9);
        matrix2.setElement(1, 1, 10);
        matrix2.setElement(2, 0, 11);
        matrix2.setElement(2, 1, 12);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();

        System.out.println("\nMatrix 2:");
        matrix2.printMatrix();

        System.out.println("\nMatrix Addition:");
        matrix1.addMatrices(matrix2);

        System.out.println("\nMatrix Multiplication:");
        matrix1.multiplyMatrices(matrix2);
    }
}

