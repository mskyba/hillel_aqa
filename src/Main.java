import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal dog = new Animal("Tyz");
        Animal cat = new Animal("Yura",12);
        dog.setName("chelik");
        System.out.println(dog.getWeight());
        System.out.println("Number of animals: " + Animal.getNumberOfAnimals());

        Animal.Nested nested = dog.new Nested();
        nested.printAnimalName();
        Animal.NestedStatic nestedStatic = new Animal.NestedStatic();
        nestedStatic.printStatic();
        dog.localClassExample();
        cat.performAction();
        Cat catCat = new Cat();
        catCat.setName("Myrzik");
        catCat.setAge(21);
        catCat.setId(10);
        System.out.println("Cat's name: " + catCat.getName()+ " --> " + "Cat's age: " + catCat.getAge()+ " --> " + "Cat's id: " + catCat.getId());

        Dog doggy = new Dog("Kek", 1);
        System.out.println(doggy.getDogsName());
        doggy.setNameForDog("sobaka");
        System.out.println("After name was reassigned: " + doggy.getDogsName());
        Dog.DogName woofWoof = new Dog.DogName();
        woofWoof.printStaticName();


    }
}