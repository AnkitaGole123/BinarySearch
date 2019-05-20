package searcher;

public class BinarySearch {
    public static void main(String[] args) {
        int toBeSearched = Integer.parseInt(args[0]);
        int[] search = {1, 3, 4, 6, 7, 11, 14, 22};
        int largeNumber = search.length;
        int smalllNumber = 0;
        findingNumber(toBeSearched, search, largeNumber, smalllNumber);
    }

    public static int findingNumber(int toBeSearch, int[] searching, int largeNumber, int smallNumber) {
        for (int i = 0; i < searching.length; i++) {
            int middleNumber = gettingMiddleNumber(largeNumber, smallNumber);
            if (searching[middleNumber] == toBeSearch) {
                return (middleNumber);
            } else if (searching[middleNumber] > toBeSearch) {
                largeNumber = middleNumber;
            } else if (searching[middleNumber] < toBeSearch) {
                smallNumber = middleNumber;
            }
        }
        return (-1);
    }
    private static int gettingMiddleNumber(int largeNumber, int smallNumber) {
        return (largeNumber + smallNumber) / 2;
    }
}
