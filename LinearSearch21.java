import java.util.Scanner;

public class LinearSearch21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       
        System.out.print("Masukkan jumlah elemen array :");
        int nilaiArray = sc.nextInt();

        int[] arrayInt = new int [nilaiArray];
        int key = 11;
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+(i)+":");
            arrayInt[i] = sc.nextInt();
        }
            System.out.print("Masukkan key yang akan di cari:");
            key = sc.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key){
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
                break;
            }  else {
                System.out.println("key tidak di temukan");
                break;
            }
            
        }
        
    }
}
