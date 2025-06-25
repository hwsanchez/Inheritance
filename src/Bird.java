//Child subclass: Bird extends Super: Animal
public class Bird extends Animal{

    public Bird(String name){
        super(name); //Calling the super constructor;
        System.out.println("Bird created!");
    }

    //Childclass overriding the Parentclass: eat()
    @Override
    public void eat() {
        super.eat();
        System.out.println(name + "The Bird is pecking at seeds!");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping: tweet, tweet, tweet!!!");
    }

    void fly() {
        System.out.println("Bird flying!");
    }
}
