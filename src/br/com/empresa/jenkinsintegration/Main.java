package br.com.empresa.jenkinsintegration;

import java.io.IOException;

import com.google.gson.Gson;

import br.com.empresa.jenkinsintegration.model.Example;

public class Main {

	private static StringBuilder sb = new StringBuilder();
	private static String projectName = "Treinamento4";
	
	public static void main(String[] args) throws IOException, InterruptedException{

		new RunAutomation().runAutomation(projectName);
		Example e = new Gson().fromJson(new GetRunStatus().getRunStatus(projectName), Example.class);

		System.out.println("Iniciando execução remota...");

		while (e.getExecutor() == null) {
			e = new Gson().fromJson(new GetRunStatus().getRunStatus(projectName), Example.class);
			if(e.getExecutor() != null){
				System.err.println(e.getExecutor().getProgress()+"%");
			}
		}

		int beforePercent = 0;
		int actualPercent = 0;
		
		while (e.getExecutor().getProgress() != 100) {
			
//			Descomente estas linhas para aparecer o Log linha a linha			
//			sb = new StringBuilder().append(new GetLogging().getLog(projectName, e.getNumber()));
//			System.out.println(sb.toString());
			
			e = new Gson().fromJson(new GetRunStatus().getRunStatus(projectName), Example.class);
			
			try{
				beforePercent = e.getExecutor().getProgress();
			}catch (NullPointerException npe) {

				System.err.println("100%");
//				Descomente estas linhas para aparecer o Log total final
//				sb = new StringBuilder().append(new GetLogging().getLog(projectName, e.getNumber()));
//				System.out.println(sb.toString());
				break;
			}

			if(actualPercent == beforePercent){
				continue;
			}

			actualPercent = e.getExecutor().getProgress();
			System.err.println(e.getExecutor().getProgress()+"%");
		}
		
	}
}
