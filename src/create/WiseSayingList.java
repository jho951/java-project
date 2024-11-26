package create;
// 명언 데이터를 저장할 클래스
   public class WiseSayingList {
        public int listNum;
        public String wiseSaying;
        public String author;

        // 초기값
        public WiseSayingList(){
            this(0, "","");
        }

        public WiseSayingList(int listNum, String wiseSaying, String author) {
            this.listNum=listNum;
            this.wiseSaying=wiseSaying;
            this.author=author;
        }
    }
