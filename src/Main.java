public class Main {
    public static void main(String[] args) {

        int x = 50;
        multiploDi3e5(x);
    }
    public static void multiploDi3e5(int x){
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println(x +" è un multiplo di 3 e 5: FIZZBUZZ");
        } else if (x % 5 == 0) {
            System.out.println(x +" è un multiplo di 5: BUZZ");
        } else if (x % 3 == 0) {
            System.out.println(x +" è un multiplo di 3: FIZZ");
        } else if (x % 3 != 0 && x %5 != 0){
            System.out.println(x +" non è un multiplo di 3 o 5: ");
        }
    }
}

