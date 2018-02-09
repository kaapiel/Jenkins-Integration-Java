package br.com.empresa.jenkinsintegration.exec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;

import br.com.empresa.jenkinsintegration.config.Constants;

public class GetRunStatus {

	private String runUrl;
	
	public String getRunStatus(String jobName) throws IOException{
		
		runUrl = Constants.Links.HOST + "/view/" + Constants.Config.VIEW + "/job/" + jobName + "/lastBuild/api/json?depth=1";
		
		String authString = Constants.Credentials.USER + ":" + Constants.Credentials.PASS;
		byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
		String authStringEnc = new String(authEncBytes);
		
		URL url = new URL(runUrl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		//conn.setRequestProperty("Authorization", "Basic "+ authStringEnc);
		
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

