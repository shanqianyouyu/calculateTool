package ctgu.awt.util;

import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JTextField;

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

	// t1失去聚焦的时候，将1的内容同步到2
	public static void syncItem(JTextField t1, JTextField t2) {
		t1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if (!t1.getText().equals(t2.getText())) {
					t2.setText(t1.getText());
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
	}

	/**
	 * 返回一个图片
	 * 
	 * @param path   图片路径
	 * @param width  宽度
	 * @param height 高度
	 * @return
	 */
	public static ImageIcon getImageIcon(String path, int width, int height) {
		ImageIcon imageIcon = new ImageIcon(path);
		Image img = imageIcon.getImage();
		img = img.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		imageIcon.setImage(img);
		return imageIcon;
	}

	public static long getFileLength(String s) {
		File f = new File(s);
		if (f.exists() && f.isFile()) {
			return f.length();
		} else {
			return 0;
		}

	}

	@Test
	public void test1() {
		String path = "./src/Square.xml";
		System.out.println(Tool.getFileLength(path));
	}

}
