package Array;

public class Array2dimensi {
    public static void main(String[] args) {
        // membuat variabel array
        String[][] laptop = { {"Macbook Pro 2019","29.000.000"},{"Acer Predator Triton 300","15.000.000"},{"ASUS ROG STRIX III","15.500.000"},{"Lenovo Legion Y530","10.500.000"},
        };
        //cetak data array
        for(int x=0; x< laptop.length; x++){
            System.out.println("merek : "+ laptop[x][0]);
            System.out.println("merek : "+ laptop[x][1]);
            System.out.println("--------------------------");

        }
    }
}

