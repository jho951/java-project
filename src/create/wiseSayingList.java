package create;
// 명언 데이터를 저장할 클래스
   public class wiseSayingList {
        public int listNum;
        public String wiseSaying;
        public String author;

        // 초기값
        public wiseSayingList(){
            this(0, "","");
        }

        public wiseSayingList(int listNum, String wiseSaying, String author) {
            this.listNum=listNum;
            this.wiseSaying=wiseSaying;
            this.author=author;
        }
    }
