/**
 * 将发送方，接收方，微信用户名等封装成类
 */
package com.wechat.weixin.pojo;
 
import java.io.Serializable;
 
import org.springframework.stereotype.Component;
 
/**
 * <p>Company: B505信息技术研究所 </p> 
 * @Description: 将发送方，接收方，微信用户名封装
 * @Create Date: 2017年10月23日上午11:45:44
 * @Version: V1.00 
 * @Author: 来日可期
 */
@Component
public class WeixinMessageInfo implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
	private String fromUserName;           // 发送发微信账号
	
	private String toUserName;             // 接收方微信账号
	
	private String weixinUserName;         // 微信用户名
	
	private String messageType;            // 消息类型
	/**
	 * @return the fromUserName
	 */
	public String getFromUserName() {
		return fromUserName;
	}
	/**
	 * @param fromUserName the fromUserName to set
	 */
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	/**
	 * @return the toUserName
	 */
	public String getToUserName() {
		return toUserName;
	}
	/**
	 * @param toUserName the toUserName to set
	 */
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	/**
	 * @return the weixinUserName
	 */
	public String getWeixinUserName() {
		return weixinUserName;
	}
	/**
	 * @param weixinUserName the weixinUserName to set
	 */
	public void setWeixinUserName(String weixinUserName) {
		this.weixinUserName = weixinUserName;
	}
	/**
	 * @return the messageType
	 */
	public String getMessageType() {
		return messageType;
	}
	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}	
	@Override
	public String toString() {
		return "WeixinMessageInfo [fromUserName=" + fromUserName
				+ ", toUserName=" + toUserName + ", weixinUserName="
				+ weixinUserName + ", messageType=" + messageType + "]";
	}
}