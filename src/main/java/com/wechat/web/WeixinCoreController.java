package com.wechat.web;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wechat.service.WeixinCoreService;
//import com.wechat.tool.DataProcess;
//import com.wechat.trycatch.TryCatchWeixinCoreService;
//import com.wechat.weixin.util.WeixinSignUtil;
//import com.wechat.weixin.util.WeixinVerification;
 
/**
 * <p>Company: B505信息技术研究所 </p> 
 * @Description: 微信核心controller，接入微信服务层
 * @Create Date: 2017年10月9日下午7:31:29
 * @Version: V1.00 
 * @Author: 来日可期
 */
@RestController
@RequestMapping(value = "/wechat")
public class WeixinCoreController {
	
	private static Logger logger = LoggerFactory.getLogger(WeixinCoreController.class);
	
	//@Autowired
	//private WeixinSignUtil weixinSignUtil;
	//@Autowired
	//private DataProcess dataProcess;
	@Autowired
	private WeixinCoreService weixinCoreService;
	@RequestMapping(value="/access", method=RequestMethod.POST)
	public String getWeiXinMessage(HttpServletRequest request, HttpServletResponse response)throws Exception{
		logger.info("----------------开始处理微信发过来的消息------------------");
		// 微信服务器POST消息时用的是UTF-8编码，在接收时也要用同样的编码，否则中文会乱码；
		request.setCharacterEncoding("UTF-8"); 
		// 在响应消息（回复消息给用户）时，也将编码方式设置为UTF-8，原理同上；
		response.setCharacterEncoding("UTF-8"); 
		String respXml = weixinCoreService.weixinMessageHandelCoreService(request, response);
		/*if (dataProcess.dataIsNull(respXml)){
			logger.error("-------------处理微信消息失败-----------------------");
			return null;
		}else { */
			logger.info("----------返回微信消息处理结果-----------------------:"+respXml);
			return respXml;
		//}
	}
}