package SD.modul1;

public class Hidangan {
    protected String namaHidangan;

    public String getNamaHidangan(){
        return namaHidangan;
    }

    public void setNamaHidangan(String namaHidangan){
        this.namaHidangan = namaHidangan;
    }

    public String disantap(){
        return "Makanan Dihidangkan";
    }
}