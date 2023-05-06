package can_place_flowers;

public class Solution {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
        System.out.println(canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
        System.out.println(canPlaceFlowers(new int[]{0}, 1));
        System.out.println(canPlaceFlowers(new int[]{1}, 1));
        System.out.println(canPlaceFlowers(new int[]{0, 0}, 1));
        System.out.println(canPlaceFlowers(new int[]{0, 0, 0}, 3));
        System.out.println(canPlaceFlowers(new int[]{0, 0, 0, 0}, 3));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        int countPossiblePlaces = 0;

        if (canPlant(flowerbed, 0)) {
            plant(flowerbed, 0);
            countPossiblePlaces++;
        }

        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (canPlant(flowerbed, i)) {
                plant(flowerbed, i);
                countPossiblePlaces++;
            }
            if (countPossiblePlaces >= n) {
                return true;
            }
        }

        if (canPlant(flowerbed, flowerbed.length - 1)) {
            plant(flowerbed, flowerbed.length - 1);
            countPossiblePlaces++;
        }

        return countPossiblePlaces >= n;
    }

    private static boolean canPlant(int[] flowerbed, int i) {
        return flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
    }

    private static void plant(int[] flowerbed, int i) {
        flowerbed[i] = 1;
    }
}
