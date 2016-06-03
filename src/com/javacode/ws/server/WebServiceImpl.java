package com.javacode.ws.server;

import javax.jws.WebService;

@WebService(endpointInterface="com.javacode.ws.server.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface {

	@Override
	public String getHelloWorldAsString(String str) {
		return "[Сервер] Hello World >> " + str;
	}

}
