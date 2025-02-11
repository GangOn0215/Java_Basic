package a01_class;

public class b01_ClassStart1 {
    public static void main(String[] args) {
        // ! 문제점: 중복코드가 심하고 유지보수가 어렵고 학생수가 많아 질수록 코드가 늘어난다.

        // * 학생 1
        String studentName1 = "학생 1";

        int studentAge1 = 15;
        int studentGrade1 = 90;

        // * 학생 2
        String studentName2 = "학생 2";

        int studentAge2 = 16;
        int studentGrade2 = 80;

        // * 학생 정보 출력
        System.out.println(studentName1 + "의 나이: " + studentAge1 + ", 성적: " + studentGrade1);
        System.out.println(studentName2 + "의 나이: " + studentAge2 + ", 성적: " + studentGrade2);
    }
}
