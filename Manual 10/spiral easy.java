public static void printInSpiralOrder(final int[][] arr) {
    if (arr.length == 0 || arr[0].length == 0) {
        return;
    }
 
    int top = 0, bottom = arr.length - 1, left = 0, right = arr[0].length - 1;
    int dir = 1;
 
    while (top <= bottom && left <= right) {
        if (dir == 1) {    // left-right
            for (int i = left; i <= right; ++i) {
                System.out.print(arr[top][i] + " ");
            }
 
            ++top;
            dir = 2;
        } else if (dir == 2) {     // top-bottom
            for (int i = top; i <= bottom; ++i) {
                System.out.print(arr[i][right] + " ");
            }
 
            --right;
            dir = 3;
        } else if (dir == 3) {     // right-left
            for (int i = right; i >= left; --i) {
                System.out.print(arr[bottom][i] + " ");
            }
 
            --bottom;
            dir = 4;
        } else if (dir == 4) {     // bottom-up
            for (int i = bottom; i >= top; --i) {
                System.out.print(arr[i][left] + " ");
            }
 
            ++left;
            dir = 1;
        }
    }
}