package com.chatbot.AI.Sakshat7.Models;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGPTResponse {
	
	
	private List<ChatGptChoice>choices;
	private int index;
	
	

	public List<ChatGptChoice> getChoices() {
		return choices;
	}

	public void setChoices(List<ChatGptChoice> choices) {
		this.choices = choices;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}



}
