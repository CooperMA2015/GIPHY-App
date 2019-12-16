package com.tts.giphyAPI.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class GiphyService {
    @Value("${api_key}")
    private String apiKey;
    
    public Response getForecast(String searchTerm) {
        String url = "https://giphy.com/" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        try {
        	return restTemplate.getForObject(url, Response.class);
        }
        catch (HttpClientErrorException ex) {
            Response response = new Response();
            response.setName("error");
            return response;
        }
    }
    
    
}
