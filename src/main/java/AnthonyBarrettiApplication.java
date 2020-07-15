import config.AnthonyBarrettiConfiguration;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import resources.AnthonyBarrettiResource;

public class AnthonyBarrettiApplication extends Application<AnthonyBarrettiConfiguration> {

    public static void main(String[] args) throws Exception {
        AnthonyBarrettiApplication anthonyBarrettiApplication = new AnthonyBarrettiApplication();
        anthonyBarrettiApplication.run(args);
    }

    public void initialize(Bootstrap<AnthonyBarrettiConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<>());
        bootstrap.addBundle(new AssetsBundle("/assets/css", "/css", null, "css"));
        bootstrap.addBundle(new AssetsBundle("/assets/fonts", "/fonts", null, "fonts"));
        bootstrap.addBundle(new AssetsBundle("/assets/imgs", "/imgs", null, "imgs"));
        bootstrap.addBundle(new AssetsBundle("/assets/js", "/js", null, "js"));
        bootstrap.addBundle(new AssetsBundle("/assets/node_modules", "/node_modules", null, "node_modules"));
    }

    @Override
    public void run(AnthonyBarrettiConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new AnthonyBarrettiResource());
    }
}
