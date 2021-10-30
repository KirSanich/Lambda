package com.company;

import java.io.IOException;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {



    public static void main(String[] args) throws MyException {

        List<Integer> integerList = new ArrayList<>(List.of(1, 7, 9, 2, 0, 11));
        Summable<Integer> summable = (list) -> {
            var sum = 0;
            for (var elem : list) {
                sum = sum + elem;
            }
            return sum;
        };
        System.out.println("Сумма элементов листа равна:" + summable.sum(integerList));


        List<String> stringList = new ArrayList<>(List.of("Kirill", "Olga", "Nick"));
        Summable<String> stringSummable = (list) -> {
            Predicate<String> stringPredicate;
            for (var elem : list) {

            }
            return null;
        };


        Person p1 = new Person("Kirill", 45);
        Person p2 = new Person("Niles", 50);
        Person p3 = new Person("Jack", 18);
        List<Person> personList = new ArrayList<>(List.of(p1, p2, p3));
        Comparator<Person> personComparator = ((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
        personList.sort(personComparator);
        System.out.println(personList);


        Integer[] mas = new Integer[]{5, 6, 1, 9, 0};
        Arrays.sort(mas, ((o1, o2) -> Integer.compare(o1, o2)));
        System.out.println(Arrays.toString(mas));





        Modifyable<Integer> modifyable = (n) -> {
            if (n <= 0)
                throw new MyException("Введено отрицательное число");
            return n *= 10;
        };
        Integer integer = 0;
        var result = modifyNumber(integer, modifyable);
        System.out.println(result);


    }


    static <T extends Number> T modifyNumber(T value, Modifyable<T> modifyable) throws MyException {
        return modifyable.modify(value);
    }


}
