package org.kechang.message.reqmsg;

public class ImageMessage extends BaseMessage{
     //Pictures links
	 private String PicUrl;
	 
	 public String getPicUrl(){
		 return PicUrl;
	 }
	 
	 public void setPicUrl(String picUrl){
		 PicUrl = picUrl;
	 }
	 
}
