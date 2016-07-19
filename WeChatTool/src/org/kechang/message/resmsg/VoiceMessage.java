package org.kechang.message.resmsg;

public class VoiceMessage extends BaseMessage{
	//Voice 
	private Voice Voice;
	
	public Voice getVoice(){
		return Voice;
	}
	
	public void setVoice(Voice voice){
		Voice = voice;
	}
}
