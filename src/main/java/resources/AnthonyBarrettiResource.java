package resources;

import views.AboutView;
import views.ContactView;
import views.CvView;
import views.HomeView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces({MediaType.TEXT_HTML})
public class AnthonyBarrettiResource {

    @GET
    public HomeView getHomeView() {
        return new HomeView();
    }

    @GET
    @Path("about")
    public AboutView getAboutView() {
        return new AboutView();
    }

    @GET
    @Path("cv")
    public CvView getCvView() {
        return new CvView();
    }

    @GET
    @Path("contact")
    public ContactView getContactView() {
        return new ContactView();
    }
}
