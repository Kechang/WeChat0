package org.kechang.message.eventmsg;

public class MenuEvent extends BaseEvent{
	//Event key value, 
	private String EventKey;
	
	public String getEventKey(){
		return EventKey;
	}
	
	public void setEventKey(String eventKey){
		EventKey = eventKey;
	}
}
