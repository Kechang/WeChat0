package org.kechang.message.resmsg;

public class Video {
	//Media Id
	private String MediaId;
	//Shortening media Id
	private String ThumbMediaId;
	
	public String getMediaId(){
		return ThumbMediaId;
	}
	
	public void setMediaId(String thumbMediaId){
		ThumbMediaId = thumbMediaId;
	}
}
