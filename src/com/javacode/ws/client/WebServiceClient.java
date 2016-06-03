package com.javacode.ws.client;

import com.javacode.ws.server.WebServiceInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
 
public class WebServiceClient{
 
	public static void main(String[] args) throws Exception {
	    URL wsdlUrl = new URL("http://localhost:8888/ws/helloworld?wsdl");
        
	    //qualifier name ...
        QName qname = new QName("http://server.ws.javacodegeeks.com/", "WebServiceImplService");
 
        Service service = Service.create(wsdlUrl, qname);
 
        WebServiceInterface hello = service.getPort(WebServiceInterface.class);
 
        System.out.println("JAX-WS > " + hello.getHelloWorldAsString("[Клиент-1] This is Java Code Geeks"));
    }
 
}
