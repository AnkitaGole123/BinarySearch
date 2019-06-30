package searcher;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<String> searchIn = Arrays.asList("a","b","c","d","e");
        int lastIndex1 =searchIn.size() - 1;
        System.out.println(findElement("a",searchIn,0,lastIndex1));
    }

    public static <T extends Comparable<T>> int findElement(T toBeSearch, List<T> searchIn,int smallNumber, int largeNumber) {
        if(smallNumber < largeNumber) {
            int middleNumber = (smallNumber + largeNumber) / 2;
            if (searchIn.get(middleNumber).equals(toBeSearch)) {
                return middleNumber;
            } else if (searchIn.get(middleNumber).compareTo(toBeSearch) < 0) {
                return findElement(toBeSearch, searchIn, middleNumber+1, largeNumber);
            }
                return findElement(toBeSearch, searchIn, 0, middleNumber-1);
        }
        return (-1);
    }

//    private static int getMiddleNumber(int largeNumber, int smallNumber) {
//        return (largeNumber + smallNumber) / 2;
//    }
}
