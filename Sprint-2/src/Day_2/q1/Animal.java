package Day_2.q1;

public abstract class Animal {

    void eat() throws AnimalException{
        System.out.println("inside eat of animal class");
    }
    public Animal() throws AnimalException{

    }
}

class AnimalException extends Exception{

}

class Tiger extends Animal{

    public Tiger() throws AnimalException {

    }

    @Override
    void eat() throws AnimalException {
        System.out.println("Tiger is eating !!");
    }

    public static void main(String[] args) {

        try {
            Animal a1 = new Tiger();
            a1.eat();
        } catch (AnimalException e) {
            throw new RuntimeException(e);
        }
    }
}
