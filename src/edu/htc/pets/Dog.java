package edu.htc.pets;

/**
 *
 * Simple Dog class.
 *
 * Dogs have a name and age.  
 * There is also a function to calculate their human age.
 */
public class Dog {
    private String name;  // Define name as private instance
    private int age;      // Define age

    public Dog(String name, int age) {
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
        if (age < 2 ) {
            humanAge = age * 10.5;
        } else {
            humanAge = 21;

            humanAge += 4 * age;
        }

        return humanAge;
    }
}




