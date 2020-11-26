package ctgu.awt.frame.homepage.search.service;
/**   
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：frame与item实体的转换
 * @Package: ctgu.awt.frame.homepage.search.service 
 * @author: 拉布拉多   
 */

import java.util.ArrayList;
import java.util.List;
import ctgu.Entity.Across.AcrossEnity;
import ctgu.Entity.Square.SquareEnity;
import ctgu.Entity.anchorcal.Anchor;
import ctgu.Entity.boltCal.HighStrength;
import ctgu.Entity.weld.WeldEntity;
import ctgu.awt.frame.homepage.component.handlerlistener.ToolMenuHandlerListener;
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

			Object obj = null;
			if (item.getName().equals("螺栓计算")) {
				obj = new HighStrength();
			} else if (item.getName().equals("地锚计算")) {
				obj = new Anchor();
			} else if (item.getName().equals("跨越架计算")) {
				obj = new AcrossEnity();
			} else if (item.getName().equals("抱杆计算")) {
				obj = new SquareEnity();
			} else if (item.getName().equals("焊缝计算")) {
				obj = new WeldEntity();
			}
			d.setEditListener(new ToolMenuHandlerListener(item.getName(), AnalysisXML.domTOEntity(time, obj)));
			list.add(d);
		}
		return list;
	}

}
