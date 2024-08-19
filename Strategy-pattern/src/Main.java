//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] evenArray = new int[]{ 11, 23, 6, 2, 16, 4};
        int[] oddArray = new int[]{11, 23, 6, 2, 16};

        UseStrategy useStrategy1 = new UseStrategy(new BubbleSortStrategy());
        int[] result = useStrategy1.performStrategy(evenArray);

        for(int i = 0; i < evenArray.length; i++) {
            System.out.println(result[i]);
        }

        System.out.println();

        UseStrategy useStrategy2 = new UseStrategy(new SelectionSortStrategy());
        int[] result2 = useStrategy2.performStrategy(oddArray);

        for(int i = 0; i < oddArray.length; i++) {
            System.out.println(result2[i]);
        }
    }
}