//package com.chatbot.AI.Sakshat7.Models;
//
//import java.util.Objects;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class ChatMessage {
//	public ChatMessage() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	private String role;
//	
//	public ChatMessage(String role, String prompt) {
//	    this.role = role;
//	    this.content = prompt;
//	}
//
//
//	private String content;
//
//
//
//	public String getContent() {
//		return content;
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	public String getRole() {
//		return role;
//	}
//
//
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//
//
//	public void setContent(String content) {
//		this.content = content;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "ChatMessage [role=" + role + ", content=" + content + "]";
//	}
//
//
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(content, role);
//	}
//
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		ChatMessage other = (ChatMessage) obj;
//		return Objects.equals(content, other.content) && Objects.equals(role, other.role);
//	}
//
//}
