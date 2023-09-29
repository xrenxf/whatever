package PBO.modul4C2;

//abstract class
public abstract class Hero {
    double HealthPoint, AttackDamage, Defense;
    int Level;
    boolean LifeStatus;

    //method concrete
    public void Attack(Hero Target){
        Target.ReviewDamage(this.AttackDamage);
    }

    public void ReviewDamage(double Damage){
        double RealDamage = Damage - this.Defense;
        this.HealthPoint -= RealDamage;
        if(this.HealthPoint <= 0){
            this.LifeStatus = false;
        }
    }

    public void CheckStatus(){
        System.out.println("Level : " + this.Level);
        System.out.println("Health Point: " + this.HealthPoint);
        System.out.println("Attack Damage : " + this.AttackDamage);
        System.out.println("Defense : " + this.Defense);
        System.out.println("Life Status : " + this.LifeStatus);
    }

    //abstract method
    public abstract void SpawnIntro();
}