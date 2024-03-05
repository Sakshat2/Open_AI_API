//package com.chatbot.AI.Sakshat7.Models;
//
//import java.awt.Choice;
//import java.util.List;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class ChatCompletionResponse {
//	
//	public ChatCompletionResponse() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	private List<Choice> choices;
//	
//	@Data
//	@AllArgsConstructor
//	@NoArgsConstructor
//	public static class Choice{
//		
//		public Choice(int index, ChatMessage message) {
//			super();
//			this.index = index;
//			this.message = message;
//		}
//
//		private int index;
//		
//		private ChatMessage message;
//
//		public int getIndex() {
//			return index;
//		}
//
//		public void setIndex(int index) {
//			this.index = index;
//		}
//
//		public ChatMessage getMessage() {
//			return message;
//		}
//
//		public void setMessage(ChatMessage message) {
//			this.message = message;
//		}
//		
//	}
//
//	public List<Choice> getChoices() {
//		return choices;
//	}
//
//	public void setChoices(List<Choice> choices) {
//		this.choices = choices;
//	}
//
//	@Override
//	public String toString() {
//		return "ChatCompletionResponse [choices=" + choices + ", getChoices()=" + getChoices() + ", getClass()="
//				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
//	
//
//}
