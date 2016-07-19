package org.kechang.message.reqmsg;

public class VideoMessage extends BaseMessage{
	// Video message Id
	private String MediaId;
	//Video Message shortening Id
	private String ThumbMediaId;
	
	public String getMediaId(){
		return MediaId;
	}
	
	public void setMediaId(String mediaId){
		MediaId = mediaId;
	}
	
	public String getThumbMediald(){
		return ThumbMediaId;
	}

	public void setThumbMediald(String thumbMediald){
		ThumbMediaId = thumbMediald;
	}
}
