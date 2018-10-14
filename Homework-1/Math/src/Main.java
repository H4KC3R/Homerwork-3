public class Main {
    public static void main(String[] args) {
        int i = 5;
        int[] mice = { 4, 8, 10, 12, 16 };
        int[] cats = { 10, 8, 10, 12, 16 };
        int[] dogs = { 10, 8, 10, 16, 10 };
        Math.fromDecToBin(i);
        Math.inOrder(mice);
        Math.inOrder(cats);
        Math.inOrder(dogs);
        System.out.println(Math.factCycle(i));
        System.out.println(Math.factRec(i));
    }
}