public class SayiSiralama {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;
        if ((a < b) && (a < c)) {
            System.out.println("A sayısı en küçüktür.");
        }
        else if ((b < c) && (b < a)) {
            System.out.println("B sayısı en küçüktür.");
        }
        else {
            System.out.println("C sayısı en küçüktür.");
        }
    }
}