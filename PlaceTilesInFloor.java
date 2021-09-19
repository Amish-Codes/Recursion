package Recursion;
// Place tiles of Size 1Xm in a floor of size mXn

public class PlaceTilesInFloor {

    public static int placeTiles(int n, int m) {

        if (n==m) {
            return 2;
        }

        if (n<m) {
            return 1;
        }

        // vertically
        int vPlacements = placeTiles(n-m,m);

        // horizontally
        int hPlacements = placeTiles(n-1,m);

        return vPlacements + hPlacements;
    }

    public static void main(String[] args) {
        int n=4, m=2;
        System.out.printf("%d", placeTiles(n, m));
    }
}
