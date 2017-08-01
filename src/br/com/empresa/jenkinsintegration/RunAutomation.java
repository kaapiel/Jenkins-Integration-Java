package br.com.empresa.jenkinsintegration;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;

public class RunAutomation {

	private String jenkinsRunUrl;

	public void runAutomation(String jobName) throws IOException{

		jenkinsRunUrl = "http://localhost:8080/job/"+jobName+"/build?token=fbGHPgrLd47Y84mHPIUjkcxa6Dvfe58A4d";
		
		String authString = "admin" + ":" + "admin";
		byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
		String authStringEnc = new String(authEncBytes);
		
		URL url = new URL(jenkinsRunUrl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Authorization", "Basic "+ authStringEnc);
		
		if(conn.getResponseCode() == HttpURLConnection.HTTP_CREATED){
			System.out.println("Execução remota iniciada");
		} else {
			System.out.println("Execução remota não foi iniciada. "
					+ "Response code: "+conn.getResponseCode()+"\n"+conn.getResponseMessage());
		}
		
	}

}
