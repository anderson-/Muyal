package s3f.muyal;

import java.awt.Color;
import java.awt.Toolkit;
import s3f.core.plugin.PluginBuilder;
import s3f.core.ui.GUIBuilder;
import static s3f.core.ui.MainUI.createLookAndFeel;
import s3f.util.splashscreen.SimpleSplashScreen;
import s3f.util.splashscreen.SplashScreen;

public class Builder extends PluginBuilder {

    static {
        SplashScreen splash = new SimpleSplashScreen(Toolkit.getDefaultToolkit().getImage(Builder.class.getResource("/resources/splash.png")));

        GUIBuilder.setSplashScreen(splash);

        GUIBuilder.setLookAndFeel(createLookAndFeel(Color.decode("#cc5555")));
        GUIBuilder.setIcon(Toolkit.getDefaultToolkit().getImage(Builder.class
                .getResource("/resources/logos/color64.png")));
    }

    public Builder() {
        super("Pyrite");
    }

    @Override
    public void init() {
        
    }

}
