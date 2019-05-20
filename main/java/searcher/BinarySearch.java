package searcher;

public class BinarySearch {
    public static void main(String[] args) {
        int toBeSearched = Integer.parseInt(args[0]);
        int[] searchIn = {1, 3, 4, 6, 7, 11, 14, 22};
        findNumberInList(toBeSearched, searchIn);
    }

    public static int findNumberInList(int toBeSearch, int[] searchIn) {
        int largeNumber = searchIn.length;
        int smallNumber = 0;
        while (smallNumber < largeNumber-1) {
            int middleNumber = getMiddleNumber(largeNumber, smallNumber);
            if (searchIn[middleNumber] == toBeSearch) {
                return middleNumber;
            } else if (searchIn[middleNumber] > toBeSearch) {
                largeNumber = middleNumber;
            } else if (searchIn[middleNumber] < toBeSearch) {
                smallNumber = middleNumber;
            }
        }
        return (-1);
    }
    private static int getMiddleNumber(int largeNumber, int smallNumber) {
        return (largeNumber + smallNumber) / 2;
    }
}
