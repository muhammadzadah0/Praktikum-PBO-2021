package MINIGGU11.Tugas;

public class JumpingZombie extends Zombie{

    public JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
       switch(level){
             case 1 : health+= (health*30/100);
                    break;
             case 2 : health+= (health*40/100);
                    break;
             case 3 : health+= (health*50/100);
                    break;
         }
    }

    @Override
    public void destroyed() {
         health-= (health*10/100);
    }
     
    public String getZombieInfo(){
     return "Jumping Zombie Data\n"+ super.getZombieInfo();
    }
}
