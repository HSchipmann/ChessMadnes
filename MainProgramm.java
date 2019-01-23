import akkgframework.control.fundamental.MainController;
import view.MainView;
import view.StartpanelScreen;
import model.Rook;
import model.King;

public class MainProgramm {

    Rook WhiteRook = new Rook(1,1, "White");
    Rook BlackRook = new Rook(1,1, "White");
    King WhiteKing = new King(1,1, "Obama");
    King BlackKing = new King(1,1, "Snoop Dog");


    public static void main(String[] args) {
        new MainView(new MainController());
    }
}
