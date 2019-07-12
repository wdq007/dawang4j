package com.dawang.dawangj;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties(prefix = "wechat")
public class WechatConf {
  // 获取accessToken的接口
  public static final String GET_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
  // 发送消息的接口
  public static final String PUSH_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=%s";
  private String appId;
  private String appsecret;
  // 发送消息的接口的访问凭证
  private String accessToken;
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }
  public String getAppsecret() {
    return appsecret;
  }
  public void setAppsecret(String appsecret) {
    this.appsecret = appsecret;
  }
  public String getAccessToken() {
    return accessToken;
  }
 
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }
}
