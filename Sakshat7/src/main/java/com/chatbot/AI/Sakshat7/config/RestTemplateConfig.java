package com.chatbot.AI.Sakshat7.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

//@Configuration
public class RestTemplateConfig {
//	  @Bean
//	    public RestTemplate restTemplate() {
//	        RestTemplate restTemplate = new RestTemplate();
//	        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//	        return restTemplate;
//	    }
//	@Value("${openai.key}")
	private String openaiApiKey;
//	  @Bean
		public RestTemplate restTemplate() {
			RestTemplate restTemplate=new RestTemplate();
			restTemplate.getInterceptors().add(((request,body,execution)->{
				request.getHeaders().add("Authorization", "Bearer "+openaiApiKey);
				return execution.execute(request, body);
				}));
	        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	        new RestTemplate(clientHttpRequestFactory());
			
			return restTemplate;
		}
	  private ClientHttpRequestFactory clientHttpRequestFactory() {
	        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
	        factory.setReadTimeout(5000);
	        factory.setConnectTimeout(5000);
	        return factory;
	    }
}
