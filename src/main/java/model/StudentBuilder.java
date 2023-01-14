package model;

public class StudentBuilder {
    private String id;
    private String name;

    public StudentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Student createStudent() {
        return new Student(id, name);
    }
}