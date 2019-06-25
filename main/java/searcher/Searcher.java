package searcher;

public class Searcher implements Comparable{
    public Searcher(int searchIn) {
       this.searchIn = searchIn;
    }
    public int searchIn;
    public static void search(Searcher searchIn){
        System.out.println("this works");
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
