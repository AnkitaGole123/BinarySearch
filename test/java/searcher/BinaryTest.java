package searcher;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BinaryTest {
    @Test
    public void NumberDoesNotExist() {
        List<Integer> searchIn = Arrays.asList(1, 3, 4, 6, 7, 11, 14, 22);
        int expected = -1;
        assertEquals(expected, BinarySearch.findElement(9, searchIn, 8, 0));
    }

    @Test
    public void StringIsExist() {
        List<String> searchIn = Arrays.asList("a", "b", "d", "p", "q", "r", "w");
        int expected = 5;
        assertEquals(expected, BinarySearch.findElement("r", searchIn, 7, 0));
    }

    @Test
    public void DoubleIsExist() {
        List<Double> searchIn = Arrays.asList(10.5, 20.5, 30.5, 40.5);
        int expected = 2;
        assertEquals(expected, BinarySearch.findElement(30.5, searchIn, 4, 0));
    }

    @Test
    public void singleElement() {
        List<Double> searchIn = Arrays.asList(30.5);
        int expected = 0;
        assertEquals(expected, BinarySearch.findElement(30.5, searchIn, 1, 0));
    }
    @Test
    public void objectElement() {
        List<Searcher> search = new ArrayList<>();
        Searcher searcher1 = new Searcher(1);
        search.add(searcher1);
        assertEquals(0, BinarySearch.findElement(searcher1, search, 1, 0));
    }
    @Test
    public void objectMultipleElement() {
        List<Searcher> search = new ArrayList<>();
        Searcher searcher1 = new Searcher(1);
        Searcher searcher2 = new Searcher(2);
        Searcher searcher3 = new Searcher(3);
        Searcher searcher4 = new Searcher(4);
        search.add(searcher1);
        search.add(searcher2);
        search.add(searcher3);
        search.add(searcher4);
        assertEquals(2, BinarySearch.findElement(searcher3, search, 4, 0));
    }
}

