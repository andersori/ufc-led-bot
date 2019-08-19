package io.andersori;

import static spark.Spark.get;

public class Main {
	
	public static void main(String[] args) {
		
		configLogJetty();
		
		get("/hello", (request, response) -> {
			return "Hello World!!";
		});
	}
	
	private static void configLogJetty(){
		System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
		System.setProperty("org.eclipse.jetty.LEVEL", "OFF");
	}
}
