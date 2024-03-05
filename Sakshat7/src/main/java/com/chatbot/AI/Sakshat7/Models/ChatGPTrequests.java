//package com.chatbot.AI.Sakshat7.Models;
//
//import java.util.List;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.google.gson.annotations.SerializedName;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class ChatGPTrequests {
//	
//	private String model ="gpt-3.5-turbo";
//	private List<ChatMessage> messages;
//	
//	private String prompt;
//	private int temperature=1;
//	
//	
//	@SerializedName(value = "max_tokens")
//	private int maxTokens=100;
//
//
//	public String getModel() {
//		return model;
//	}
//
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//
//	public String getPrompt() {
//		return prompt;
//	}
//
//
//	public void setPrompt(String prompt) {
//		this.prompt = prompt;
//	}
//
//
//	public int getTemperature() {
//		return temperature;
//	}
//
//
//	public void setTemperature(int temperature) {
//		this.temperature = temperature;
//	}
//
//
//	public int getMaxTokens() {
//		return maxTokens;
//	}
//
//
//	public void setMaxTokens(int maxTokens) {
//		this.maxTokens = maxTokens;
//	}
////	public ChatMessage(String string, String prompt) {
////	// TODO Auto-generated constructor stub
////}
////	private String role;
////    private String content;
////	public String getRole() {
////		return role;
////	}
////	public void setRole(String role) {
////		this.role = role;
////	}
////	public String getContent() {
////		return content;
////	}
////	public void setContent(String content) {
////		this.content = content;
////	}
////
////    // Constructors, getters, setters
////}
//	
//
//}
