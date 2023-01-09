public class Main {
    public static void main(String[] args) {

        jumlah Perjumlahan = new jumlah(3,4);
        System.out.println("Perjumlahan : " + Perjumlahan.hitungjumlah());

        kurang Pengkurangan = new kurang (15,4);
        System.out.println("Pengkurangan : " + Pengkurangan.hasilKurang());

        kali Perkalian = new kali(10,10);
        System.out.println("Perkalian : " + Perkalian.totalkali());

        bagi Pembagian = new bagi(12,3);
        System.out.println("Pembagian : " + Pembagian.hasilBagi());

    }
}