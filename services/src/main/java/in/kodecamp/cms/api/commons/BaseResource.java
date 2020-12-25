package in.kodecamp.cms.api.commons;

import java.util.Objects;
import javax.ws.rs.core.Response;

/**
 * BaseResource
 */
public class BaseResource<T> {

  protected Response buildResponse(T entity) {
    return Objects.nonNull(entity) ? Response.ok(entity)
        .build()
        : Response.noContent()
            .build();
  }

}
