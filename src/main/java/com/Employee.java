package com;

/*
 * Daniel Fitzgerald
 * Lab Exam 12/03/2020
 * Group A
 *
 * Employee class simulating an Employee. Contains a constructor that creates an Employee instance only in the case where
 * all arguments passed to the constructor are valid.
 *
 * The validation of the arguments is handled within the setter methods of the class, which are called within the constructor.
 * */

public class Employee {

    private String title;
    private String name;
    private String pps;
    private String phone;
    private String employmentType;
    private int age;

    public Employee(String title, String name, String pps, String phone, String employmentType, int age) {
        setTitle(title);
        setName(name);
        setPPS(pps);
        setPhone(phone);
        setEmploymentType(employmentType);
        setAge(age);
    }

    private void setTitle(String title) {
        if (title.equalsIgnoreCase("Mr") || title.equalsIgnoreCase("Mrs") || title.equalsIgnoreCase("Miss")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title entered");
        }
    }

    private void setName(String name) {
        if (name.length() >= 5 && name.length() <= 22) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name entered");
        }
    }

    private void setPPS(String pps) {
        if (pps.length() == 6) {
            this.pps = pps;
        } else {
            throw new IllegalArgumentException("Invalid PPS entered");
        }
    }

    private void setPhone(String phone) {
        if (phone.length() == 7) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone entered");
        }
    }

    private void setEmploymentType(String employmentType) {
        if (employmentType.equalsIgnoreCase("Full-time") || employmentType.equalsIgnoreCase("Part-time")) {
            this.employmentType = employmentType;
        } else {
            throw new IllegalArgumentException("Invalid employment type entered");
        }
    }

    private void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age entered");
        }
    }
}
