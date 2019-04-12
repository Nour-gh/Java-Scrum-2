package hoofdstuk9.src.Quiz8;
import java.util.ArrayList;

public class College_Opdr2 {
    ArrayList<Student> studentenlijst = new ArrayList<Student>();

    public void studentToevoegen() {
        Student st1 = new Student("Lars", 24, "lars@itmail.com");
        Student st2 = new Student("Isa", 22, "isa@dzork.com");
        Student st3 = new Student("Thomas", 33, "thomas@ysmail.com");
        Student st4 = new Student("Susan", 25, "susan@rzmail.com");
        Student st5 = new Student("Rita", 28, "rita@online.com");

        studentenlijst.add(st1);
        studentenlijst.add(st2);
        studentenlijst.add(st3);
        studentenlijst.add(st4);
        studentenlijst.add(st5);
    }
    public static void main(String[] args) {
        College_Opdr2 c1 = new College_Opdr2();
        for (int i = 0; i < c1.studentenlijst.size(); i++) {
            System.out.println(c1.studentenlijst.get(i).naam + ", " +c1.studentenlijst.get(i).leeftijd + ", " + c1.studentenlijst.get(i).email);

        }
    }
}