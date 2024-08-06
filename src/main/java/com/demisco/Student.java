package com.demisco;

import java.util.Objects;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    public boolean equals(Object obj){
        Student other = (Student) obj;
        if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
