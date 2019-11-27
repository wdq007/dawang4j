package com.wechat.weixin.message.response;
 
import com.wechat.weixin.message.Video;
 
/**
 * 
 * @Description:视频 
 * @Parameters: 
 * @Return: 
 * @Create Date: 
 * @Version: V1.00
 * @author: 来日可期
 */
public class VideoMessage extends BaseMessage{
	private Video video;
 
	public Video getVideo() {
		return video;
	}
 
	public void setVideo(Video video) {
		this.video = video;
	}
	
}
