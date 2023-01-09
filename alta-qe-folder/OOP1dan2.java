public class Main {
    public static void main(String[] args) {

        System.out.println("soal No. 1");

        System.out.println("luas");

        persegi persegi1 = new persegi(4,4);
        System.out.println ("Persegi : "+ persegi1.hitungSisi());

        Segitiga segitiga1 = new Segitiga(3,4);
        System.out.println ("Segitiga : "+ segitiga1.hitungLuas());

        persegiPanjang persegiPanjang1 = new persegiPanjang(7,8);
        System.out.println ("Persegi Panjang : "+ persegiPanjang1.hitungluaspersegipanjang());

        System.out.println("Keliling : ");

        kelilingPersegi hasilKelilingPersegi = new kelilingPersegi(4, 4);
        System.out.println("Persegi : " + hasilKelilingPersegi.hitungKelilingPersegi());

        luasSegitiga hasilluasSegitiga = new luasSegitiga(3,4);
        System.out.println("Segitiga : " + hasilluasSegitiga.hitungKelilingSegitiga());

        kelilingPersegiPanjang hasilKelilingPersegiPanjang = new kelilingPersegiPanjang(7,8);
        System.out.println("PersegiPanjang : " + hasilKelilingPersegiPanjang.hitungKelilingPersegiPanjang());

        System.out.println("Soal No. 2");

        volumeKubus hasilKubus = new volumeKubus(10,10,10);
        System.out.println("Volume : " + hasilKubus.hitungVolumeKubus());

        volumeTabung volumeTabung1 = new volumeTabung(3.14,7,10);
        System.out.println("volume tabung : " + volumeTabung1.rumusVolumeTabung());

        volumeBalok volumeBalok1 = new volumeBalok(3, 6, 10);
        System.out.println("volume balok : " + volumeBalok1.rumusVolumeBalok());

    }
}