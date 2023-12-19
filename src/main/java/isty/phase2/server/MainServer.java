package isty.phase2.server;

import isty.phase2.Groupe.*;


import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class MainServer {

    public static void main(String[] args) {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();
        ResourceConfig config = new ResourceConfig(HelloWorldResource.class);
        JdkHttpServerFactory.createHttpServer(baseUri, config);
        System.out.println("Server started at " + baseUri);
    }

    @Path("/hello")
    public static class HelloWorldResource {
        @GET
        public String getHello() {
            return "Hello, world!";
        }
    }

}
