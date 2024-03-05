package com.chatbot.AI.Sakshat7.service;

import javax.swing.Spring;

import org.apache.commons.logging.Log;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.chatbot.AI.Sakshat7.Models.ChatGPTResponse;
import com.chatbot.AI.Sakshat7.Models.ChatGPTrequest;
import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ChatGPTService{
	
	
	@Value("${OPEN_API_URL}")
	private String OPEN_API_URL;
	
	
	@Value("${OPEN_API_KEY}")
	private String OPEN_API_KEY;
	
	public String processSearch(String query) {
		
		ChatGPTrequest chatGPTrequest=new ChatGPTrequest();
		
		chatGPTrequest.setPrompt(query);
		
		String url=OPEN_API_URL;
		
		HttpPost post  = new HttpPost(url);
		post.addHeader("Content-Type","application/json");
		post.addHeader("Authorization","Bearer "+ OPEN_API_KEY);
		
		
		Gson gson=new Gson();
		
		String body=gson.toJson(chatGPTrequest);
		
		System.out.println("body"+body);
		
		try {
		final StringEntity entity= new StringEntity(body);
		post.setEntity(entity);
		
		
		
		try(CloseableHttpClient httpClient =HttpClients.custom().build();
				CloseableHttpResponse response= httpClient.execute(post)) {
			
			String responseBody =EntityUtils.toString(response.getEntity());
			
			ChatGPTResponse chatGPTResponse= gson.fromJson(responseBody, ChatGPTResponse.class);
			
			System.out.println("responseBody"+responseBody);
			
			return chatGPTResponse.getChoices().get(0).getText();
			
		} catch (Exception e) {
			// TODO: handle exception
			return "failed";
		}
		
		}catch (Exception e) {
			// TODO: handle exception
			return "failed";
		}
		
	
		
		
		
	}

}
