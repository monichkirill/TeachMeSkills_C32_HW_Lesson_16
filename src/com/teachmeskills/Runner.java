package com.teachmeskills;

import com.teachmeskills.student.Student;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Set<String> passportNumbers = new HashSet<>(Arrays.asList("MH1234567", "MC2345678", "CD3456789"));

        Set<Student> students = new HashSet<>();
        students.add(new Student("Ivan Ivanov", 20));
        students.add(new Student("Anna Petrova", 21));
        students.add(new Student("Pavel Sidorov", 22));

        if (passportNumbers.size() != students.size()) {
            System.out.println("The number of passport numbers does not match the number of students!");
            return;
        }

        Iterator<String> passportIterator = passportNumbers.iterator();
        Iterator<Student> studentIterator = students.iterator();

        Map<String, Student> passportToStudentMap = new HashMap<>();
        while (passportIterator.hasNext() && studentIterator.hasNext()) {
            passportToStudentMap.put(passportIterator.next(), studentIterator.next());
        }

        for (Map.Entry<String, Student> entry : passportToStudentMap.entrySet()) {
            System.out.println("Passport: " + entry.getKey() + ", Student: " + entry.getValue());
        }
    }
}
