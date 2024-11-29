
package WiseSaying.Elements;

/**
 * id : 명언 리스트 고유 값
 * title : 명언
 * author : 작가
 * */

public class WiseSaying {
    private static int id = 1;
    public static class WiseSayingList {
        public int num;
        public String title;
        public String author;

        public WiseSayingList(String title, String author) {
            this.num = id++; // id 값을 자동으로 할당
            this.title = title;
            this.author = author;
        }
    }
}
