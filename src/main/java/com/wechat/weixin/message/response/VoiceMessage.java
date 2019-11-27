package com.wechat.weixin.message.response;
 
import com.wechat.weixin.message.Voice;
 
/**
 * 
 * @Description: 语音消息
 * @Parameters: 
 * @Return: 
 * @Create Date: 
 * @Version: V1.00
 * @author: 来日可期
 */
public class VoiceMessage extends BaseMessage{
	private Voice voice;
 
	public Voice getVoice() {
		return voice;
	}
 
	public void setVoice(Voice voice) {
		this.voice = voice;
	}
	
}
