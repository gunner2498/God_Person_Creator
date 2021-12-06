/*
Name; Gavin Gunn
Class; Grade 12 Com Studies
Date; 01/12/21
Assignment#; 3
Description; Person Object
 */
package gunn.god_person_creator;

public class Person {

   
    
    
    private String name;
    private String classPlayer;
    private int strength;
    private int magic;
    private int intelligence;
    private int speed;
    private boolean devAccess;
    

    
       //Person= combo
    public Person (String N, String C, int S,int M,int I,int F)      
    {
        setName(N);
        setClassPlayer(C);
        setStrength(S);
        setMagic(M);
        setIntelligence(I);
        setSpeed(F);
   }
    
    public String getName() {
        return name;
    }

    public String getClassPlayer() {
        return classPlayer;
    }

    public int getStrength() {
        return strength;
    }

    public int getMagic() {
        return magic;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setClassPlayer(String newClassPlayer) {
        classPlayer = newClassPlayer;
    }

    public void setStrength(int newStrength) {
        strength = newStrength;
    }

    public void setMagic(int newMagic) {
        magic = newMagic;
    }

    public void setIntelligence(int newIntelligence) {
        intelligence = newIntelligence;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
    
    public boolean accessLocked() {
       return devAccess;
   }

    
    
    
    
}
