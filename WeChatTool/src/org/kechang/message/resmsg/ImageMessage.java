package org.kechang.message.resmsg;

public class ImageMessage extends BaseMessage{
	//Picture
	private Image Image;
	
	public Image getImage(){
		return Image;
	}
	
	public void setImage(Image image){
		Image = image;
	}
}
