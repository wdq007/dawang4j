package com.wechat.weixin.message;
/**
 * 
 * @Description: 图文model
 * @Parameters: 
 * @Return: 
 * @Create Date: 
 * @Version: V1.00
 * @author: 来日可期
 */
public class Article {
	//图文消息名称
	private String Title;
	//图文消息描述
	private String Description;
	//图片链接，支持JPG、PNG格式,较好的效果为大图640像素*320像素,小图80像素*80像素
	private String PicUrl;
	//点击图文消息跳转链接
	private String Url;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
}
