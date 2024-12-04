package WiseSaying.Controller;


import WiseSaying.Model.WiseSayingService;
import WiseSaying.View.WiseSayingView;

import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    private final WiseSayingService service;
    public final WiseSayingView view;

    public WiseSayingController(Scanner scanner) {
        this.service = new WiseSayingService();
        this.view = new WiseSayingView(scanner);
    }

    public void handleRegister() {
        String title = view.getInput("명언");
        String author = view.getInput("작가");
        int id = service.addWiseSaying(title, author);
        view.printRegisterResult(id);
    }

    public void handleList() {
        view.printWiseSayingList(service.getWiseSayingList());
    }

    public void handleDelete() {
        if (service.isListEmpty()) {
            view.printWiseSayingList(List.of());
            return;
        }
        String idInput = view.getInput("삭제할 명언 번호");
        boolean isDeleted = service.deleteWiseSaying(Integer.parseInt(idInput));
        view.printDeleteResult(isDeleted);
    }
}
