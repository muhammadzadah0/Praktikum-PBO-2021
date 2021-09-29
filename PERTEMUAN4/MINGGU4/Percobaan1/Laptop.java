
package MINGGU4.Percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;
    
    Laptop(){
    }
    
    Laptop(String merk, Processor proc){
    this.merk = merk;
    this.proc = proc;
    }
     public void setMerk(String newMerk){
        merk = newMerk;
    }
    public void setProc(Processor newProc){
        proc = newProc;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public Processor getProc(){
        return proc;
    }
    public void info(){
        System.out.println("Merk Laptop = "+merk);
        proc.info();
    }
}
