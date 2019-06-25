package searcher;

import java.util.ArrayList;
import java.util.List;

public class Binary {
    public List<Searcher> searcherArrayList = new ArrayList<>();

    public void addSearcher(Searcher searcher){
        searcherArrayList.add(searcher);
    }

}
