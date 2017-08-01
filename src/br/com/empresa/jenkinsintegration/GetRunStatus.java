package br.com.empresa.jenkinsintegration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;

public class GetRunStatus {

	private String runUrl;
	
	public String getRunStatus(String jobName) throws IOException{
		
		runUrl = "http://localhost:8080/job/"+jobName+"/lastBuild/api/json?depth=1";
		
		String authString = "admin" + ":" + "admin";
		byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
		String authStringEnc = new String(authEncBytes);
		
		URL url = new URL(runUrl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Authorization", "Basic "+ authStringEnc);
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		
		in.close();
		
		return response.toString();
		
	}
	
}

