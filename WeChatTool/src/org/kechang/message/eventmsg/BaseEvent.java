package org.kechang.message.eventmsg;

public class BaseEvent {
	//Developer's name
	private String ToUserName;
	// Open Id
	private String FromUserName;
	//Created time
	private long CreateTime;
	//Message type
	private String MsgType;
	//Event type
	private String Event;
	
	public String getToUserName(){
		return ToUserName;
	}
	
	public void setToUserName(String toUserName){
		ToUserName = toUserName;
	}
	
	public String getFromUserName(){
		return FromUserName;
	}
	
	public void setFromUserName(String fromUserName){
		FromUserName = fromUserName;
	}
	
	public long getCreatTime(){
		return CreateTime;
	}
	
	public void setCreatTime(long createTime){
		CreateTime = createTime;
	}
	
	public String getMsgType(){
		return MsgType;
	}
	
	public void setMsgType(String msgType){
		MsgType = msgType;
		
	}
	
	public String getEvent(){
		return Event;
	}
	
	public void setEvent(String event){
		Event = event;
	}
 
}
