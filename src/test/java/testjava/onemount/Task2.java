package testjava.onemount;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * There is a Cat class with a String variable name, int variable age.
 * <p>
 * Create a Map<Integer, Cat> and add 10 cats represented by (index, Cat) pairs.
 * <p>
 * Get a Set of all cats from the Map and display it on the screen.
 * <p>
 * Requirements
 * •The program must not read data from the keyboard.
 * •The createMap method must create a new HashMap<Integer, Cat> object.
 * •The createMap method must add 10 cats to the map, represented by (index, Cat) pairs.
 * •The createMap method must return the created map.
 * •The convertMapToSet method must create and return the set of cats retrieved from the passed map.
 * •The program must display name and age each cats in the set.
 */

public class Task2 {
    private String name;
    private int age;

    public Task2(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Map<Integer, Task2> createMap() {
        Map<Integer, Task2> catMap = new HashMap<>();
        String[] catNumbers = {"Cat 1", "Cat 2", "Cat 3", "Cat 4", "Cat 5", "Cat 6", "Cat 7", "Cat 8", "Cat 9", "Cat 10"};
        for (int i = 0; i < catNumbers.length; i++) {
            String name = catNumbers[i];
            catMap.put(i, new Task2(name, i));
        }
        return catMap;
    }

    public static Set<Task2> convertMapToSet(Map<Integer, Task2> map) {
        return new HashSet<>(map.values());
    }

    public static void printCats(Set<Task2> cats) {
        cats.forEach(cat -> {
            System.out.println("Cat name: " + cat.getName());
            System.out.println("Cat age: " + cat.getAge());
        });
    }

    public static void main(String[] args) {
        Map<Integer, Task2> catMap = createMap();
        Set<Task2> cats = convertMapToSet(catMap);
        printCats(cats);
    }


}

