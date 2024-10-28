import java.util.ArrayList;

public class Student {
    int nim;  // NIM (Nomor Induk Mahasiswa)
    String name;  // Nama mahasiswa
    ArrayList<String> courses;  // Daftar mata kuliah yang diambil mahasiswa

    // Constructor dengan parameter nim dan name
    public Student(int nim, String name) {
        this.nim = nim;
        this.name = name;
        this.courses = new ArrayList<>();  // Inisialisasi ArrayList
    }

    // Method untuk mencetak detail mahasiswa
    public void printStudentDetails() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
    }

    // Method untuk mendapatkan daftar mata kuliah mahasiswa
    public ArrayList<String> getCourses() {
        return courses;
    }

    // Method untuk menambah mata kuliah ke daftar
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method untuk menghapus mata kuliah dari daftar
    public void removeCourse(String course) {
        courses.remove(course);
    }
}
