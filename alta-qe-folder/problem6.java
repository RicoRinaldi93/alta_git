public class Main {
    private static void DrawXYZ(int n) {
        int bintang = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bintang = bintang + 1;

                if (bintang % 2 == 0)
                {System.out.print("Z ");}

                else if (bintang % 3 == 0)
                {System.out.print("X ");}

                else if (bintang % 2 != 0)
                {System.out.print("Y ");}
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
            DrawXYZ(3);
            DrawXYZ(5);
            DrawXYZ(1);
        }
}