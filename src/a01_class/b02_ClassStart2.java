package a01_class;

public class b02_ClassStart2 {
    public static void main(String[] args) {
        // * ClassStart1의 문제점을 해결하기 위해 배열을 사용을 했다.
        String[] studentNames = {"학생 1", "학생 2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        // * 하지만 역시 불편함은 존재.
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + "의 나이: " + studentAges[i] + ", 성적: " + studentGrades[i]);
        }
    }
}
