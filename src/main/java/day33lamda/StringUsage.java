package day33lamda;

import day32_lamda.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class StringUsage {
    public static void main(String[] args) {


        List<String> l = new ArrayList<>();

        l.add("Tom");
        l.add("Alley");
        l.add("Fatih");
        l.add("Mark");
        l.add("John");
        l.add("Sue");
        l.add("Jackson");
        l.add("Marry");
        l.add("Tucker");
        l.add("Ben");


        printInUpperCase(l);
            System.out.println();
        perintEleShortedByLengths(l);
            System.out.println();
        perintEleShortedByAsLengths(l);
            System.out.println();
        perintDistinctEleSortedByLastChar(l);
            System.out.println();
        printSortedByLengthAndSortedByInitial(l);
            System.out.println();
//  //    removeIfTheLengthIsGreaterThanFive(l);
//            System.out.println();
////      printRemoveIfStartingWithAorEndingWithN(l);
//        System.out.println();
//        printRemoveIfEndingWithOorLength5b9(l);
        System.out.println(checkEleLessthan(l,8));
        System.out.println(checkNotStringWithX(l));
        System.out.println(checkAnyEleEndsWithN(l));

    }

    public static void printInUpperCase(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(UtilsClass::printInTheSameLineWithASpace);
       // list.replaceAll(String::toUpperCase);
       // System.out.println(list);

    }
    public static void perintEleShortedByLengths(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printInTheSameLineWithASpace);


    }
    public static void perintEleShortedByAsLengths(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsClass::printInTheSameLineWithASpace);


    }
    public static void perintDistinctEleSortedByLastChar(List<String> list) {

        list.stream().distinct().sorted(Comparator.comparing(UtilsClass::getLastChar)).forEach(UtilsClass::printInTheSameLineWithASpace);

    }
    public static void printSortedByLengthAndSortedByInitial(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(UtilsClass::printInTheSameLineWithASpace);

    }
    public static void removeIfTheLengthIsGreaterThanFive(List<String> list) {

        list.removeIf(t-> t.length()>5);
        System.out.println(list);
    }
    public static void printRemoveIfStartingWithAorEndingWithN(List<String> list) {

        list.removeIf(t-> t.charAt(0)=='A'|| t.charAt(0)=='a' || t.charAt(t.length()-1)=='N'|| t.charAt(t.length()-1)=='n');
        System.out.println(list);
    }
    public static void printRemoveIfEndingWithOorLength5b9(List<String> list) {
// 1. way
      //  list.removeIf(t-> t.length()<10 && t.length()>4 || t.charAt(t.length()-1)=='o');
 //2. way
        Predicate<String> checkCondition= t-> (t.length()>4&&t.length()<10) || t.endsWith("o");
        list.removeIf(t-> checkCondition.test(t));
        System.out.println(list);
    }

    public static boolean checkEleLessthan(List<String> list,int a) {

        return list.stream().allMatch(t-> t.length()<a);
    }
    public static boolean checkNotStringWithX(List<String> list) {

        return list.stream().noneMatch(t-> t.startsWith("X"));
    }
    public static boolean checkAnyEleEndsWithN(List<String> list) {

        return list.stream().anyMatch(t-> t.endsWith("n"));
    }

}