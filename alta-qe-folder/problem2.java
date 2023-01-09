public class Main {
    public static void main(String[] args) {
        int studentScore = 150;
        String predicate = "";
        if (studentScore >= 80 && studentScore <= 100){
            predicate = "Nilai A";
        } else if (studentScore >= 65 && studentScore <= 79) {
            predicate = "Nilai B+";
        } else if (studentScore >= 50 && studentScore <= 64) {
            predicate = "Nilai B";
        } else if (studentScore >= 35 && studentScore <= 49) {
            predicate = "Nilai C";
        } else if ( studentScore >= 0 && studentScore <= 34) {
            predicate = "Nilai D";
        } else if (predicate == null) {
        }
        System.out.println(predicate);

    }
}