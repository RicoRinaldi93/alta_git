public class Main {
    private static boolean palindrome (String value) {
        String original = value;
        String reverse = "";
        for (int i = original.length() -1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        for (int i = 0; i < original.length(); i++){
            if (original.charAt(i) != reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasurusak"));
        System.out.println(palindrome("kupukupu"));
        System.out.println(palindrome("lion"));
    }
}