public class UseStrategy {
    private MyStrategy myStrategy;

    public UseStrategy(MyStrategy strategy) {
        this.myStrategy = strategy;
    }

    public int[] performStrategy(int[] arr) {
        return myStrategy.sortArray(arr);
    }
}


