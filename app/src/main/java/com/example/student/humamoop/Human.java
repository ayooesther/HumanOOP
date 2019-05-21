package com.example.student.humamoop;

import android.util.Log;

public class Human{

    private String name;
    public int weight;
    public int age;


    public Human(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public void eat(){
       Log.d("Human","Iam eating");
   }
   public void  sleep(){
        Log.d("Human","zzzzzzzzzzzzzzzzzzzzz");
   }
   public void  sleep(int hours){
        Log.d("Human","Iam sleeping for" + hours + "hours");

   }
   public void speak(String speech){
        Log.d("Human",speech);
   }
   public void birthday(){
        int age = getAge();
        age = age+1;
        setAge(age);

   }


}


