public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int temp1, temp2;

        temp1 = a; a = c; temp2 = b; b = temp1; c = temp2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}