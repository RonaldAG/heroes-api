package br.com.heroapi.main;

import br.com.heroapi.client.ClientHTTP;
import br.com.heroapi.urls.ApiUrl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Program {

    public static void main(String[] args){
        //Establish the http connection
        ClientHTTP clientHTTP = new ClientHTTP();

        //request the api page
        String information = clientHTTP.requestInformation(ApiUrl.DISNEY_GET_CHARACTER_BY_ID.getLink() + "12");

        System.out.println(information);
    }
}
