package Leetcode;

import java.util.Arrays;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1};
        int n = 1;
        canPlaceFlowers(arr, n);
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // let l be length of the flowers
        int l = flowerbed.length;

        // if the length is one return according to the required n
        if (l == 1) {
            return n <= 1;
        }

        for (int i = 0; i < l; i++) {
            // check for the first element
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            // check for the last element
            else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else {
                if (flowerbed[i] != 1 && flowerbed[i + 1] != 1 && flowerbed[i - 1] != 1) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        System.out.println("n - " + n + " Array - " + Arrays.toString(flowerbed));
        return n <= 0;
    }

    public boolean canPlaceFlowers2(int[] flowerbed, int n) {
        if (n == 0) return true; // No need to place any flowers

        int l = flowerbed.length;

        for (int i = 0; i < l; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == l - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) return true; // If all flowers placed, return early
                }
            }
        }

        return n <= 0;
    }


}
