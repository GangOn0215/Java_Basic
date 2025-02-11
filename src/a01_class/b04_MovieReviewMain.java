package a01_class;

public class b04_MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        Movie movie1 = new Movie();
        movie1.title = "기생충";
        movie1.review = "봉준호 감독의 작품이라는 것만으로도 볼 가치가 충분하다.";

        // 영화 리뷰 정보 출력
        System.out.println("영화 제목: " + movie1.title);
        System.out.println("영화 리뷰: " + movie1.review);
    }
}

