package PBO.modul4B;

//inherit dan mplementasi interface
public class PC extends Komputer implements Keyboard {
    public void tekan_enter(){
        System.out.println("Keyboard PC : Tekan Enter . . .");
    }
}