package org.kechang.message.reqmsg;

public class TextMessage extends BaseMessage{
	//Message content
	private String Content;
	
	public String getcontent(){
		return Content;
	}
	
	public void setContent(String content){
		Content = content;
	}
}
