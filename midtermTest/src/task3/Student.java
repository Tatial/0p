package task3;

public class Student {

    private int id;
    private String name;
    private int point;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.point = -1;
    }

    public Student(String name, int id, int point) {
        this.name = name;
        this.id = id;
        this.point = point;
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
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
}

