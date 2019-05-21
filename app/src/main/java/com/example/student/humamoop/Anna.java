package com.example.student.humamoop;

import android.util.Log;

public class Anna extends Human {
    private int height;
    public Anna(String name, int weight, int age) {
        super(name, weight, age);
    }

    public Anna(String name, int weight, int age, int height) {
        super(name, weight, age);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
      super.eat();
      int annasWeight=getWeight();
      annasWeight=annasWeight+2;
      setWeight(annasWeight);

    }

    @Override
    public void birthday() {
        int AnnasAge= getAge();
        AnnasAge=(AnnasAge)+4;
        setAge(AnnasAge);

    }
}
