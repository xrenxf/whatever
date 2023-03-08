package PBO.modul4C2;

public class Assassin extends Hero implements CriticalDamage{
    //constructor
    Assassin(int Level){
        super.LifeStatus = true;
        super.HealthPoint = 3000;
        super.Defense = 300;
        super.AttackDamage = 800;

        super.Level = Level;

        if(this.Level > 0){
            for(int i = 0; i < this.Level; i++){
                super.HealthPoint += 90;
                super.Defense += 15;
                super.AttackDamage += 30;
            }
        }
        this.AttackDamage += this.AttackDamage * BonusDamage;
    }

    @Override
    public void SpawnIntro(){
        System.out.println("The shadow will pierce you");
    }
}