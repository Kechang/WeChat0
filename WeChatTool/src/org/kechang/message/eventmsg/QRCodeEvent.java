package org.kechang.message.eventmsg;

public class QRCodeEvent extends BaseEvent{
    // Event key value
	private String EventKey;
	//Transfor ticket
	private String Ticket;
	
	public String getEventKey(){
		return EventKey;
	}
	
	public void setEventKey(String eventKey){
		EventKey = eventKey;
	}
	
	public String getTicket(){
		return Ticket;	
	}
	
	public void setTicket(String ticket){
		Ticket = ticket;
	}
	
}
