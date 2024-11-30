
package WiseSaying.Elements;

/**
 * id : 명언 리스트 고유 값
 * title : 명언
 * author : 작가
 * */

public class WiseSaying {
    private static int idCounter = 1; // 고유 ID를 관리하기 위한 정적 필드
    private final int id;
    private final String title;
    private final String author;

    // 생성자: 명언과 작가를 받아 ID와 함께 설정
    public WiseSaying(String title, String author) {
        this.id = idCounter++;
        this.title = title.trim();
        this.author = author.trim();
    }
    // Getter: ID 반환
    public int getId() {
        return id;
    }
    // Getter: 명언 반환
    public String getTitle() {
        return title;
    }
    // Getter: 작가 반환
    public String getAuthor() {
        return author;
    }

    public static void getError(){
        System.out.println("현재 등록된 명언이 없습니다.");
    }
}

