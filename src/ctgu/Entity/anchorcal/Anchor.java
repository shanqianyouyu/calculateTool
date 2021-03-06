package ctgu.Entity.anchorcal;

import ctgu.awt.util.Tool;
import lombok.Data;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：地锚计算实体
 * 
 * @Package: ctgu.Entity.anchorcal
 * @author: 拉布拉多
 */
@Data
public class Anchor {
	/**
	 * 地锚锚体的强度计算 单点固定的圆木或钢管
	 */
	public Double o1; // 地锚锚体的弯曲应力
	public Double o2; // 地埋木或钢管的中心点最大弯矩
	public Double A1; // 地埋木或钢管单位长度上的载荷
	public Double A2;// 地埋木或钢管的长度
	public Double A3;// 地埋木或钢管的抗弯截面系数
//	public Double A4;// 地埋木的中部直径 ---
	public Double A5;// 锚体的容许弯曲应力

	public void part1() {
		o2 = A1 * A2 * A2 / 8;
		o1 = o2 / A3;
		o1 = Tool.forMat(o1);
		o2 = Tool.forMat(o2);
	}

	/**
	 * 抗拔力计算
	 */

	public Double o3;// 地锚的容许抗拔力
	public Double B1;// 地锚抗拔的土壤体积
	public Double B2;// 地锚的埋置深度
	public Double B3;// 土壤的计算抗拔角 查表
	public Double B4;// 土壤的密度 查表
	public Double B5;// 地锚受力方向与地面的夹角
	public Double B6 = 2.0;// 地锚抗拔安全系数 一般取2.0
	public Double B7;// 地埋木的中部直径 d
	public Double B8;// 地埋木或钢管的长度 l

	public void part2() {
		B1 = (B7 * B8 + (B7 + B8) * B2 * Math.tan(B3) + 4 / 3 * B2 * Math.pow(Math.tan(B3), 2)) * B2;
		o3 = 0.00981 * B1 * B4 / (B6 * Math.sin(B5));
		B1 = Tool.forMat(B1);
		o3 = Tool.forMat(o3);
	}

	/**
	 * 桩承受的力对桩体构成弯曲应力
	 */
	public Double o4;
	public Double C1;// 着力点与地面间的距离，m
	public Double C2;// 地面与最大弯矩处间的距离，m
	public Double C3;// 作用于桩锚上的拉力，N
	public Double C4;// 单根桩的抗弯截面系数，〖cm〗^3常用的角钢桩的W值为：<75×8，W_Y0=8.19〖cm〗^3;<80×8,W_Y0=9.46〖cm〗^3
	public Double C5;// Mmax

	public void part3() {
		C5 = C3 * (C1 + C2);
		o4 = C5 / C4;
		o4 = Tool.forMat(o4);
		C5 = Tool.forMat(C5);
	}

	/**
	 * 单桩容许承载力
	 */
	public Double o5;// 按土壤的允许的耐力计算单桩的容许承载力P
	public Double D1;// 土壤的允许耐压力，N/〖mm〗^2
	public Double D2;// 单桩地下部分的计算宽度，mm
	public Double D3;// 单桩打入地下的深度，mm
	public Double D4;// 随H/h变化的系数，一般取值为：H/h为0时，A为5；0.1时，A为6；0.2时A为7；0.3时，A为8；0.4时，A为9.

	public void part4() {
		o5 = D1 * D2 * D3 / D4;
		o5 = Tool.forMat(o5);
	}

}
