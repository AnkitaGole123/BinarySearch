package searcher;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BinaryTest {
    @Test public void NumberDoesNotExist(){
        int[] searchIn = {1,3, 4, 6, 7, 11, 14, 22};
        int expected = -1;
        assertEquals(expected,BinarySearch.findNumberInList(9,searchIn));
    }
    @Test public void NumberExist(){
        int[] searchIn = {1,3, 4, 6, 7, 11, 14, 22};
        int expected = 2;
        assertEquals(expected,BinarySearch.findNumberInList(4,searchIn));
    }
}

