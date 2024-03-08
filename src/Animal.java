class Animal {

    private String name;
    private static int weight;

    private static int numberOfAnimals = 0;

    Animal(){
        System.out.println("Animal constructor");
    }

    Animal(String name) {
        this.name = name;
        numberOfAnimals++;
    }

    Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
        numberOfAnimals++;
    }

    public void setName(String name){
        this.name = name;
    }

    public static int getNumberOfAnimals(){
        return numberOfAnimals;
    }
    public int getWeight(){
        return weight;
    }


    class Nested{
        void printAnimalName(){
            System.out.println("Nested class in Animal: " + name);
        }
    }
    static class NestedStatic {
        void printStatic() {
            System.out.println("Static nested class in Animal");
        }
    }

    public void localClassExample() {
        class Local {
            void printMessage() {
                System.out.println("Local class inside Animal " + name);
            }
        }
        Local local = new Local();
        local.printMessage();
    }

    interface Behavior {
        void action();
    }

    void performAction() {
        Behavior behavior = new Behavior() {
            @Override
            public void action() {
                System.out.println(name + " Anonimus");
            }
        };
        behavior.action();
    }
}
