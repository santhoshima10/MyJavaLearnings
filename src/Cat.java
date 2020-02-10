public class Cat extends Animal {

    public Cat(){
      System.out.println("Cat is created");
    }
    @Override
    public void makeNoise(){
        System.out.println("Meow Meow!!!");
    }
}
