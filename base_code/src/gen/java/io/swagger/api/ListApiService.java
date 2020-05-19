package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse400;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-05-19T08:47:32.084Z[GMT]")public abstract class ListApiService {
    public abstract Response listUserIdGet(Integer userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUserIdPost(Body body,Integer userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUserIdTodoTaskIdDelete(Integer userId,List<Integer> taskId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUserIdTodoTaskIdPatch(Body2 body,Integer userId,Integer taskId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUserIdTodoTaskIdPut(Body1 body,Integer userId,Integer taskId,SecurityContext securityContext) throws NotFoundException;
}
