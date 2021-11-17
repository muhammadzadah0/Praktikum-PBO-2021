package MINIGGU11.Tugas;

public abstract class Zombie implements IDestroyable{
    protected int health;
    protected int level;
    
    
    public abstract void heal();
    @Override
    public abstract void destroyed();
    public String getZombieInfo(){
     return "Health = "+health+"\nLevel = "+level+"\n";
    }
}
