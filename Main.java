import java.util.ArrayList;
import java.util.List;

// Kelas Course untuk merepresentasikan mata kuliah
class Course {
    private String code;
    private String name;

    // Constructor
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getter untuk kode mata kuliah
    public String getCode() {
        return code;
    }

    // Getter untuk nama mata kuliah
    public String getName() {
        return name;
    }

    // Method untuk mencetak detail mata kuliah
    @Override
    public String toString() {
        return "Course Code: " + code + ", Course Name: " + name;
    }
}

class Student {
    private int nim;
    private String name;
    private List<Course> courses; // Menggunakan Course sebagai objek

    // Constructor
    public Student(int nim, String name) {
        this.nim = nim;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method untuk menambahkan mata kuliah
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Method untuk menghapus mata kuliah
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    // Method untuk mendapatkan daftar mata kuliah
    public List<Course> getCourses() {
        return courses;
    }

    // Getter untuk name
    public String getName() {
        return this.name;
    }

    // Method untuk mencetak detail mahasiswa
    public void printStudentDetails() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Student dengan NIM dan nama
        Student student1 = new Student(99099, "Agus");

        // Menampilkan detail mahasiswa
        student1.printStudentDetails();

        // Membuat beberapa objek Course
        Course math = new Course("MTH101", "Mathematics");
        Course science = new Course("SCI201", "Science");
        Course english = new Course("ENG102", "English");

        // Menambahkan mata kuliah ke daftar courses
        student1.addCourse(math);
        student1.addCourse(science);
        student1.addCourse(english);

        // Menampilkan daftar mata kuliah yang diambil
        System.out.println(student1.getName() + "'s courses: ");
        for (Course course : student1.getCourses()) {
            System.out.println(course);
        }

        // Menghapus salah satu mata kuliah
        student1.removeCourse(english);

        // Menampilkan daftar mata kuliah setelah penghapusan
        System.out.println(student1.getName() + "'s courses after removal: ");
        for (Course course : student1.getCourses()) {
            System.out.println(course);
        }
    }
}
