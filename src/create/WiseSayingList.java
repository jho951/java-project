package create;

public class WiseSayingList {
    private static int nextId = 1; // 고유 ID를 생성하기 위한 정적 변수

    private int listNum; // 객체의 고유 ID
    private String wiseSaying; // 명언 내용
    private String author; // 작가 이름

    public WiseSayingList(String wiseSaying, String author) {
        this.listNum = nextId++; // 고유 ID 부여 후 증가
        this.wiseSaying = wiseSaying;
        this.author = author;
    }

    public int getListNum() {
        return listNum;
    }

    public String getWiseSaying() {
        return wiseSaying;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%d: \"%s\" - %s", listNum, wiseSaying, author);
    }
}
