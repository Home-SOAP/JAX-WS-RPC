package com.javacodegeeks.ws.server;

import javax.jws.WebService;

@WebService(endpointInterface="com.javacodegeeks.ws.server.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface {

	@Override
	public String getHelloWorldAsString(String str) {
		return "[Сервер] Hello World >> " + str;
	}

}
