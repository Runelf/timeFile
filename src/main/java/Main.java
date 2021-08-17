import com.github.javafaker.Faker;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        String firstName = "Абракадабра";
//        String secondName = "Барабака";
//        constructHelloSentence(firstName);
//        constructHelloSentence(firstName, secondName);
        int a = 2;
        add(a);



//        for (int i = 0; i < 10; i++) {
//            String y = generateName();
//            System.out.println(y);
//            split(y);
//        }
    }

    public static void split(String y) {
        String[] words = y.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String generateName() {
        Faker faker = new Faker(new Locale("ru"));
        String x = faker.name().fullName();
        return x;
    }

    public static String constructHelloSentence(String name) {
        String resultSentence = "Hello world! My name is " + name;
        System.out.println(resultSentence);
        return resultSentence;
    }

    public static String constructHelloSentence(String firstName, String secondName) {
        String resultSentence = "Hello " + firstName + "! My name is " + secondName;
        System.out.println(resultSentence);
        return resultSentence;
    }

    public static void add (int a) {
        a = a*2;
        System.out.println(a);
    }

}

