package br.com.empresa.jenkinsintegration;

import java.io.IOException;

import com.google.gson.Gson;

import br.com.empresa.jenkinsintegration.config.Constants;
import br.com.empresa.jenkinsintegration.exec.GetLogging;
import br.com.empresa.jenkinsintegration.exec.GetRunStatus;
import br.com.empresa.jenkinsintegration.model.Example;

public class Test {

	public static void main(String[] args) throws IOException{
		
		
		//Example e = new Gson().fromJson(new GetRunStatus().getRunStatus(Constants.Config.PROJECT), Example.class);
		//String log = new GetLogging().getLog(Constants.Config.PROJECT, e.getNumber());
		//System.out.println(log);
		
		
		
	}
	
}
