package searcher;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int toBeSearched = Integer.parseInt(args[0]);
        List<Integer> searchIn = Arrays.asList(1, 3, 4, 6, 7, 11, 14, 22);
        int largeNumber = searchIn.size();
        int smallNumber = 0;
        findElement(toBeSearched, searchIn, largeNumber, smallNumber);
    }

    public static <T extends Comparable<T>> int findElement(T toBeSearch, List<T> searchIn, int largeNumber, int smallNumber) {
        if (largeNumber == 1) {
            return 0;
        }
        if (smallNumber < largeNumber - 1) {
            int middleNumber = getMiddleNumber(largeNumber, smallNumber);
            if (searchIn.get(middleNumber).equals(toBeSearch)) {
                return middleNumber;
            } else if (searchIn.get(middleNumber).compareTo(toBeSearch) > 0) {
                return findElement(toBeSearch, searchIn, middleNumber, smallNumber);
            } else if (searchIn.get(middleNumber).compareTo(toBeSearch) < 0) {
                return findElement(toBeSearch, searchIn, largeNumber, middleNumber);
            }
        }
        return (-1);
    }

    private static int getMiddleNumber(int largeNumber, int smallNumber) {
        return (largeNumber + smallNumber) / 2;
    }
}
