package MINIGGU11.Tugas;

public class Barrier implements IDestroyable{
   private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
     strength  *= 0.9;
    }
   public String getBarrierInfo(){
   return "Barrier Strength = " +strength+"\n"; 
   }
}
