package WiseSaying.Model;

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

    public WiseSaying(String title, String author) {
        this.id = idCounter++;
        this.title = title.trim();
        this.author = author.trim();
    }

    // Getter 메서드들
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}
