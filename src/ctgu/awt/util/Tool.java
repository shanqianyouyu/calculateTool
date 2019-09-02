package ctgu.awt.util;

import java.awt.Component;
import java.text.DecimalFormat;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.util
 * @author: 拉布拉多
 */

public class Tool {

	// 保留两位小数
	public static Double forMat(Double b) {
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.parseDouble(df.format(b));
	}

	// 获取内容的文字长度
	public static int getTextLength(String s) {
		return s.trim().length();
	}
}
