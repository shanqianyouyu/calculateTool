package ctgu.awt.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import ctgu.Entity.boltCal.HighStrength;

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

	// 获取一个对象的所有变量以及值 将其封装在map里
	public static Map<String, Double> fieldToMap(Object object) {
		Map<String, Double> map = new HashMap<>();
		Class clazz = object.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			String fieldName = field.getName();
			String getMethod = "get" + fieldName.substring(0, 1).toUpperCase()
					+ fieldName.substring(1, fieldName.length());
			try {
				Double fieldValue = (Double) clazz.getMethod(getMethod).invoke(object);
				map.put(fieldName, fieldValue);
			} catch (ClassCastException e) {
				Double fieldValue = null;
				try {
					fieldValue = (double) ((Integer) clazz.getMethod(getMethod).invoke(object)).intValue();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (IllegalArgumentException e1) {
					e1.printStackTrace();
				} catch (InvocationTargetException e1) {
					e1.printStackTrace();
				} catch (NoSuchMethodException e1) {
					e1.printStackTrace();
				} catch (SecurityException e1) {
					e1.printStackTrace();
				}
				map.put(fieldName, fieldValue);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	@Test
	public void test() {
		Map<String, Double> map = Tool.fieldToMap(new HighStrength());

		for (Map.Entry<String, Double> entry : map.entrySet()) {

			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		}
	}
}
