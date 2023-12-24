public class Main {
    public static void main(String[] args) {
        Muhoboika Voloda = new Muhoboika(3, 5,8);
        Romashka Katya = new Romashka(10, 8, 9);
        Voloda.Grow(6,8);
        Katya.Grow(5,4);
        System.out.println("Implemented interfaces");
        Katya.Print();
        Voloda.Print();
        System.out.println("Katya & Voloda method");
        Katya.IfFlowerCanReproduce();
        Katya.IfLeafCanDry();
        Voloda.IfFlowerCanReproduce();
        Voloda.IfLeafCanDry();
    }
}