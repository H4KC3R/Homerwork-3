public class FizBuz
{
    public static void fizzBuzz(int num)
    {
        if (num % 3 == 0)

            System.out.println("Fizz");

        else if (num % 5 == 0)

            System.out.println("Buzz");

        else if (num % 15 == 0)

            System.out.println("FizzBuzz");

        else

            System.out.println(num);

    }

};

