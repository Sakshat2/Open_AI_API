package com.chatbot.AI.Sakshat7.Models;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

public class ChatGPTrequest {
private String model ="gpt-3.5-turbo";
private String prompt;
private int temperature=1;


@SerializedName(value = "max_tokens")
private int maxTokens=100;


//private List<ChatMessage> messages;

	 public ChatGPTrequest() {
	        // default constructor
	    }
	
	
//	public ChatGPTrequest(String model, String prompt) {
//		super();
//		this.model = model;
//		this.messages = new ArrayList<ChatMessage>();
//		this.messages.add(new ChatMessage("user",prompt));
//	}
	 
//	    public static class ChatMessage {
//		  
//		 
//			
//			public ChatMessage(String string, String prompt) {
//			// TODO Auto-generated constructor stub
//		}
//			private String role;
//	        private String content;
//			public String getRole() {
//				return role;
//			}
//			public void setRole(String role) {
//				this.role = role;
//			}
//			public String getContent() {
//				return content;
//			}
//			public void setContent(String content) {
//				this.content = content;
//			}

	        // Constructors, getters, setters
//	    }
//	@Override
//	public String toString() {
//		return "ChatCompletionRequest [model=" + model + ", messages=" + messages + "]";
//	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

//
//	public List<ChatMessage> getMessages() {
//		return messages;
//	}
//
//
//	public void setMessages(List<ChatMessage> messages) {
//		this.messages = messages;
//	}


	public void setPrompt(String query) {
		// TODO Auto-generated method stub
		
	}


	public String getPrompt() {
		return prompt;
	}






	

}
