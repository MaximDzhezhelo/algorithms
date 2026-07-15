package com.algorithms.task;

import com.algorithms.task.comparators.AgeComparator;
import com.algorithms.task.comparators.Employee;
import com.algorithms.task.comparators.NameComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void shouldBeCompareById(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 30, 75000, "IT"));
        employees.add(new Employee(1, "Bob", 25, 60000, "HR"));
        employees.add(new Employee(2, "Charlie", 35, 80000, "IT"));

        Collections.sort(employees);

        assertEquals(1, employees.get(0).getId());
        assertEquals(2, employees.get(1).getId());
        assertEquals(3, employees.get(2).getId());
    }

    @Test
    public void shouldBeCompareByIdWithLambda(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 30, 75000, "IT"));
        employees.add(new Employee(1, "Bob", 25, 60000, "HR"));
        employees.add(new Employee(2, "Charlie", 35, 80000, "IT"));

        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

        assertEquals(1, employees.get(0).getId());
        assertEquals(2, employees.get(1).getId());
        assertEquals(3, employees.get(2).getId());
    }

    @Test
    public void shouldBeCompareByIdWithComparator(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 30, 75000, "IT"));
        employees.add(new Employee(1, "Bob", 25, 60000, "HR"));
        employees.add(new Employee(2, "Charlie", 35, 80000, "IT"));

        employees.sort(Comparator.comparingInt(Employee::getId).reversed());

        assertEquals(3, employees.get(0).getId());
        assertEquals(2, employees.get(1).getId());
        assertEquals(1, employees.get(2).getId());
    }

    @Test
    public void shouldBeCompareByAge(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 30, 75000, "IT"));
        employees.add(new Employee(1, "Bob", 25, 60000, "HR"));
        employees.add(new Employee(2, "Charlie", 35, 80000, "IT"));

        employees.sort(new AgeComparator());

        assertEquals(1, employees.get(0).getId());
        assertEquals(3, employees.get(1).getId());
        assertEquals(2, employees.get(2).getId());
    }

    @Test
    public void shouldBeCompareByName(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 30, 75000, "IT"));
        employees.add(new Employee(1, "Bob", 25, 60000, "HR"));
        employees.add(new Employee(2, "Charlie", 35, 80000, "IT"));

        employees.sort(new NameComparator());

        assertEquals(3, employees.get(0).getId());
        assertEquals(1, employees.get(1).getId());
        assertEquals(2, employees.get(2).getId());
    }

}