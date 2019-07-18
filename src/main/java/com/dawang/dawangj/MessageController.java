package com.dawang.dawangj;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageController {
@Autowired
private RestTemplate restTemplate;
@Autowired
private WechatConf wechatConf;
@RequestMapping("/sendMessage")
public Object sendMessage(@RequestBody UserCarInfo userCarInfo) {
MessageTemplate messageTemplate = new MessageTemplate();
// 设置模板id
messageTemplate.setTemplateId("sLuD0d72M393JGSuNsimqupnz6OJuAIfmX6a08If9Kw");
// 设置接收用户openId
messageTemplate.setToUser("o7v4k1cP2Chg7MiSgnh3b3xI8DtE");
//点击详情跳转的地址
messageTemplate.setUrl("http://www.baidu.com");
//设置模板dada参数
messageTemplate.getData().put("topic", MessageTemplate.initData("您的单车已经锁定成功，骑行请注意安全！\n", ""));
messageTemplate.getData().put("user", MessageTemplate.initData(userCarInfo.getUserName(), "#0000EE"));
messageTemplate.getData().put("car", MessageTemplate.initData(userCarInfo.getCarSn(), "#00CD00"));
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
messageTemplate.getData().put("date", MessageTemplate.initData(simpleDateFormat.format(new Date())+"\n", ""));
messageTemplate.getData().put("remark", MessageTemplate.initData("点击详情可查看您的租车信息", ""));
//调用微信接口，发送模板消息
Result result = restTemplate.postForObject(String.format(WechatConf.PUSH_MESSAGE_URL, wechatConf.getAccessToken()),
messageTemplate, Result.class);
return result;
}
}
