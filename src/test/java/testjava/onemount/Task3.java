package testjava.onemount;

import java.util.Scanner;

public class Task3 {
    String s = "";

    public String readString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your text: ");
        s = input.nextLine();
        return null;
    }

    public String upperCaseString(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] array = s.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            String temp = String.valueOf(array[i].charAt(0));
            output.append(temp.toUpperCase() + array[i].substring(1));
            output.append(" ");
        }
        return output.toString().trim();
    }
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.readString();
        String s = task3.upperCaseString(task3.s);
        System.out.println("After changing: " + s);

    }

}
