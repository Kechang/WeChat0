package org.kechang.message.reqmsg;

public class LinkMessage extends BaseMessage{
	//Message title
	private String Title;
	//Message descrition
	private String Description;
	//Message links
	private String Url;

	public String getTitle(){
		return Title;
	}
	
	public void setTitle(String title){
		Title = title;
	}
	
	public String getDescription(){
		return Description;
	}
	
	public void setDescrition(String description){
		Description = description;
	}
	
	public String getUrl(){
		return Url;
	}
	
	public void setUrl(String url){
		Url = url;
	}
}
