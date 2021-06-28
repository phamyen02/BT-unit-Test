package techmaster.btvn1;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork {
    public void bai1() {
        Person p = new Person();
        ArrayList<Person> people = p.addPeople();
        HashMap<String, Integer> countPeople = new HashMap<>();
        for (Person person : people) {
            Integer count = countPeople.get(person.getNationality());
            if (count == null) {
                countPeople.put(person.getNationality(), 1);
            } else {
                countPeople.put(person.getNationality(), count + 1);
            }

        }
        System.out.println("1.1 Đếm số người theo từng quốc tịch in ra màn hình");
        for (Map.Entry<String, Integer> entry : countPeople.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //1.2 sort theo name in ra những ng >25 tuổi
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("1.2 - Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình");
        for (Person p1 : people) {
            if (p1.age > 25) {
                System.out.println(p1);
            }
        }
        System.out.println("1.4 In ra màn hình đánh giá tuổi mỗi người");
        for (Person p1 : people) {
            if (p1.age < 20) {
                System.out.println(p1 + "-" + "nổi loạn");
            }
            if (p1.age >= 20 && p1.age <= 30) {
                System.out.println(p1 + "-" + "việc làm");
            }
            if (p1.age > 31 && p1.age <= 40) {
                System.out.println(p1 + "-" + "sự nghiệp");
            } else {
                System.out.println(p1 + "-" + "hưởng thụ");
            }
        }

    }

    public void bai2() {
        Person p = new Person();
        ArrayList<Person> people = p.addPeople();
        HashMap<String, List<Person>> countPeople = new HashMap<>();
        for (Person person : people) {
            List<Person> count = countPeople.get(person.getNationality());
            List<Person> p1 = new ArrayList<>();
            if (count == null) {
                p1.add(person);
                countPeople.put(person.getNationality(), p1);
            } else {
                count.add(person);
                countPeople.put(person.getNationality(), count);
            }

        }
        System.out.println("1.3 Tính trung bình tuổi của người theo từng quốc gia");
        System.out.println("List người theo từng quốc tịch là:");
        for (Map.Entry<String, List<Person>> entry : countPeople.entrySet()) {
            //  System.out.println(entry.getKey() + ": " + entry.getValue());
            double sum = 0;
            for (Person person : entry.getValue()) {
                sum += person.age;
            }
            double avg = 10*sum / (entry.getValue().size());
            avg = (int) avg/10.0;
            System.out.println(entry.getKey() + ": " + "Tuoi trung bình: " + avg);
        }

    }

}
