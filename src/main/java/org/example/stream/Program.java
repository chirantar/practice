package org.example.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Tanuj", "Gupta", 5000.0, Collections.unmodifiableList(Arrays.asList("Project1", "Project2"))));
        employees.add(new Employee("Nikhil", "Gupta", 6000.0, Collections.unmodifiableList(Arrays.asList("Project2", "Project3"))));
        employees.add(new Employee("Nhivam", "Nayak", 7000.0, Collections.unmodifiableList(Arrays.asList("Project1", "Project3"))));
    }

    public static void main(String[] args) {
//        employees.stream().forEach(x-> System.out.println(x.getLastName()));

//        List<String> names = employees.stream().map(Employee::getFirstName).collect(Collectors.toList());

        //filter

        List<Employee> filteredEmp = employees.stream().filter(x -> x.getFirstName().startsWith("N")).collect(Collectors.toList());

//        System.out.println(filteredEmp);

        Employee employee = employees.stream().filter(x -> x.getFirstName().startsWith("S"))
                .findFirst().orElse(null);

        String s = "Chirantar Gupta";

        //1) Given a list of integers, use streams and lambda expressions to find the count of even numbers in the list.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long ans = numbers.stream().filter(x -> x % 2 == 0).count();

        System.out.println(ans);

        //2) Convert a list of strings to uppercase using streams and lambda expressions.
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> upperList = strings.stream().map(x -> x.toUpperCase(Locale.ENGLISH)).collect(Collectors.toList());

        System.out.println(upperList);

//         3) Given a list of names, use streams and lambda expressions to find if the list contains a name starting with the letter 'A'.

// Your task is to write a Java program using streams and lambda expressions to check if the 'names' list contains a name starting with the letter 'A'.
// Please provide your solution below:

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        boolean ansA = names.stream().anyMatch(x->x.startsWith("A"));

        System.out.println(ansA);

        //4) Sort a list of strings in ascending order using streams and lambda expressions.

        List<String> words = Arrays.asList("orange", "apple", "banana", "grape");
        List<String> sortedWords = words.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedWords);

        words.sort(Comparator.naturalOrder());

// 5) Grouping and Counting
        List<String> wordsGrp = Arrays.asList("cat", "dog", "elephant", "lion", "tiger", "ant");

// Your task is to write a Java program using streams and lambda expressions to group the 'words' list by length and count the occurrences of each length.
// Please provide your solution below:
        Map<Integer, List<String>> ansGrp = wordsGrp.stream().collect(Collectors.groupingBy(String::length));
//        wordsGrp.stream().collect(Collectors.groupingBy(String));

        System.out.println(ansGrp);
        //6) Find the maximum element from a list of integers using streams and lambda expressions.
        List<Integer> numbersMax = Arrays.asList(34, 12, 56, 78, 23, 90, 45);
        int max = numbersMax.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        //7) Given a list of doubles, transform each element to its square, and then calculate the sum of the squared values.
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);

        double sum = doubles.stream().mapToDouble(x->x*x).sum();

        System.out.println(sum);

        //8) Given a list of integers, filter out the even numbers and then calculate the sum of the remaining odd numbers.
         List<Integer> numbersToFilter = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         int oddSum = numbersToFilter.stream().filter(x->x%2!=0).mapToInt(Integer::intValue).sum();
//        System.out.println(oddSum);
        //9) Words to concatenate
        List<String> wordsToConcatenate = Arrays.asList("Hello", " ", "world", "!");

        List<Character> test = wordsToConcatenate.stream().flatMap(x->x.chars().mapToObj(c->(char)c)).collect(Collectors.toList());
//        System.out.println(test);

        String tanuj = "tanuj Gupta";
        List<Character> chars = tanuj.chars().mapToObj(ch->(char)ch).filter(x -> x.equals('a')).collect(Collectors.toList());
        System.out.println(chars);
    }
}
