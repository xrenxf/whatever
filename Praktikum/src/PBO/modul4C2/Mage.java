package PBO.modul4C2;

public class Mage extends Hero implements MagicalDamage{
    //constructor
    Mage(int Level){
        super.LifeStatus = true;
        super.HealthPoint = 2500;
        super.Defense = 200;
        super.AttackDamage = 700;

        super.Level = Level;

        if(this.Level > 0){
            for(int i = 0; i < this.Level; i++){
                super.HealthPoint += 85;
                super.Defense += 10;
                super.AttackDamage += 35;
            }
        }

        this.AttackDamage += this.AttackDamage * MagicBonusDamage;
    }

    @Override
    public void SpawnIntro(){
        System.out.println("Give life to magic, not magic to life");
    }
}