package SD.modul1;

import SD.modul1.Hidangan;

public class Makanan extends Hidangan {
    public String disantap(){
        return this.getNamaHidangan() + " dimakan";
    }
}