public class Dog extends Animal {

    public Dog(){

        this.age = 9;
        System.out.println("Dog is created");
    }

    public static void main(String[] args){

        Dog dog = new Dog();

        // we can generalize the sub class to the super class but will have access to the
        Animal a = new Dog();


    }
    @Override
    public void makeNoise(){
        System.out.println("Woof Woof");
    }


}
