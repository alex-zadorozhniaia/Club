import java.util.Scanner;


abstract class Hero {

    public static String name;
    ;
    public String getName(){
        return name;
    }
    static int damageTake;
     static void attackEnemy(String action){
         damageTake = 20;
        if(action == "attack"){
            System.out.println(name + " attack " + damageTake);
        }else{
            System.out.println("Error!");
        }
    }
}
class  Warrior extends Hero{
    static int damageTake;
    static void attackEnemy(String action){
        damageTake = 15;
        if(action == "attack"){
            System.out.println("Warrior" + " attack " + damageTake);
        }else{
            System.out.println("Error!");
        }
    }
}
class  Mage extends Hero{
    static int damageTake;
    static void attackEnemy(String action){
         damageTake = 12;
        if(action == "attack"){
            System.out.println("Mage" + " attack "+ damageTake);
        }else{
            System.out.println("Error!");
        }
    }
}
class  Archer extends Hero{
    static int damageTake;
    static void attackEnemy(String action){
         damageTake = 18;
        if(action == "attack"){
            System.out.println("Archer" + " attack " + damageTake);
        }else{
            System.out.println("Error!");
        }
    }
}
class Enemy implements Mortal{
    static int health;
    public void getHealth(int health){
        this.health = health;
    }
    public int setHealth(){
        return health;
    }
    public static void takeDamage(){
        int damage = 0;
        damage += Hero.damageTake + Warrior.damageTake + Mage.damageTake + Archer.damageTake;
        health -= damage;
        System.out.println("Enemy health's before attack " + health);
    }


    @Override
    public void isAlive() {
        boolean g = true;
        if(health > 0){
            g = true;
        }else{
            g = false;
        }
    }
}
interface Mortal {
    public void isAlive();
}
class BattleGround{
    public static void main(String[] args) {

    }
}
class TrainingGround{
     public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please, write a name");
        Hero.name = scan.next();
        System.out.println("Please, write name the hero");
        Hero.attackEnemy("attack");
        Warrior.attackEnemy("attack");
        Mage.attackEnemy("attack");
        Archer.attackEnemy("attack");
        Enemy.health = TrainingGround.scan.nextInt();
        Enemy.takeDamage();
    }
}
