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
        if (n == 0 || flowerbed.length == 1 && flowerbed[0] == 0) {
            return true;
        } else if (flowerbed.length == 1) {
            return false;
        }

        int countPossiblePlaces = 0;

        if (flowerbed[1] == 0 && flowerbed[0] == 0) {
            flowerbed[0] = 1;
            countPossiblePlaces++;
        }

        if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            countPossiblePlaces++;
        }

        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (countPossiblePlaces >= n) {
                return true;
            }
            if  (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                countPossiblePlaces++;
            }
        }
        return n <= countPossiblePlaces;
    }
}
