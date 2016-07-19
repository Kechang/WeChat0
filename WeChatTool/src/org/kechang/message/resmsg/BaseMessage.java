package org.kechang.message.resmsg;

public class BaseMessage {
	//Developer's name
	private String ToUserName;
	// Open Id
	private String FromUserName;
	//Created time
	private long CreateTime;
	//Message type
	private String MsgType;
	
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
}
