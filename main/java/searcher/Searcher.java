package searcher;

public class Searcher implements Comparable{
    public Searcher(int searchIn) {
       this.searchIn = searchIn;
    }
    public int searchIn;

    @Override
    public int compareTo(Object o) {
        return searchIn;
    }
}


