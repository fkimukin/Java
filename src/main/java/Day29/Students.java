package Day29;

public class Students {

    public String email;
    public int age;
    public int grade;
    public String nationality;

    @Override
    public String toString() {
        return "Students{" +
                "email='" + email + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public Students(String email, int age, int grade, String nationality) {
        this.email = email;
        this.age = age;
        this.grade = grade;
        this.nationality = nationality;




    }
}
