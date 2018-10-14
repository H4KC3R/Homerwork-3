public class FibonachiSolver {

    public static void fibNum(int size) {

        int fibFirst, fibSecond, fibSum;
        fibFirst = 1;
        fibSecond = 1;
        for (int i = 0; i < size; i++)
        {
            fibSum = fibFirst + fibSecond;
            fibFirst = fibSecond;
            fibSecond = fibSum ;
            System.out.println(fibSum);
        }
    }
};
