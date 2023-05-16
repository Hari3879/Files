package com.ojas.excep;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class APisException {
	
	private  String apiUrl ;

	public APisException(String apiUrl) {
		super();
		this.apiUrl = apiUrl;
	}
	public int makeApiCall() throws IOException, MyApiException {
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        int responseCode = conn.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_UNAUTHORIZED) {
            throw new MyApiException("Unauthorized API call");
        }

       

        return responseCode;
    }

}
