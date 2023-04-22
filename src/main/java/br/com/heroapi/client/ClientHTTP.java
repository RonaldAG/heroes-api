package br.com.heroapi.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientHTTP {

    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;
    private URI address;

    private void makeConnection(String url){
        //create uri
        address = URI.create(url);

        //add the client
        client = HttpClient.newHttpClient();

        //create a get request method
        request = HttpRequest.newBuilder(address).GET().build();
    }

    public String requestInformation(String url){
        makeConnection(url);
        try{
            // get the response method
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //result of the api
            String body = response.body();

            return body;

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
