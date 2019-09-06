package ctgu.awt.frame.homepage.search.entity;

import java.util.Map;

import lombok.Data;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：解析生成的一个dom结点
 * 
 * @Package: ctgu.awt.frame.homepage.search.Entity
 * @author: 拉布拉多
 */
@Data
public class Item {
	// year mouth day
	private String YMD;
	// hour minutes second
	private String MS;
	private String Name;
	private Map<String, Double> Dom;
}
