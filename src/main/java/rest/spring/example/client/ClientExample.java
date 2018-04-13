package rest.spring.example.client;

import org.springframework.web.client.RestTemplate;

import rest.spring.example.Message;

public class ClientExample {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8088/echo/opa";
		Message response = restTemplate.getForObject(url, Message.class);
		System.out.println(response);
	}
}