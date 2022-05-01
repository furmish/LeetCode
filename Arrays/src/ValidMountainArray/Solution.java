package ValidMountainArray;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0, 1, 2, 3, 4, 5}));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length <= 2)
            return false;

        int l = 0, r = arr.length - 1;
        boolean isLeftChanged, isRightChanged;
        while (l != r) {
            isLeftChanged = false;
            isRightChanged = false;
            if (arr[l] < arr[l + 1]) {
                l++;
                isLeftChanged = true;
            }
            if (arr[r] < arr[r - 1]) {
                r--;
                isRightChanged = true;
            }
            if (!(isLeftChanged | isRightChanged))
                return false;
        }
        return l != 0 && r != arr.length - 1;
    }
}
