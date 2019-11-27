package com.wechat.weixin.main;
 
import com.wechat.weixin.menu.Menu;
import com.wechat.weixin.util.WechatCommonUtil;
import com.wechat.weixin.util.WechatConstants;
import com.wechat.weixin.util.WechatMenuManagerUtil;
import com.wechat.weixin.util.WechatMenuUtil;
 
/**
 * @Description: 创建自定义菜单主方法
 * @Parameters: 
 * @Return: 
 * @Create Date: 2018年9月28日下午2:25:33
 * @Version: V1.00
 * @author: 来日可期
 */
public class WechatCreatDefaultMenu {
	public static void main(String[] args){
		WechatCommonUtil wechatCommonUtil = new WechatCommonUtil();
		WechatMenuUtil wechatMenuUtil = new WechatMenuUtil();
		WechatMenuManagerUtil wechatMenuManagerUtil = new WechatMenuManagerUtil();
		String appid = "公众号的appid";
		String appsecret = "公众号的appsecret";
		
		//获取access_token
		String accessToken = wechatCommonUtil.getAccessToken(appid, appsecret).getAccessToken();
		//获取菜单结构
		Menu menu = wechatMenuManagerUtil.getMenu();
		if (accessToken!=null) {
			//生成菜单
			boolean result = wechatMenuUtil.creatMenu(menu, accessToken);
			if (result) {
				System.out.println("菜单创建成功");
			}else {
				System.out.println("菜单创建失败");
			}
		}else {
			System.out.println("token为空");
		}	
	}
}
