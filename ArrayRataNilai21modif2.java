import java.util.Scanner;

public class ArrayRataNilai21modif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0, total1=0, total2=0;
        double rata2, lulus, tidakLulus ;
        int  counter=0, counter1=0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+":");
            nilaiMhs[i] =sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70){
                total1+= nilaiMhs[i];
                counter++;
                
            } else {
                total2+=nilaiMhs[i];
                counter1++;
            }
        }
        
        lulus = total1/counter; 
        System.out.println("Rata-rata nilai lulus :"+ lulus);
        tidakLulus = total2/counter1;
        System.out.println("Rata-rata nilai yang tidak lulus :"+tidakLulus);
        rata2= total/nilaiMhs.length;
        System.out.println("Rata-rata nilai ="+rata2);
    
    }
}
