package ctgu.awt.util;

import java.awt.Image;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import org.junit.Test;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.util
 * @author: 拉布拉多
 */

public class Tool {

	/**
	 * 判断输入框的数字格式是否正确
	 * 
	 * @param vis       是否全部大于等于0
	 * @param textField 输入框
	 * @return ResponseCode.OK 数据正常 ResponseCode.NoData 数据不全 ResponseCode.DataERR
	 *         数字错误 ResponseCode.NumParseExp 数字解析异常 ResponseCode.UnKnowERR 未知错误
	 */
	public static int checkTextFiled(Boolean vis, JTextField... textField) {
		try {
			for (JTextField item : textField) {
				if (null == item.getText() || item.getText().trim().length() == 0) {
					return ResponseCode.NoData;
				}
				if (Double.valueOf(item.getText().trim()) < 0.0 && vis) {// 必须全部未非负数并且有负数
					return ResponseCode.DataERR;// 数字错误
				}
			}

		} catch (NumberFormatException e) {
			return ResponseCode.NumParseExp;// 解析异常,数字格式不正确
		} catch (Exception e) {
			return ResponseCode.UnKnowERR;// 未知错误
		}
		return ResponseCode.OK;
	}

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

	/**
	 * 输入求得x，y （有且仅有一值为空） 已知两点 (x1, y1)(x2,y2)
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x
	 * @param y
	 * @return x为空则返回y，y为空则返回x
	 */
	public static BigDecimal getPointWithPoints(BigDecimal x1, BigDecimal y1, BigDecimal x2, BigDecimal y2,
			BigDecimal x, BigDecimal y) {
		if (null == x) {
			return getXWithTwoPoints(x1, y1, x2, y2, y);
		} else if (null == y) {
			return getYWithTwoPoints(x1, y1, x2, y2, x);
		}
		return null;
	}

	/**
	 * 给出两点求x，线性拟合
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x
	 * @return
	 */
	public static BigDecimal getYWithTwoPoints(BigDecimal x1, BigDecimal y1, BigDecimal x2, BigDecimal y2,
			BigDecimal x) {
		// x1 != x2
		BigDecimal tmp = y1.subtract(y2).divide(x1.subtract(x2)).multiply(x1.subtract(x));

		return y1.subtract(tmp);
	}

	public static BigDecimal getXWithTwoPoints(BigDecimal x1, BigDecimal y1, BigDecimal x2, BigDecimal y2,
			BigDecimal y) {
		BigDecimal tmp = x1.subtract(x2).divide(y1.subtract(y2)).multiply(y.subtract(y1)).add(x1);
		return tmp;
	}

	/**
	 * 设置图片 JLabel的icon
	 * 
	 * @param url    图片地址
	 * @param width
	 * @param height
	 * @return
	 */
	public static Icon getIcon(String url, int width, int height) {
		Icon icon = new ImageIcon(url);
		Image image = ((ImageIcon) icon).getImage();
		image = image.getScaledInstance(width, height, Image.SCALE_DEFAULT);// 缩放图片大小
		((ImageIcon) icon).setImage(image);
		return icon;
	}
}
