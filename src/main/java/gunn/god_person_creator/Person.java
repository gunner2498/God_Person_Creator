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
    private int age;
    private double height;
    private String job;
    private double weight;
    private String education;
    private boolean devAccess = false;

    public Person() {
       
   }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getJob() {
        return job;
    }

    public double getWeight() {
        return weight;
    }

    public String getEducation() {
        return education;
    }

    public void setName(String nName) {
        name = nName;
    }

    public void setAge(int nAge) {
        age = nAge;
    }

    public void setHeight(double nHeight) {
        height = nHeight;
    }

    public void setJob(String nJob) {
        job = nJob;
    }

    public void setWeight(double nWeight) {
        weight = nWeight;
    }

    public void setEducation(String nEducation) {
        education = nEducation;
    }
    
    public boolean accessLocked() {
       return devAccess;
   }

}
