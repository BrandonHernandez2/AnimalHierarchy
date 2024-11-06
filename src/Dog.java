public class Dog extends Mammal{

    public Dog(){
        this.species = "Dog";
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Woof Woof");
    }
}
