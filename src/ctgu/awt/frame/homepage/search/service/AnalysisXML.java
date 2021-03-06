package ctgu.awt.frame.homepage.search.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import ctgu.awt.frame.homepage.search.entity.Item;
import ctgu.awt.util.ResponseCode;
import ctgu.awt.util.Tool;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：解析xml文件 获取xml中存储的数据
 * 
 * @Package: ctgu.awt.frame.homepage.search.service
 * @author: 拉布拉多
 */

public class AnalysisXML {
	// Square.xml文件相对路径
	static String url = "./resources/Square.xml";
	static File file = new File(url);

	// 读取xml
	public static Item readXml() {
		Item item = new Item();
		// 解析Square.xml文件
		// 创建SAXReader的对象reader
		SAXReader reader = new SAXReader();
		try {
			// 通过reader对象的read方法加载Square.xml文件,获取docuemnt对象。
			Document document = reader.read(file);
			// 通过document对象获取根节点Frame
			Element frame = document.getRootElement();// Frame
			// 通过element对象的elementIterator方法获取迭代器
			Iterator it = frame.elementIterator();
			// 遍历迭代器，获取根节点中的信息（书籍）
			while (it.hasNext()) {
				// 获取Date结点
				Element date = (Element) it.next();
				// 获取Date的属性名以及 属性值
				List<Attribute> dateAttrs = date.attributes();
				for (Attribute attr : dateAttrs) {
					item.setYMD(attr.getValue());
//					System.out.println("属性名：" + attr.getName() + "--属性值：" + attr.getValue());
				}
				// 解析子节点的信息
				Iterator itt = date.elementIterator();
				while (itt.hasNext()) {
					Element bookChild = (Element) itt.next();
					Iterator ittt = bookChild.elementIterator();
//					System.out.println("节点名：" + bookChild.getName() + "--节点值："
//							+ ((Attribute) bookChild.attributes().get(0)).getValue());
					while (ittt.hasNext()) {
						Element e = (Element) ittt.next();
						System.out.println(e.getName() + "---" + e.getText());
					}
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return item;
	}

	// 获取一天的所有窗口 封装在List<Item>
	public static List<Item> getDayItem(Element element, String day) {
		List<Item> items = new ArrayList<>();
		Iterator it = element.elementIterator();
		while (it.hasNext()) {
			Item item = new Item();
			Element itt = (Element) it.next();
			item.setName(itt.getName());
			item.setYMD(day);
			item.setMS(((Attribute) itt.attributes().get(0)).getValue());
			Iterator iterator = itt.elementIterator();
			Map<String, Double> map = new HashMap<>();
			while (iterator.hasNext()) {
				Element e = (Element) iterator.next();
				map.put(e.getName(), Double.parseDouble(e.getText()));
			}
			item.setDom(map);
			items.add(item);
		}
		return items;
	}

	// 获取一天的窗口结点 <Date>
	public static Element getChildsItem(String day) {
		List<Item> items = new ArrayList<>();
		SAXReader reader = new SAXReader();
		Document document = null;
		try {
			document = reader.read(file);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		Element frame = document.getRootElement();// Frame
		Iterator it = frame.elementIterator();
		while (it.hasNext()) {
			Element date = (Element) it.next();
			if (((Attribute) date.attributes().get(0)).getValue().equals(day)) {
				return date;
			}
		}
		return null;
	}

	// 计算实体转换为可转为xml的对象item
	public static Item toItem(Object object) {
		Item item = new Item();
		String name = object.getClass().getSimpleName();
		
		if (name.equals("HighStrength")) {
			item.setName("螺栓计算");
		} else if (name.equals("Anchor")) {
			item.setName("地锚计算");
		} else if (name.equals("SquareEnity")) {
			item.setName("抱杆计算");
		} else if (name.equals("AcrossEnity")) {
			item.setName("跨越架计算");
		} else if (name.equals("SteelAnchor")) {
			item.setName("钢板地锚计算");
		} else if (name.equals("DrillAnchor")) {
			item.setName("地钻计算");
		} else if (name.equals("PileAnchor")) {
			item.setName("桩锚计算");
		} else if (name.equals("AnglePileAnchor")) {
			item.setName("角桩锚计算");
		}else if(name.equals("DerrickSquareEnity")) {
			item.setName("正方形格构抱杆计算");
		}else if(name.equals("DerrickSquareSteelEnity")) {
			item.setName("钢管抱杆计算");
		}else if(name.equals("SquareDerrickManCal")) {
			item.setName("人字抱杆计算");
		}else if(name.equals("WeldAngleEntity")) {
			item.setName("常用直角焊缝计算");
		}else if(name.equals("WeldSectionEntity")) {
			item.setName("工字形焊缝计算");
		}else if(name.equals("WeldObliqueEntity")) {
			item.setName("斜焊缝计算");
		}else if(name.equals("WeldButmentEntity")) {
			item.setName("对接焊缝计算");
		}else if(name.equals("Tool")) {
			item.setName("工器具计算");
		}else {
			System.out.println(name + " " + "找不到对应类型!");
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		item.setYMD(formatter.format(new Date()));
		formatter = new SimpleDateFormat("HHmmss");
		item.setMS(formatter.format(new Date()));
		item.setDom(Tool.fieldToMap(object));
		return item;
	}

	// item对象转xml
	public static void toXml(Item item) throws DocumentException, IOException {

		Document read = null;
		Element root = null;

		SAXReader reader = new SAXReader();
		read = reader.read(url);

		root = read.getRootElement();// Frame
		List<Element> elements = root.elements();// elements[0] Date
		Element element = null;
		for (Element e : elements) {
			List<Attribute> attributes = e.attributes();// 获取Date的属性集合
			String date = attributes.get(0).getValue();// 获取Date的属性date的值
			if (date.equals(item.getYMD())) {
				element = e;
			}

		}

		if (element == null) {
			element = root.addElement("Date");
			element.addAttribute("date", item.getYMD());
		}
		// 具体的什么类型
		Element first = element.addElement(item.getName());// Date
		first.addAttribute("date", item.getMS());
		// 二级
		for (Map.Entry<String, Double> entry : item.getDom().entrySet()) {
			Element second = first.addElement(entry.getKey());
			second.setText(entry.getValue() == null ? "0" : String.valueOf(entry.getValue()));
		}
		OutputFormat outputFormat = OutputFormat.createPrettyPrint();// 有换行
//		OutputFormat outputFormat = OutputFormat.createCompactFormat();// 无换行
		outputFormat.setEncoding("UTF-8");
		XMLWriter xmlWriter = new XMLWriter(new FileWriter(file), outputFormat);// 写入XML文件的位置 以及指定的格式
		xmlWriter.write(read);// 开始写入XML文件 写入Document对象
		xmlWriter.close();
		System.out.println("写入成功！");
	}

	// Frame中的实体转xml结点
	public static int frameToXMl(Object object) {
		Item item = AnalysisXML.toItem(object);
		try {
			AnalysisXML.toXml(item);
		} catch (DocumentException e) {
			return ResponseCode.GenerateERR;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseCode.OK;
	}

	// 删除一个结点
	public static int deleteDom(String time) {
		String t1 = time.substring(0, 8);
		String t2 = time.substring(8, 14);
		SAXReader reader = new SAXReader();
		Document document = null;
		try {
			document = reader.read(file);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		Element frame = document.getRootElement();// Frame
		Iterator it = frame.elementIterator();
		while (it.hasNext()) {
			Element date = (Element) it.next();
			String day = date.attribute(0).getValue();
			if (day.equals(t1)) {
				Iterator itt = date.elementIterator();
				while (itt.hasNext()) {
					Element e1 = (Element) itt.next();
					String minutes = (String) e1.attribute(0).getData();
					if (minutes.equals(t2)) {
						e1.detach();
						System.out.println("删除成功!");
						OutputFormat outputFormat = OutputFormat.createPrettyPrint();// 无换行
						outputFormat.setEncoding("UTF-8");
						XMLWriter xmlWriter = null;
						try {
							xmlWriter = new XMLWriter(new FileWriter(file), outputFormat);
							xmlWriter.write(document);
							xmlWriter.close();
						} catch (IOException e) {
							return ResponseCode.ParseExp;
						}
					}
				}
			}
		}
		return ResponseCode.OK;
	}

	// 删除全部节点
	public static int deleteAllDoms() {
		SAXReader reader = new SAXReader();
		Document document = null;
		try {
			document = reader.read(file);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		Element frame = document.getRootElement();// Frame
		Iterator it = frame.elementIterator();
		while (it.hasNext()) {
			Element e = (Element) it.next();
			e.detach();
			OutputFormat outputFormat = OutputFormat.createPrettyPrint();// 无换行
			outputFormat.setEncoding("UTF-8");
			XMLWriter xmlWriter = null;
			try {
				xmlWriter = new XMLWriter(new FileWriter(file), outputFormat);
				xmlWriter.write(document);
				xmlWriter.close();
			} catch (IOException e1) {
				return ResponseCode.ParseExp;
			}
		}

		return ResponseCode.OK;
	}

	// xml逆向生成Item
	public static Item domToItem(String time) {
		Item item = new Item();
		String t1 = time.substring(0, 8);
		String t2 = time.substring(8, 14);
		item.setMS(t2);
		item.setYMD(t1);
		SAXReader reader = new SAXReader();
		Document document = null;
		try {
			document = reader.read(file);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		Element frame = document.getRootElement();// Frame
		Iterator it = frame.elementIterator();
		while (it.hasNext()) {
			Element date = (Element) it.next();
			String day = date.attribute(0).getValue();
			if (day.equals(t1)) {
				Iterator itt = date.elementIterator();
				while (itt.hasNext()) {
					Element e1 = (Element) itt.next();
					String minutes = (String) e1.attribute(0).getData();
					if (minutes.equals(t2)) {
						item.setName(e1.getName());
						Iterator iterator = e1.elementIterator();
						Map<String, Double> map = new HashMap<>();
						while (iterator.hasNext()) {
							Element element = (Element) iterator.next();
							map.put(element.getName(), Double.parseDouble(element.getText()));
						}
						item.setDom(map);
					}
				}
			}
		}
		return item;
	}

	public static <T> T ItemtoEntity(final Class<?> clazz, Map<String, Double> params) throws Exception {
		// 实例化
		T object = (T) clazz.newInstance();
		// 获取clazz的数据类型
		// 获取map的所有key值
		Set<String> keys = params.keySet();
		for (String key : keys) {
			Double value = (Double) params.get(key);
			// 获取字段
			Field field = clazz.getDeclaredField(key);
			if (field != null) {
				// 设置权限
				field.setAccessible(true);
				//
				String fieldType = field.getType().getTypeName();
				if ("java.lang.Integer".equals(fieldType)) {
					field.set(object, Integer.valueOf((int) Math.round(value)));
				} else {
					field.set(object, value);
				}
			}
		}
		return object;
	}

	public static <T> T domTOEntity(String time, T obj) {
		try {
			obj = AnalysisXML.ItemtoEntity(obj.getClass(), AnalysisXML.domToItem(time).getDom());
		} catch (Exception e) {
			return null;
		}
		return obj;
	}

	@Test
	public void test1() {
		System.out.println(readXml());
	}

	@Test
	public void test2() {
		System.out.println(deleteAllDoms());
	}
}
