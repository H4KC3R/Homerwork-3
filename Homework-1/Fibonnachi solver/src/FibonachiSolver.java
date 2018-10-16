public class FibonachiSolver {

    public static long calculate(long number) {

        long first, second, sum = 0;
        first = 1;
        second = 1;
        for (int i = 0; i < number; i++)
        {
            sum = first + second;
            first = second;
            second = sum ;
        }
	return sum;
    }
};
