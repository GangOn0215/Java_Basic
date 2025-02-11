package a01_class;

public class b03_StudentStart1 {
    public static void main(String[] args) {
        // * 선언
        Student student1;
        Student student2;

        // * 인스턴스 등록, heap 에 메모리 할당
        student1 = new Student();
        student1.name = "학생 1";
        student1.age = 15;
        student1.grade = 90;

        student2 = new Student();
        student2.name = "학생 2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1.name + "의 나이: " + student1.age + ", 성적: " + student1.grade);
        System.out.println(student2.name + "의 나이: " + student2.age + ", 성적: " + student2.grade);

        // * 인스턴스를 배열에 넣어서 사용해보자!
        Student[] studentArr = new Student[2];

        studentArr[0] = student1;
        studentArr[1] = student2;

        // * 루프로 출력
        for (int i = 0; i < studentArr.length; i++) {
            System.out.println(studentArr[i].name + "의 나이: " + studentArr[i].age + ", 성적: " + studentArr[i].grade);
        }

        // * 루프 최적화
        for(Student student : studentArr) {
            System.out.println(student.name + "의 나이: " + student.age + ", 성적: " + student.grade);
        }

    }
}
