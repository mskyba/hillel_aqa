public class Dog {

   private String name;
   protected int age;

    Dog(){
        System.out.println("Dog constructor");
    }

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setNameForDog(String name){
        this.name = name;
    }

    String getDogsName(){
        return name;
    }
    static class DogName{
        void printStaticName(){
            System.out.println("Dog's static class");
        }
    }

}
