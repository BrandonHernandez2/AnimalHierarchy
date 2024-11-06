public class Mammal extends Animal{
    public Mammal(){
        this.species = "Mammal";
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Some mammal sound");
    }
}