package edu.htc.pets;

/**
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */
// Define Class Cat
public class Cat {
    private String name;  // Define name as private instance
    private int age;      // Define age

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }



    public double getHumanAge() {
        double humanAge = 0;
        if (age == 1) {
            humanAge = 15;
        } else if (age == 2) {
            humanAge = 40;
        } else {
            humanAge = 40;
            humanAge += 4 * (age - 2);
        }

        return humanAge;
    }
    }



