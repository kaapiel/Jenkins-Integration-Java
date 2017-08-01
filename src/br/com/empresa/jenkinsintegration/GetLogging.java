package br.com.empresa.jenkinsintegration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;

public class GetLogging {

	String logUrl;
	
	public String getLog(String jobName, int runId) throws IOException{
		
		logUrl = "http://localhost:8080/job/"+jobName+"/"+runId+"/consoleText";
		
		String authString = "admin" + ":" + "admin";
		byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
		String authStringEnc = new String(authEncBytes);
		
		URL url = new URL(logUrl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Authorization", "Basic "+ authStringEnc);
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine).append("\n");
		}
		
		in.close();
		
		return response.toString();
		
	}
	
}
