package task3;

public class StudentCollection {

    public Student[] students;
    private int studentCount;

    public StudentCollection() {
        this.students = new Student[100];
        studentCount = 0;
    }


    public void addStudent(String name, int id) {
        Student student = new Student(name, id);
        this.students[studentCount] = student;
        studentCount++;
    }

    public void addStudent(String name, int id, int point) {
        Student student = new Student(name, id, point);
        this.students[studentCount] = student;
        studentCount++;
    }

    public Student searchStudentById(int id) {
        Student result = null;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getId() == id) {
                result = this.students[i];
                break;
            }
        }
        return result;
    }

    public Student[] searchStudentByName(String name) {
        int count = 0;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getName().equals(name)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int countAlreadyAddedInResult = 0;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getName().equals(name)) {
                result[countAlreadyAddedInResult] = this.students[i];
                countAlreadyAddedInResult++;
            }
        }
        return result;
    }

    public void updateStudentGrade(int id, int point) {
        Student student = searchStudentById(id);
        student.setPoint(point);
    }

    public void updateStudentGrade(String name, int point) {
        Student[] studentsByName = searchStudentByName(name);
        for (int i = 0; i < studentsByName.length; i++) {
            Student student = studentsByName[i];
            student.setPoint(point);
        }
    }

    public Student[] displayAllStudents() {
        return students;
    }

    public double getAverageGrade() {
        int studentCountWithValidPoint = 0;
        int sumOfPoints = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getPoint() != -1) {
                sumOfPoints += students[i].getPoint();
                studentCountWithValidPoint++;
            }
        }
        if (studentCountWithValidPoint == 0) {
            return 0;
        }
        double average = (double) sumOfPoints / studentCountWithValidPoint;
        return average;
    }

}



