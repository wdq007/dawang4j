package com.wechat.weixin.util;
 
import com.wechat.weixin.menu.Button;
import com.wechat.weixin.menu.ClickButton;
import com.wechat.weixin.menu.Menu;
import com.wechat.weixin.menu.ViewButton;
 
/**
 * @Description: 菜单管理器类
 * @Parameters: 
 * @Return: 
 * @Create Date: 2018年9月28日下午4:33:24
 * @Version: V1.00
 * @author: 来日可期
 */
public class WechatMenuManagerUtil {
	/**
	 * @Description: 定义菜单结构
	 * @Parameters: 
	 * @Return: 
	 * @Create Date: 2018年9月28日下午5:36:08
	 * @Version: V1.00
	 * @author: 来日可期
	 */
	public Menu getMenu(){
		ClickButton firstClickButton = new ClickButton();
		firstClickButton.setName("功能图文");
		firstClickButton.setKey("function");
		firstClickButton.setType("click");
		
		ViewButton firstViewButton = new ViewButton();
		firstViewButton.setName("联系我们");
		firstViewButton.setType("view");
		firstViewButton.setUrl("");
		
		Menu menu = new Menu();
		Button[] boButtons = {firstClickButton,firstViewButton};
		menu.setButton(boButtons);
		
		return menu;
	}
}