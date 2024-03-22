public class Main {
    public static void main(String[] args) {
        int array[] = new int[]{0,1,23};

        try {
            int number = givingNumberTwo();
            if (number > 0){
                System.out.println("'If' with my exception"); // just added for test is it condition reachable
                throw new MyException("My exception added");
            }
        }
        catch (MyException exception){
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(array[3]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array length " + array.length + " --> Set other value!");
        }

        boolean isItRaining = false;
        try {
            if (isItRaining == false) {
                throw new RuntimeException("It's not raining!", new RuntimeException()); // I'm really creative person, sorry
            }
        } catch (RuntimeException exception) {
            System.out.println("Added exception");
            exception.getMessage();
            System.out.println(exception);
            isItRaining = true;
        } finally {
            System.out.println("Finally block added and is it raining now? : "+ isItRaining);

        }
    }

    public static int givingNumberTwo(){
        return 2;
    }
}