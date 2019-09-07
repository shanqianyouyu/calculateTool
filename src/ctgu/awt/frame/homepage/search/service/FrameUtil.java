package ctgu.awt.frame.homepage.search.service;
/**   
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：frame与item实体的转换
 * @Package: ctgu.awt.frame.homepage.search.service 
 * @author: 拉布拉多   
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ctgu.awt.frame.homepage.search.entity.Item;
import ctgu.awt.frame.homepage.search.frame.item.Default;

public class FrameUtil {
	/**
	 * Item实体转Defult Frame
	 * 
	 * @param items
	 * @return
	 */
	public static List<Default> itemsToFrames(List<Item> items) {
		List<Default> list = new ArrayList<Default>();
		for (Item item : items) {
			String time = item.getYMD() + item.getMS();
			Default d = new Default();
			d.setTime(time);
			d.setId(item.getMS());
			d.setName(item.getName());
			list.add(d);
		}
		return list;
	}
}
