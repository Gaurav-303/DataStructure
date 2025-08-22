package algorithm;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r- l) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 6;

        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}

