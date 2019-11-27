package com.wechat.controller;
 
import com.dawang.dawangj.SignatureUtil;
import com.wechat.constant.WxConstants;
import com.wechat.util.EncryptionUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.Arrays;
 
/**
 * @CreatUser : lsy
 * @CreatTime : 2019/1/8 16:10
 */
@RestController
@RequestMapping(value = "wx")
public class WechatMsgController {
 
    private Logger logger=LoggerFactory.getLogger(WechatMsgController.class);
 
    /**
     * 验证微信消息
     *
     * @param request
     * @return
     */
    @GetMapping(value = "/check")
    public String checkWxMsg(HttpServletRequest request) {
        /**
         * 微信加密签名
         */
        String signature = request.getParameter("signature");
        logger.info(signature);
        /**
         * 随机字符串
         */
        String echostr = request.getParameter("echostr");
        logger.info(echostr);
        /**
         * 时间戳
         */
        String timestamp = request.getParameter("timestamp");
        logger.info(timestamp);
        /**
         * 随机数
         */
        String nonce = request.getParameter("nonce");
        logger.info(nonce);
        String[] str={timestamp,nonce,WxConstants.TOKEN};
        //将token、timestamp、nonce三个参数进行字典序排序
        Arrays.sort(str);
        StringBuffer sb = new StringBuffer();
        //将三个参数字符串拼接成一个字符串进行sha1加密
        for (String param:str) {
            sb.append(param);
        }
        //获取到加密过后的字符串
        String encryptStr = EncryptionUtil.encrypt("SHA1", str.toString());
        logger.info("Encrypted: "+encryptStr);
        //判断加密后的字符串是否与微信的签名一致
        if(signature.equalsIgnoreCase(encryptStr)){
        	logger.info("这是微信发来的消息！！");
            return echostr;
            
        }
        	
        
        if(SignatureUtil.checkSignature(signature, timestamp, nonce)) {
        	logger.info("这是微信发来的消息！！");
        	return echostr;
        }
        logger.error("这不是微信发来的消息！！");
        return null;
        
    }
 
}
