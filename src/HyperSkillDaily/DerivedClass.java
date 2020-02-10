package HyperSkillDaily;

public class DerivedClass extends BaseClass {

    public DerivedClass(){
        System.out.println("Hello");
        //super();
    }

    @Override
    public void print(){
        System.out.println("DerivedClass");
        super.print();
    }

    public static void main(String[] args){
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.print();
    }
}
