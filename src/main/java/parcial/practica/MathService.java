package parcial.practica;

public class MathService {
    public static int linearSearch(int[] valuelist, int value) {
        for (int i = 0; i < valuelist.length; i++) {
            if (valuelist[i] == value) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] valuelist, int value) {
        int left = 0;
        int right = valuelist.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (valuelist[mid] == value) {
                return mid;
            } else if (valuelist[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
