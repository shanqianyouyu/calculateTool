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

import ctgu.Entity.SquareDerrickManCal;
import ctgu.Entity.Across.AcrossEnity;
import ctgu.Entity.Square.DerrickSquareEnity;
import ctgu.Entity.Square.DerrickSquareSteelEnity;
import ctgu.Entity.Square.SquareEnity;
import ctgu.Entity.anchorcal.Anchor;
import ctgu.Entity.anchorcal.AnglePileAnchor;
import ctgu.Entity.anchorcal.DrillItem;
import ctgu.Entity.anchorcal.PileAnchor;
import ctgu.Entity.anchorcal.SteelAnchor;
import ctgu.Entity.boltCal.HighStrength;
import ctgu.Entity.tool.Tool;
import ctgu.Entity.weld.WeldAngleEntity;
import ctgu.Entity.weld.WeldButmentEntity;
import ctgu.Entity.weld.WeldEntity;
import ctgu.Entity.weld.WeldObliqueEntity;
import ctgu.Entity.weld.WeldSectionEntity;
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
			} else if (item.getName().equals("钢板地锚计算")) {
				obj = new SteelAnchor();
			} else if (item.getName().equals("角桩锚计算")) {
				obj = new AnglePileAnchor();
			} else if (item.getName().equals("地钻计算")) {
				obj = new DrillItem();
			} else if (item.getName().equals("桩锚计算")) {
				obj = new PileAnchor();
			}else if (item.getName().equals("正方形格构抱杆计算")) {
				obj = new DerrickSquareEnity();
			}else if (item.getName().equals("钢管抱杆计算")) {
				obj = new DerrickSquareSteelEnity();
			}else if (item.getName().equals("人字抱杆计算")) {
				obj = new SquareDerrickManCal();
			}else if (item.getName().equals("工器具计算")) {
				obj = new Tool();
			}else if (item.getName().equals("常用直角焊缝计算")) {
				obj = new WeldAngleEntity();
			}else if (item.getName().equals("工字形焊缝计算")) {
				obj = new WeldSectionEntity();
			} else if (item.getName().equals("斜焊缝计算")) {
				obj = new WeldObliqueEntity();
			} else if (item.getName().equals("对接焊缝计算")) {
				obj = new WeldButmentEntity();
			} 
			d.setEditListener(new ToolMenuHandlerListener(item.getName(), AnalysisXML.domTOEntity(time, obj)));
			list.add(d);
		}
		return list;
	}

}
