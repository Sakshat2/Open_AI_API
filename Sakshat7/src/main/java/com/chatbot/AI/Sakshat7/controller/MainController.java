package com.chatbot.AI.Sakshat7.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

//import com.chatbot.AI.Sakshat7.Models.ChatCompletionRequest;
//import com.chatbot.AI.Sakshat7.Models.ChatCompletionResponse;
import com.chatbot.AI.Sakshat7.Models.SearchRequest;
import com.chatbot.AI.Sakshat7.service.ChatGPTService;


import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class MainController {

//	@Autowired
//	RestTemplate restTemplate;
	
	@PostMapping("/hitOpenaiApi")
	public String getOpenaiResponse(@RequestBody String prompt) {
		
		ChatCompletionRequest chatCompletionRequest=new ChatCompletionRequest("gpt-3.5-turbo",prompt);
		ChatCompletionResponse response= restTemplate.postForObject("https://api.openai.com/v1/chat/completions", chatCompletionRequest, ChatCompletionResponse.class);
		
	return response.getChoices().get(0).getMessage().getContent();
		
		
	}
	private ChatGPTService chatGPTService ;
	
	public  MainController( ChatGPTService chatGPTService ) {
		this.chatGPTService=chatGPTService;
		
	}
	
	@PostMapping("/searchChatGPT")
	public String searchChatGPT(@RequestBody SearchRequest searchRequest) {
		
		
		System.out.println("MainController.searchChatGPT()"+searchRequest.getQuery());
		
		
		chatGPTService.processSearch(searchRequest.getQuery());
		return "";
		
		
		
	}
	
	
	
} 
