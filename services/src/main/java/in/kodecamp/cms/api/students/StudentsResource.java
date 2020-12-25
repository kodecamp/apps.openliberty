package in.kodecamp.cms.api.students;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import in.kodecamp.cms.api.commons.BaseResource;
import in.kodecamp.models.StudentEntity;

/**
 * StudentsResource
 */
@Path("/{students}")
// this helps in converting java objects to json by using
@Produces(MediaType.APPLICATION_JSON)
// this helps in converting request values into java objects
@Consumes(MediaType.APPLICATION_JSON)

public class StudentsResource extends BaseResource<StudentEntity> {

   /**
    * Constructor
    */
   public StudentsResource() {
      System.out.println("StudentResource : Constructor @@@@@@@@@@");
   }

   private final String className = this.getClass().getName() + " : ";

   @Inject
   private StudentBO studentBo;

   @PostConstruct
   public void init() {
      final String msg = this.className + "Init : StudentBo : " + this.studentBo;
      System.out.println(msg);
   }

   @GET
   public Response getAll() {
      System.out.println(this.className + "getAll");
      List<StudentEntity> resultList = studentBo.getAll();
      System.out.println("result list : " + resultList);
      return Response.ok(studentBo.getAll()).build();
   }

   @GET
   @Path("/{id}")
   public Response getBy(@PathParam("id") long id) {
      System.out.println(this.className + "getBy(id) -> id : " + id);
      StudentEntity fe = studentBo.getBy(id);
      return super.buildResponse(fe);
   }

   @PUT
   @Path("/{id}")
   public Response update(@PathParam("id") long id, final StudentEntity requestObj) {
      System.out.println(this.className + "update at id : " + id + " with -> " + requestObj);
      return null;
   }

   @POST
   public Response create(final StudentEntity newStudent) {
      System.out.println(this.className + "create : " + newStudent);
      return Response.ok(this.studentBo.createNew(newStudent)).build();
   }

   @DELETE
   @Path("/{id}")
   public Response deleteBy(@PathParam("id")
   final String id) {
      System.out.println("Hello");
      System.out.println(this.className + "deleteBy(id) -> " + id);
      return null;
   }

}
