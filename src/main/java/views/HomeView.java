package views;

import io.dropwizard.views.View;

public class HomeView extends View {
    public HomeView() {
        super("Home.mustache");
    }
}
