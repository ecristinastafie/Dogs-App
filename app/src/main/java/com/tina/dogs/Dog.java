package com.tina.dogs;

import java.io.Serializable;

/**
 * Created by Tina on 23/10/2017.
 * THE DOG BLUEPRINT
 */

public class Dog implements Serializable {

    private String mName;
    private int mAge;
    private String mBreed;

    public Dog (String name, int age, String breed ) {

        mName = name;
        mAge = age;
        mBreed = breed;
    }

        public String getName() {return mName;}
        public int getAge () {return mAge;}
        public String getBreed () {return mBreed;}
}
