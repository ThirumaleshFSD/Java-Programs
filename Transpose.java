public class Transpose {
    public static void main(String[] args) {
        int size = 3;
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int transposed[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        // Print the transposed matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
