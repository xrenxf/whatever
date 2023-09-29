package PBO.modul4C2;

public class Tank extends Hero{
    //constructor
    Tank(int Level){
        super.LifeStatus = true;
        super.HealthPoint = 7000;
        super.Defense = 500;
        super.AttackDamage = 500;

        super.Level = Level;

        if(this.Level > 0){
            for(int i = 0; i < this.Level; i++){
                super.HealthPoint += 200;
                super.Defense += 15;
                super.AttackDamage += 20;
            }
        }
    }
    @Override
    public void SpawnIntro(){
        System.out.println("A real man never hides in the bush");
    }
}