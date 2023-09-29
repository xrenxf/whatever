package SD.modul1;

import SD.modul1.Hidangan;

public class Minuman extends Hidangan {
    public String disantap(){
        return this.getNamaHidangan() + " diminum";
    }
}