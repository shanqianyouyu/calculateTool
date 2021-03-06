package ctgu.awt.util;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.awt.util
 * @author: 拉布拉多
 */

public class ResponseCode {
	// 正确
	public static int OK = 100;

	/*
	 * 计算反馈
	 */
	// 参数不合法
	public static int DataERR = 101;
	// 数据不全
	public static int NoData = 102;
	// 计算抛出异常
	public static int CalculationERR = 103;
	// 全部为空
	public static int NULL = 200;
	// 检查异常
	public static int UnKnowERR = 301;
	//数字解析异常
	public static int NumParseExp= 301;

	/*
	 * xml相关
	 */
	// 生成错误
	public static int GenerateERR = 301;
	// 解析错误
	public static int ParseERR = 302;
	// 异常
	public static int ParseExp = 303;
}
