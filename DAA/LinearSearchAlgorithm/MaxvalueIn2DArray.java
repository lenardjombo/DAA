package LinearSearchAlgorithm;
public class MaxvalueIn2DArray {
    public static void main(String[] args) {
        int[][] numbers = { { 1, 2, 3, 4 },
                { 5, 6, 7 },
                { 8, 9, 10 } };
        int ans = search(numbers);
        System.out.println(ans);
    }

    static int search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
