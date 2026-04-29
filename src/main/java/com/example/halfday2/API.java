package com.example.halfday2;



import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    public static Weather getWeather( int temperature, String city)
            throws IOException, InterruptedIOException, InterruptedException {
        String url = "https://api.openweathermap.org/data/2.5/weather?q="+ city +"&units=metric&appid=6b6fd6ef03e57c965e9ed142598b7a14";
        System.out.println(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return new Weather (temperature, city);
    }

}
