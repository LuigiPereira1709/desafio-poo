import domain.App;
import domain.Smartphone;
import models.Browser;
import models.MusicPlayer;
import models.PhoneCall;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MusicPlayer playerMusic = new MusicPlayer("PlayerMusic", "1.234.4");
        Browser browser = new Browser("Browser", "2.23.44");
        PhoneCall phoneCall = new PhoneCall("Phone Call", "0.3.33");

        List<App> apps = List.of(playerMusic, browser, phoneCall);

        Smartphone apple = new Smartphone("iphone 3", "apple");

        apple.setApps(apps);

        for (App app : apple.getApps()) {
            System.out.println(app.getName());
        }
    }
}
