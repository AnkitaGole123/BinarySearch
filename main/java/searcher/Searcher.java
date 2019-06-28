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


//    public List<Runner> runnerList = new ArrayList<>();
//
//    public void addRunner(Runner runner){
//        runnerList.add(runner);
//    }
//    public Runner getWinner(){
//        Comparator<Runner> comp = new Comparator<>() {
//            @Override
//            public int compare(Runner o1, Runner o2) {
//                return (int) (o1.finishTime - o2.finishTime);
//            }
//        };
//        Runner runner = Collections.min(runnerList, comp);
//        return runner;
//    }
//}
