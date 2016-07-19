package org.kechang.message.reqmsg;

public class VoiceMessage extends BaseMessage{
	 //Media Id
	private String MediaId;
	// Media Format
	private String Format;
	//UTF-8, Recognition
	private String Recognition;
	
	public String getMediaId(){
		return MediaId;
	}
	
	public void setMediaId(String mediaId){
		MediaId = mediaId;
	}
	
	public String getFormat(){
		return Format;
	}	  
	
	public void setFormat(String format){
		Format = format;
	}
	
	public String getRecognition(){
		return Recognition;
	}
	
	public void setRecognition(String recognition){
		Recognition = recognition;
	}
	
	
}
