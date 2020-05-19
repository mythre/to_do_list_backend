package io.swagger.api.factories;

import io.swagger.api.ListApiService;
import io.swagger.api.impl.ListApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-05-19T08:47:32.084Z[GMT]")public class ListApiServiceFactory {
    private final static ListApiService service = new ListApiServiceImpl();

    public static ListApiService getListApi() {
        return service;
    }
}
