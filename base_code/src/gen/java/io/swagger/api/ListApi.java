package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ListApiService;
import io.swagger.api.factories.ListApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

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

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/list")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-05-19T08:47:32.084Z[GMT]")public class ListApi  {
   private final ListApiService delegate;

   public ListApi(@Context ServletConfig servletContext) {
      ListApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ListApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ListApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ListApiServiceFactory.getListApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{userId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid userid", content = @Content(schema = @Schema(implementation = InlineResponse400.class))),
        
        @ApiResponse(responseCode = "404", description = "User not found", content = @Content(schema = @Schema(implementation = InlineResponse400.class))) })
    public Response listUserIdGet(@Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("userId") Integer userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserIdGet(userId,securityContext);
    }
    @POST
    @Path("/{userId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Saved successfully", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "500", description = "Error in adding notes", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))) })
    public Response listUserIdPost(@Parameter(in = ParameterIn.DEFAULT, description = "List of to dos to be added" ,required=true) Body body

,@Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("userId") Integer userId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserIdPost(body,userId,securityContext);
    }
    @DELETE
    @Path("/{userId}/todo/{taskId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Tasks deleted successfully", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "500", description = "Error in deleting the task", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))) })
    public Response listUserIdTodoTaskIdDelete(@Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("taskId") List<Integer> taskId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserIdTodoTaskIdDelete(userId,taskId,securityContext);
    }
    @PATCH
    @Path("/{userId}/todo/{taskId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Task status updated successfully", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "500", description = "Error in updating status of task", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))) })
    public Response listUserIdTodoTaskIdPatch(@Parameter(in = ParameterIn.DEFAULT, description = "To dos content to be updated as completed" ,required=true) Body2 body

,@Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("taskId") Integer taskId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserIdTodoTaskIdPatch(body,userId,taskId,securityContext);
    }
    @PUT
    @Path("/{userId}/todo/{taskId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Updated successfully", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "500", description = "Error in updating notes", content = @Content(schema = @Schema(implementation = InlineResponse2001.class))) })
    public Response listUserIdTodoTaskIdPut(@Parameter(in = ParameterIn.DEFAULT, description = "To dos content to be updated" ,required=true) Body1 body

,@Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("userId") Integer userId
,@Parameter(in = ParameterIn.PATH, description = "",required=true) @PathParam("taskId") Integer taskId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listUserIdTodoTaskIdPut(body,userId,taskId,securityContext);
    }
}
