package com.javacodegeeks.client;

import com.javacodegeeks.ws.server.WebServiceInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
 
public class WebServiceClient{
 
	public static void main(String[] args) throws Exception {
	    URL wsdlUrl = new URL("http://localhost:8888/webserive/helloworld?wsdl");
        
	    //qualifier name ...
        QName qname = new QName("http://ws.enterprise.javacodegeeks.com/", "WebServiceImplService");
 
        Service service = Service.create(wsdlUrl, qname);
 
        WebServiceInterface hello = service.getPort(WebServiceInterface.class);
 
        System.out.println("JAX-WS > " + hello.getHelloWorldAsString("[Клиент-1] This is Java Code Geeks"));
    }
 
}
