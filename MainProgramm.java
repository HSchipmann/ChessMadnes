import akkgframework.control.fundamental.MainController;
import view.MainView;
import view.StartpanelScreen;
import model.Rook;
import model.King;

public class MainProgramm {



    public static void main(String[] args) {
        new MainView(new MainController());
    }
}
