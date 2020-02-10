package headFirst;

public class Hippo extends Animal {

    public Hippo(String name){
        super(name);
    }


    public static int getAge(){
        return 2;
    }

    public String getName(){
        return  "Hello Hippo";
    }

    public static void main(String[] args){
        Hippo hippo = new Hippo("Hippy");
        System.out.println(hippo.getName());
        System.out.println( hippo.getAge());

        Animal animal = new Hippo("Gippy");
        System.out.println(animal.getName());
        System.out.println( animal.getAge());
       // hippo.getAge();

        String name = "Test";
        char[] chars = name.toCharArray();

        for(int i = chars.length-1; i >= 0 ;i--){
            System.out.print(chars[i]);
        }

    }
}
