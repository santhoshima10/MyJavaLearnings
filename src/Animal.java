public class Animal {

    int age;

    public Animal(){
        System.out.println("Animal is created with a name ");
    }

    public static void main(String[] args){

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for(int i =0; i < animals.length;i++){
            animals[i].makeNoise();
            animals[i].eat();
        }

    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void makeNoise(){
        System.out.println("Animal is making noise");
    }
}
