import akkgframework.control.fundamental.MainController;
import view.MainView;
import view.StartpanelScreen;
//Efi
public class MainProgramm {
    public static void main(String[] args) {
        MainView view = new MainView(new MainController());
    }
}
