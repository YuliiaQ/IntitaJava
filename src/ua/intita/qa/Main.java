package ua.intita.qa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        EvenOrOdd.evenOrOdd(arr, n);
        BiggestOrSmallestNumber.biggestOrSmallest(arr, n);
        DivideByThreeAndNine.divide(arr, n);
        BubbleSort.fromMinToMax(arr, n);
        BubbleSort2.fromMaxToMin(arr, n);
        FindPrimitive.primitive(arr, n);
        TheShortestAndLongest.longAndShort(arr, n);
        IsPalindrom.ispalindrom(arr, n);
        IncreaseLength.increaseLength(arr, n);
        ThreeDigitsWithNoRepetition.noRepet(arr,n);

        Student[] student = new Student[5];
        student[0] = new Student(5, "John", "John", "Matters",
                3456, "New-York", "0987654321", "art",
                2, 1);
        student[1] = new Student(1, "Michael", "Michael", "Michael",
                9876, "Prague", "0987654321", "phylosophy",
                5, 1);
        student[2] = new Student(2, "Tom", "Tom", "Tom",
                4567, "Minsk", "0987654321", "art",
                3, 5);
        student[3] = new Student(3, "Gilby", "Bilby", "Gilby",
                2341, "Kozyatyn", "0987654321", "medicine",
                5, 2);
        student[4] = new Student(4, "Leon", "Leon", "Leon",
                9476, "Moskow", "0987654321", "art",
                3, 1);

        in.nextLine();

        System.out.println("Input faculty: ");
        String facul = in.nextLine();
        for(Student stud : student){
            Student.choiceFaculty(stud, facul);
        }

        System.out.println("Input faculty and course: ");
        facul = in.nextLine();
        int cour = in.nextInt();
        for(Student stud : student){
            Student.choiceFacultyAndCourse(stud, facul, cour);
        }

        System.out.println("Input date of birth: ");
        int year= in.nextInt();
        in.nextLine();
        for(Student stud : student){
            Student.bornAfter(stud, year);
        }

        System.out.println("Input faculty, course and group: ");
        facul = in.nextLine();
        cour = in.nextInt();
        int gr = in.nextInt();
        in.nextLine();
        for(Student stud : student){
            Student.choiceFacultyCourseGroup(stud, facul, cour, gr);
        }

        Customer[] customer = new Customer[5];
        customer[0] = new Customer (1, "Mishel", "Mishel", "Mishel",
                "New-York", 123456789, 123456);
        customer[1] = new Customer (2, "Ariel", "Ariel", "Ariel",
                "Prague", 789456123, 789456);
        customer[2] = new Customer (3, "Baldy", "Baldy", "Baldy",
                "Minsk", 456789123, 456789);
        customer[3] = new Customer (4, "Hermione", "Hermione", "Hermione",
                "Kozyatyn", 321654987, 321654);
        customer[4] = new Customer (5, "Danny", "Danny", "Danny",
                "Moskow", 987654321, 987654);

        System.out.println("Number of card from: ");
        int credCardBegin= in.nextInt();
        System.out.println("Number of card till: ");
        int credCardEnd= in.nextInt();
        in.nextLine();
        for(Customer cust : customer){
            Customer.creditCard(cust, credCardBegin, credCardEnd);
        }

        Book[] books = new Book[5];
        books[0] = new Book (1, "Onetwothree", "John", "Astound",
                1985, 965, 35.6,"твердая");
        books[1] = new Book (2, "Threefourfive", "John", "Epamа",
                1989, 630, 28.6,"твердая");
        books[2] = new Book (3, "Sixseveneight", "John", "Astound",
                1979, 830, 30.2,"твердая");
        books[3] = new Book (4, "Eightnineten", "John", "Epamа",
                1987, 1000, 45.30,"твердая");
        books[4] = new Book (5, "Teneleventwelve", "John", "Astound",
                1982, 1200, 33.50,"твердая");

        System.out.println("Input author:");
        String auth = in.nextLine();
        for(Book book : books){
            Book.choiceAuthor(book, auth);
        }

        System.out.println("Input publish house:");
        String publHouse = in.nextLine();
        for(Book book : books){
            Book.choicePublishHouse(book, publHouse);
        }

        System.out.println("Input year:");
        year = in.nextInt();
        in.nextLine();
        for(Book book : books) {
            Book.publishAfter(book, year);
        }
        in.close();
    }
}
