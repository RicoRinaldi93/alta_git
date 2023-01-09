public class Main {
    public static void main(String[] args) {
        int bilangan = 6;
        int i = 1;
        while (i <= bilangan) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}