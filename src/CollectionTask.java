import java.util.*;

public class CollectionTask {


    static ArrayList<Integer> generateArrayList() {

        return new ArrayList<>();
    }

    static ArrayList<Integer> arrayListWithRandomFillingIn(ArrayList<Integer> arrayList) {
        int min = -10;
        int max = 10;
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Random().nextInt((max - min + 1) + min));
        }
        System.out.printf("Task 2: Fill in collection with random numbers:  %s", arrayList);
        System.out.println();
        return arrayList;
    }

    static ArrayList<Integer> createCopyArrayList(ArrayList<Integer> arrayList) {

        return new ArrayList<Integer>(arrayList);
    }

    static ArrayList<Integer> createCopyArrayListSecond(ArrayList<Integer> arrayList) {
        return (ArrayList<Integer>) new ArrayList<>(arrayList).clone();
    }

    static ArrayList<Integer> createCopyArrayListThird(ArrayList<Integer> arrayList) {

        ArrayList<Integer> copyArrayList = new ArrayList<>();
        copyArrayList.addAll(arrayList);
        return copyArrayList;
    }

    static Set<Integer> createSet(ArrayList<Integer> arrayList) {
        return new TreeSet<>(arrayList);
    }

    static ArrayList<Integer> sortCollection(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }

    static Integer minValCollection(ArrayList<Integer> arrayList) {
        return Collections.min(arrayList);
    }

    static Integer maxValCollection(ArrayList<Integer> arrayList) {
        return Collections.max(arrayList);
    }

    static Integer sumElemCollection(ArrayList<Integer> arrayList) {
        return arrayList.stream().mapToInt(Integer::intValue).sum();
    }

    static ArrayList<Integer> onlyPositiveNumbers(ArrayList<Integer> arrayList) {
        ArrayList<Integer> positiveList = new ArrayList<>();
        for (Integer number : arrayList) {
            if (number > 0) {
                positiveList.add(number);
            }
        }
        return positiveList;
    }

    static int frequencyOfSpecNumber(ArrayList<Integer> arrayList) {
        return Collections.frequency(arrayList, 9999999);
    }
    static ArrayList<Integer> reversedCollection(ArrayList<Integer> arrayList) {
        ArrayList<Integer> reversed = new ArrayList<>(arrayList);
        Collections.reverse(reversed);
        return reversed;
    }

    static ArrayList<Integer> swappingElems(ArrayList<Integer> arrayList) {
        Integer sizeOfArr = arrayList.size();
        Integer getFirsElem = arrayList.get(0);
        arrayList.set(0, arrayList.get(sizeOfArr -1));
        arrayList.set(sizeOfArr-1, getFirsElem);
        return arrayList;
    }

    static Integer secondMaxValCollection(ArrayList<Integer> arrayList) {
        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for (Integer number : arrayList){
            if(number > largest){
                secondLargest = largest;
                largest = number;
            }
            else if (number > secondLargest && !number.equals(largest)) {
                secondLargest = number;
            }
        }
        return secondLargest;

    }

    static boolean containsElemInCollection(ArrayList<Integer> arrayList) {
        Integer value = 9999999;
        boolean isContainsValue = arrayList.contains(value);
        return isContainsValue;
    }

    static boolean isPalindrome(ArrayList<Integer> arrayList) {

        ArrayList<Integer> reversedArrayList = new ArrayList<>(arrayList);
        Collections.reverse(reversedArrayList);
        return arrayList.equals(reversedArrayList);
    }


    /// i'm not certainly sure about next task solving
    static long selectRandomElement100000(ArrayList<Integer> arrayList) {
        Random random = new Random();
        long start = System.currentTimeMillis();
        int max = arrayList.size();

        for (int i = 0; i < 100000; i++) {
            int randomNumber = random.nextInt(max);
            arrayList.get(randomNumber);
        }

        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {

        ArrayList<Integer> myArrayTask1 = generateArrayList();
        System.out.println("Task 1: create empty collection цілих numbers " + myArrayTask1);

        ArrayList <Integer> arrayList = arrayListWithRandomFillingIn(myArrayTask1);

        ArrayList<Integer> firstCopy = createCopyArrayList(arrayList);
        System.out.println("Task 3: create a copy of previous array via reference" + firstCopy);

        ArrayList<Integer> secondCopy = createCopyArrayListSecond(arrayList);
        System.out.println("Task 3.1: Creating array copy via cloning" + secondCopy);

        ArrayList<Integer> thirdCopy = createCopyArrayListThird(arrayList);
        System.out.println("Task 3.2: Creating array copy via add() method" + thirdCopy);

        arrayList.add(9999999);
        arrayList.add(9999999);
        arrayList.add(9999999);
        System.out.println(arrayList);
        System.out.println(firstCopy);
        System.out.println(secondCopy);
        System.out.println(thirdCopy);


        System.out.println("Task 4: Creating set " + createSet(arrayList));

        System.out.println("Task 5: Sorting collection " + sortCollection(arrayList));

        System.out.println("Task 6.1: Min value in collection: " + minValCollection(arrayList));
        System.out.println("Task 6.2: Max value in collection: " + maxValCollection(arrayList));

        System.out.println("Task 7: sum up collection: " + sumElemCollection(arrayList));


        System.out.println("Task 8: only positive numbers: " + onlyPositiveNumbers(arrayList));

        System.out.println("Task 9: Array contains entered value? - " + containsElemInCollection(arrayList));

        System.out.println("Task 10: Count of specific nubmer in array: " + frequencyOfSpecNumber(arrayList));

        System.out.println("Task 11: Reversed collection: " + reversedCollection(arrayList));

        System.out.println("//////// Array list for easier comparison for next task: " + arrayList); // added for easier comparison of arrays in next println

        System.out.println("Task 12: Swapped elements first to last: " +  swappingElems(arrayList));

        System.out.println("Task 13: Second max value in collection: " +  secondMaxValCollection(arrayList));

        ArrayList<Integer> checkingArray = new ArrayList<>();
        checkingArray.add(0);
        checkingArray.add(1);
        checkingArray.add(0);
        System.out.println("Task 14: is palindrome: " + isPalindrome(checkingArray));

        long elapsedTime = selectRandomElement100000(arrayList);
        System.out.println("Task 15: Time spent: " + elapsedTime + " milliseconds");


    }


}