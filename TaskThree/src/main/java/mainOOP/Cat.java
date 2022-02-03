package mainOOP;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public String getCatName(){
        return super.getName();
    }
}

class AnimalMain{
    public static void main(String[] args) {
        Cat cat = new Cat("Mushu");
        System.out.println(cat.getCatName());
    }
}