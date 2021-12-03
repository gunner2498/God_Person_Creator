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
    

    public Person() { //Default positions
       
       
    
    name = " ";
    classPlayer = " ";
    strength = 0;
    magic = 0;
    intelligence = 0;
    speed = 0;
    devAccess = false;   
     
       
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

    public void setHeight(int newStrength) {
        strength = newStrength;
    }

    public void setJob(int newMagic) {
        magic = newMagic;
    }

    public void setWeight(int newIntelligence) {
        intelligence = newIntelligence;
    }

    public void setEducation(int newSpeed) {
        speed = newSpeed;
    }
    
    public boolean accessLocked() {
       return devAccess;
   }

    
    
    
    
}
