package org.example.bdd;

import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<Employee> employees = findEmployees();
        employees.stream().forEach(employee -> System.out.println(employee.getId()));
        employees.stream().map(employee -> employee.getName()).forEach(name -> System.out.println(name));
    }

    private static List findEmployees() {
        Employee employee1 = new Employee(1, "john");
        Employee employee2 = new Employee(2, "mark");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        return employees;
    }

    private static class Employee {

        private int id;

        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
