package org.kechang.message.resmsg;

public class TextMessage extends BaseMessage{
	//Response message content
	private String Content;
	
	public String getContent(){
		return Content;
	}
	
	public void setContent(String content){
		Content = content;
	}
	
}
