package com.Utils;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

public class APIservice {
    private static final String BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/";

    public static boolean isValidWord(String word) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(BASE_URL + word.toLowerCase());
            try (CloseableHttpResponse response = client.execute(request)) {
                int statusCode = response.getCode();
                return statusCode == 200;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}