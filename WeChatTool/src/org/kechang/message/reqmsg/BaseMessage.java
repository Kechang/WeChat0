package org.kechang.message.reqmsg;

public class BaseMessage {
     //Developer's name;
	private String ToUserName;
	 //OpenID
	private String FromUserName;
	 //Created time
	private long CreateTime;
	 //Message type
	private String MsgType;
	 //Int 64 bits
	private long MsgId;
	
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
	
	public long getMsgId(){
		return MsgId;
	}
	
	public void setMsgId(long msgId){
		MsgId = msgId;
	}
	
}
