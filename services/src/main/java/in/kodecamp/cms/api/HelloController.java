package in.kodecamp.cms.api;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 *
 */
@Path("/hello")
@RequestScoped
public class HelloController {

  @PersistenceContext
  private EntityManager em;

  @PostConstruct
  public void inti() {
    System.out.println(
        "PostConstruct : em :" + em); 
  }

  @GET
  public String sayHello() {
    return "Hello World to ALL";
  }

  @GET()
  @Path("{to}")
  public String say(@PathParam("to") String to,
      @DefaultValue("") @QueryParam("message") String message) {
    final String greeting = "".equals(message) ? ("Hi " + to)
        : (message.toUpperCase() + " " + to);
    return greeting;
  }
}
