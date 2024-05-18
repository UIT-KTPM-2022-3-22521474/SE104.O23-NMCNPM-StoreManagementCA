package Controller;

import Models.loaidaily;
import Repository.LoaiDaiLyRepository;

import java.io.IOException;
import java.util.List;

public class LoaiDaiLyController {
    private final LoaiDaiLyRepository connection;

    public LoaiDaiLyController(LoaiDaiLyRepository connection) {
        this.connection = connection;
    }
    public List<loaidaily> showLoaiDaiLy() throws IOException {
        String link = "loaidaily/getAllLoaiDaiLy";
        connection.openGetConnection(link);
        return connection.getALlLoaiDaiLy();
    }
}
