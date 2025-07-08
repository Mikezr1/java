package Lessen.les5H4StringsAndArrays.Arrays.Examples;

public class TwoDimensions {
    public static void main(String[] args) {

        //twee dimensions
        int X = 10;
        int Y = 3;

        double[][] a = new double[X][Y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                a[i][j] = 0.0;
            }
        }
    }
}