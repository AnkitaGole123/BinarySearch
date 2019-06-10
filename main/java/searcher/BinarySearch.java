package searcher;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int toBeSearched = Integer.parseInt(args[0]);
        List<Integer> searchIn = Arrays.asList(1, 3, 4, 6, 7, 11, 14, 22);
        int largeNumber = searchIn.size();
        int smallNumber = 0;
        findNumberInList(toBeSearched, searchIn,largeNumber,smallNumber);
    }

    public static <T extends Comparable <T>> int findNumberInList(T toBeSearch, List<T> searchIn, int largeNumber, int smallNumber) {
        if (smallNumber < largeNumber-1) {
            int middleNumber = getMiddleNumber(largeNumber, smallNumber);
            if (searchIn.get(middleNumber) == toBeSearch) {
                return middleNumber;
            } else if (searchIn.get(middleNumber).compareTo(toBeSearch)  > 0) {
                return findNumberInList(toBeSearch,searchIn, middleNumber,smallNumber);
            } else if (searchIn.get(middleNumber).compareTo(toBeSearch) < 0) {
                return findNumberInList(toBeSearch,searchIn,largeNumber,middleNumber);
            }
        }
        return (-1);
    }
    private static int getMiddleNumber(int largeNumber, int smallNumber) {
        return (largeNumber + smallNumber) / 2;
    }
}
