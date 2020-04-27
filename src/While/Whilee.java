package While;

public class Whilee {
    public static void main(String[] args) {
        int IsiBensin = 0;
        double Full = 3;

        System.out.println("Isi Bensin Sekarang : " + IsiBensin + " liter");
        System.out.println("Isi Bensin Ketika Full : " + Full + " liter");

        while(IsiBensin != Full){
            IsiBensin++;
            System.out.println("Sedang mengisi Bensin..");
            System.out.println("Isi Bensin Sekarang : " + IsiBensin + " liter");
        }

        System.out.println("Akhirnya: Isi Bensin Sekarang : " + IsiBensin + " liter");
    }
}


