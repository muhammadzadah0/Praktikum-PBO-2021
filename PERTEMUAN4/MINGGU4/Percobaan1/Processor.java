
package MINGGU4.Percobaan1;

public class Processor {
    private String merk;
    private double cache;
    
    Processor(){
    
    }
    
    Processor(String merk, double cache){
    this.merk = merk;
    this.cache = cache;        
    }
    
    public void setMerk(String newMerk){
        merk = newMerk;
    }
    public void setCache(double newCache){
        cache = newCache;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public double getCache(){
        return cache;
    }
    
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
