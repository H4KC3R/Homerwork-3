public class Math
{
    public static void fromDecToBin(int decnum)
    {
        System.out.println(Integer.toString(decnum, 2));
    }
    public static void inOrder (int[] a)
    {
        int i ;
        for ( i=1; i < a.length; i++)
            if (a[i-1] > a[i])
                break;
            if (a.length == i )
            {
                System.out.println("Massive is sorted");
            }
            else
                {System.out.println("Massive is not sorted"); }
    }
    public static long factCycle (int cycnum)
    {
        int i = 1;
        long factcyc = 1;
        for(;i<=cycnum;i++)
        {
            factcyc *= i;
        }
        return factcyc;
    }
    public static long factRec (int renum)
    {
        if (renum < 0) throw new IllegalArgumentException("Wrong argument,please try to write non-negative number")
        if (renum == 0 || renum == 1 )
            return 1;
        return renum * factRec(renum-1);
    }

}

