package WiseSaying.Service;

import WiseSaying.Elements.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    private final List<WiseSaying> wiseSayingList = new ArrayList<>();

    // 명언 추가
    public int addWiseSaying(String title, String author) {
        WiseSaying wiseSaying = new WiseSaying(title, author);
        wiseSayingList.add(wiseSaying);
        return wiseSaying.getId();
    }

    // 명언 삭제
    public boolean deleteWiseSaying(int id) {
        return wiseSayingList.removeIf(wiseSaying -> wiseSaying.getId() == id);
    }

    // 명언 목록 조회
    public List<WiseSaying> getWiseSayingList() {
        return new ArrayList<>(wiseSayingList);
    }

    // 명언 목록 비어있는지 확인
    public boolean isListEmpty() {
        return wiseSayingList.isEmpty();
    }
}
