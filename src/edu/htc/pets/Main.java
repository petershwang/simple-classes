package edu.htc.pets;

public class Main {

    public static void main(String[] args) {
        // Cat
        int i;
        Cat[] cats = new Cat[3];

        // 1. Can you create a cat without a name?  No-You must have arguments and can not skip name.
        // cats[0] = new Cat(,19);=> Does not work.  (illegal start of expression)
        // cats[0] = new Cat(); => Does not work. (found: no arguments)
        cats[0] = new Cat("Pretty", 5);
        cats[1] = new Cat("Molly", 17);
        cats[2] = new Cat("Spot", 2);

        System.out.println("Displaying Cat Information.");
        for (i=0 ; i<3 ; i++ ) {
            System.out.println("cats[" + i + "] row => Name = " + cats[i].getName() + ", CatAge= " + cats[i].getAge() + ", HumanAge= " + cats[i].getHumanAge());
        }

        
        
        // Dog
        

        Dog[] dogs = new Dog[3];

        // 2. Can you create a dog without giving a name.  No.  The same way Cat can't do it.  (No argument and illegal start of expression)

        // dogs[0] = new Dog(); Don't work.
        // dogs[0] = new Dog(,19); Don't work.


        dogs[0] = new Dog("Benji", 15);
        dogs[1] = new Dog("Jonny", 1);
        dogs[2] = new Dog("Max", 5);

        // 3. What happens if you put a dog in the cat array?  Does it compile?  Does the code run?
        // cats[0] = dogs[0];  No:  Dog can't be converted to Cat.  It does not compile.  The code does not run.


        System.out.println();
        System.out.println("Displaying Dog Information.");
        int j = 0;
        for(Dog d : dogs) {
            System.out.println("dogs[" + j + "] row => Name = " + dogs[j].getName() + ", DogAge= " + dogs[j].getAge() + ", HumanAge= " + dogs[j].getHumanAge());
            j++;
        }

        //4. What does the Cat or Dog object look like if you print it?
        // System.out.println(cats[0]); => edu.htc.pets.Cat@74a14482
        // System.out.println(dogs[0]); => edu.htc.pets.Dog@1540e19d
        System.out.println();
        System.out.println("Displaying Object itself.");
        System.out.println(cats[0]);
        System.out.println(dogs[0]);


    }
}
