package Tugas;

public class GajiKaryawan {
    public static long hitungBonus(int indeks, int jamKerja){
        long gajiKaryawan = 1000000;
        long bonusKaryawan = 0;
        if(indeks > 9){
            if(jamKerja > 40){
                bonusKaryawan = gajiKaryawan * 2;
                System.out.println(bonusKaryawan);
            }else if(jamKerja >= 35 && jamKerja == 40){
                bonusKaryawan = gajiKaryawan * (1/2);
                System.out.println(bonusKaryawan);
            }
        }
        return bonusKaryawan;
    }

    public static void main(String[] args) {
        hitungBonus(10,50);
    }
}