public class Bird extends Animal{

    public Bird(){
        this.species = "Bird";
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Chirp Chirp");
    }

}